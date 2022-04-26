package co.music.musicnow.Aplicacion.Servicio.Musico;


import co.music.musicnow.Aplicacion.Dto.DtoMusico;
import co.music.musicnow.Aplicacion.Dto.DtoRespuesta;
import co.music.musicnow.Dominio.Modelo.Musico;
import co.music.musicnow.Dominio.Servicio.Musico.ServicioGuardarMusico;
import org.springframework.stereotype.Component;


//¿?
@Component
public class ServicioAplicacionGuardarMusico {

    private final ServicioGuardarMusico servicioGuardarMusico;

    public ServicioAplicacionGuardarMusico (ServicioGuardarMusico servicioGuardarMusico){
        this.servicioGuardarMusico = servicioGuardarMusico;
    }

    public DtoRespuesta <Long> ejecutar (DtoMusico dto){
        Musico musico = Musico.of(dto.getPrimerNombre(), dto.getSegundoNombre(),dto.getPrimerApellido(), dto.getSegundoApellido());
        return new DtoRespuesta <>(this.servicioGuardarMusico.ejecutar(musico));
    }

}

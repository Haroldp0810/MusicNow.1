package co.music.musicnow.Aplicacion.Servicio.Musico;

import co.music.musicnow.Aplicacion.Dto.DtoRespuesta;
import org.springframework.stereotype.Component;


@Component
public class ServicioAplicacionEliminarMusico {

    private final ServicioAplicacionEliminarMusico servicioAplicacionEliminarMusico;

    public ServicioAplicacionEliminarMusico (ServicioAplicacionEliminarMusico servicioAplicacionEliminarMusico) {
        this.servicioAplicacionEliminarMusico = servicioAplicacionEliminarMusico;
    }

    public DtoRespuesta<Boolean>  ejecutar(Long id){
        return new DtoRespuesta <>(this.servicioAplicacionEliminarMusico.ejecutar(id));
    }
}

package co.music.musicnow.Aplicacion.Servicio.Genero;

import co.music.musicnow.Aplicacion.Dto.DtoGenero;
import co.music.musicnow.Aplicacion.Dto.DtoMusico;
import co.music.musicnow.Aplicacion.Dto.DtoRespuesta;
import co.music.musicnow.Dominio.Modelo.Genero;
import co.music.musicnow.Dominio.Modelo.Musico;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarGenero {
    private final ServicioAplicacionGuardarGenero servicioAplicacionActualizarGenero;

    public ServicioAplicacionGuardarGenero (ServicioAplicacionGuardarGenero servicioAplicacionGuardarGenero){
        this.servicioAplicacionActualizarGenero = servicioAplicacionGuardarGenero;
    }

    public DtoRespuesta<Long> ejecutar (DtoGenero dtoGenero){
        Genero  genero = Genero.of(dtoGenero.getNombreGenero());
        return new DtoRespuesta<>(this.servicioAplicacionActualizarGenero.ejecutar(genero));
    }
}

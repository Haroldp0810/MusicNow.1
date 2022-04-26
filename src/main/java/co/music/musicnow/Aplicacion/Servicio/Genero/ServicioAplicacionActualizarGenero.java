package co.music.musicnow.Aplicacion.Servicio.Genero;

import co.music.musicnow.Aplicacion.Dto.DtoGenero;
import co.music.musicnow.Aplicacion.Dto.DtoRespuesta;
import co.music.musicnow.Dominio.Modelo.Genero;

public class ServicioAplicacionActualizarGenero {

    private final ServicioAplicacionActualizarGenero servicioAplicacionActualizarGenero;

    public  ServicioAplicacionActualizarGenero(ServicioAplicacionActualizarGenero servicioAplicacionActualizarGenero){
        this.servicioAplicacionActualizarGenero = servicioAplicacionActualizarGenero;

    }

    public DtoRespuesta <Boolean> ejecutar(DtoGenero dtoGenero){
        Genero genero = Genero.of(dtoGenero.getNombreGenero());
        return new DtoRespuesta<>(this.servicioAplicacionActualizarGenero);
    }
}

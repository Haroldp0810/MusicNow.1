package co.music.musicnow.Aplicacion.Servicio.Genero;

import co.music.musicnow.Aplicacion.Dto.DtoRespuesta;

public class ServicioAplicacionEliminarGenero {

    private final ServicioAplicacionEliminarGenero servicioAplicacionEliminarGenero;

    public ServicioAplicacionEliminarGenero (ServicioAplicacionEliminarGenero servicioAplicacionEliminarGenero){
        this.servicioAplicacionEliminarGenero = servicioAplicacionEliminarGenero;
    }

    public DtoRespuesta <Boolean> ejecutar(Long id, String nombre){
        return new DtoRespuesta<>(this.servicioAplicacionEliminarGenero.ejecutar(id, nombre));
    }
}

package co.music.musicnow.Aplicacion.Servicio.Musico;

import co.music.musicnow.Aplicacion.Dto.DtoMusico;
import co.music.musicnow.Aplicacion.Dto.DtoRespuesta;
import co.music.musicnow.Dominio.Modelo.Musico;

public class ServicioAplicacionActualizarMusico {

    private final ServicioAplicacionActualizarMusico servicioAplicacionActualizarMusico;

    public ServicioAplicacionActualizarMusico(ServicioAplicacionActualizarMusico servicioAplicacionActualizarMusico){
        this.servicioAplicacionActualizarMusico =servicioAplicacionActualizarMusico;
    }

    public DtoRespuesta <Boolean> ejecutar(Long id, DtoMusico dtoMusico){
        Musico musico = Musico.of(dtoMusico.getPrimerNombre(), dtoMusico.getSegundoNombre(), dtoMusico.getPrimerApellido(), dtoMusico.getSegundoApellido());
        return new DtoRespuesta<>(this.servicioAplicacionActualizarMusico.ejecutar(id, dtoMusico));
    }
}

package co.music.musicnow.Dominio.Puerto;

import co.music.musicnow.Dominio.Modelo.Musico;

import java.util.List;

public interface RepositorioMusico {

    List<Musico> listar();
    Musico  consultarPorId(Long id);
    Long guardar(Musico musico);
    boolean existe (Musico musico);
    Boolean eliminar (Long id);
    Boolean Actualizar (Long id, Musico musico);
}

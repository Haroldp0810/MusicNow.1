package co.music.musicnow.Dominio.Puerto;

import co.music.musicnow.Dominio.Modelo.Genero;

import java.util.List;

public interface RepositorioGenero {
    List<Genero> listar();
    Genero consultarPorId(Long id);
    Long guardar (Genero genero);
    boolean existe (Genero genero);
    Boolean eliminar (Long id);
    Boolean actualizar (Long id, Genero genero);
}

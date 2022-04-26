package co.music.musicnow.Aplicacion.Servicio.Genero;

import co.music.musicnow.Dominio.Modelo.Genero;
import co.music.musicnow.Dominio.Puerto.RepositorioGenero;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarGenero {
    private final RepositorioGenero repositorioGenero;

    public ServicioAplicacionListarGenero(RepositorioGenero repositorioGenero){
        this.repositorioGenero = repositorioGenero;
    }

    public List<Genero> ejecutar(){
        return  repositorioGenero.listar();
    }

}

package co.music.musicnow.Aplicacion.Servicio.Musico;

import co.music.musicnow.Dominio.Modelo.Musico;
import co.music.musicnow.Dominio.Puerto.RepositorioMusico;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionListarMusico {

    private final RepositorioMusico repositorioMusico;

    public ServicioAplicacionListarMusico (RepositorioMusico repositorioMusico){
        this.repositorioMusico = repositorioMusico;
    }

    public List <Musico> ejecutar () {
        return  repositorioMusico.listar();
    }
}

package co.music.musicnow.Dominio.Servicio.Musico;

import co.music.musicnow.Dominio.Modelo.Musico;
import co.music.musicnow.Dominio.Puerto.RepositorioMusico;

public class ServicioGuardarMusico {

    private static final String MENSAJE = "Ya existe el musico con los datos guardados";

    private  final RepositorioMusico repositorioMusico;

    public  ServicioGuardarMusico (RepositorioMusico repositorioMusico){
        this.repositorioMusico = repositorioMusico;
    }

    public  Long ejecutar (Musico musico){
        if (this.repositorioMusico.existe(musico)){
            throw new IllegalStateException(MENSAJE);
        }
        return this.repositorioMusico.guardar(musico);
    }
}

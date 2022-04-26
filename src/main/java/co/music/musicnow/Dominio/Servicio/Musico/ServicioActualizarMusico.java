package co.music.musicnow.Dominio.Servicio.Musico;

import co.music.musicnow.Dominio.Modelo.Musico;
import co.music.musicnow.Dominio.Puerto.RepositorioMusico;
import org.springframework.stereotype.Service;

@Service
public class ServicioActualizarMusico {

    private static final String MUSICO_ACTUALIZADO = "NO SE ENCONTRO EL MUSICO O NO EXISTE";

    private final RepositorioMusico repositorioMusico;

    public  ServicioActualizarMusico (RepositorioMusico repositorioMusico)
    {
        this.repositorioMusico = repositorioMusico;
    }

    public  Boolean ejecutar(Long id, Musico musico){
        if(repositorioMusico.consultarPorId(id) != null){
            return this.repositorioMusico.Actualizar(id, musico);

        }else {
            throw new IllegalStateException(MUSICO_ACTUALIZADO);
        }
    }
}

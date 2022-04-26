package co.music.musicnow.Dominio.Servicio.Musico;

import co.music.musicnow.Dominio.Puerto.RepositorioMusico;

public class ServcioElminarMusico {

    private final RepositorioMusico repositorioMusico;

    public ServcioElminarMusico(RepositorioMusico repositorioMusico) {
        this.repositorioMusico = repositorioMusico;
    }

    public Boolean ejectuar(Long id) {
        if (repositorioMusico.consultarPorId(id) != null) {
            return this.repositorioMusico.eliminar(id);
        } else
            throw new IllegalStateException();
    }
}
// Se puede?
//   return = repositorioMusico.consultarPorId(id)  != null  ? this.repositorioMusico.eliminar(id)  : throw new IllegalStateException();




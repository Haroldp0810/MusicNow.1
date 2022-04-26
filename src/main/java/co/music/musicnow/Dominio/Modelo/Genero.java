package co.music.musicnow.Dominio.Modelo;

public class Genero {

    private final int id;
    private final String nombreGenero;

    public Genero (String nombreGenero, int id){
        this.nombreGenero = nombreGenero;
        this.id = id;
    }

    public static Genero of(String nombreGenero){
        validarObligatorio(nombreGenero, "El genero no puede estar vacio");
        validarObligatorio(String.valueOf(id), "El id no puede quedar vacio");

        return new Genero(nombreGenero, id);
    }

    private static void validarObligatorio (String valor, String mensaje){
        if (valor == null || valor.isBlank()){
            throw new IllegalArgumentException(mensaje);
        }
    }

    public int getId() {
        return id;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }
}



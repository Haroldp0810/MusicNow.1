package co.music.musicnow.Dominio.Modelo;

public class Musico {
    private final  String primerNombre;
    private final String segundoNombre;
    private final  String primerApellido;
    private final  String segundoApellido;

    public Musico(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public static Musico of (String primerNombre, String segundoNombre, String primerApellido, String segundoApellido ){

        validarObligatorio(primerNombre, "El primer nombre no puede ser vacio");
        validarObligatorio(segundoNombre,"El segundo nombre no puede ser vacio");
        validarObligatorio(primerApellido, "El primer apellido no puede ser vacio");
        validarObligatorio(segundoApellido, "El seguno apellido no puede ser vacio");

        return new Musico(primerNombre, segundoNombre, primerApellido, segundoApellido);
    }

    // isblank() = comprueba si el texto contiene solo caracteres de espacio en blanco.
    private static void validarObligatorio(String valor, String mensaje) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }


}





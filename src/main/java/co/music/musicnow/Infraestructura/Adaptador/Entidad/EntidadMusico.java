package co.music.musicnow.Infraestructura.Adaptador.Entidad;


import javax.persistence.*;

@Entity
@Table(name = "musico")
public class EntidadMusico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nombre;
    private  String apellido;

    public EntidadMusico (){}
}

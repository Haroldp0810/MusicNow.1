package co.music.musicnow.Aplicacion.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class DtoPlanCompra {
    private String nombre;
    private String descripcion;
    private Date fecha;
}

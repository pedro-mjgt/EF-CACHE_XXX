package pe.edu.cibertec.DSWII_EF_CACHE_XXX.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tratamiento")
public class Tratamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtratamiento;

    private String descripcion;
    private Double costo;
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cita cita;

}

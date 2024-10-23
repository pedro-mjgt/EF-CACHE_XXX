package pe.edu.cibertec.DSWII_EF_CACHE_XXX.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "cita")
public class Cita {

    private Integer idcita;
    private Integer idmascota;
    private Integer idveterinario;
    private Date fecha;
    private String motivo;

}

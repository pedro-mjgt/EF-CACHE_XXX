package pe.edu.cibertec.DSWII_EF_CACHE_XXX.service;

import pe.edu.cibertec.DSWII_EF_CACHE_XXX.model.Tratamiento;

import java.util.Date;
import java.util.List;

public interface ITratamientoService {

    List<Tratamiento> obtenerTratamientosPorRangoFechas(Date fechaInicio, Date fechaFin);

}

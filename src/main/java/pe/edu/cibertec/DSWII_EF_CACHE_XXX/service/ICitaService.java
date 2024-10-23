package pe.edu.cibertec.DSWII_EF_CACHE_XXX.service;

import pe.edu.cibertec.DSWII_EF_CACHE_XXX.model.Cita;

import java.util.List;

public interface ICitaService {

    List<Cita> obtenerHistorialCitasPorVeterinario(int idveterinario);
    List<Cita> obtenerResumenCitasAnual(int anio);

}

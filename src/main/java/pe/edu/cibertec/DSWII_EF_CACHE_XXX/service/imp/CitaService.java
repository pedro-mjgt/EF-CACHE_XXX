package pe.edu.cibertec.DSWII_EF_CACHE_XXX.service.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_XXX.model.Cita;
import pe.edu.cibertec.DSWII_EF_CACHE_XXX.repository.CitaRepository;
import pe.edu.cibertec.DSWII_EF_CACHE_XXX.service.ICitaService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CitaService implements ICitaService {

    private final CitaRepository citaRepository;

    @Cacheable(value = "historialCitasVeterinario", key = "#idveterinario")
    @Override
    public List<Cita> obtenerHistorialCitasPorVeterinario(int idveterinario) {
        return citaRepository.obtenerCitasPorVeterinario(idveterinario);
    }

    @Cacheable(value = "resumenCitasAnual", key = "#anio")
    @Override
    public List<Cita> obtenerResumenCitasAnual(int anio) {
        return citaRepository.obtenerCitasPorAnio(anio);
    }

}

package pe.edu.cibertec.DSWII_EF_CACHE_XXX.service.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_CACHE_XXX.model.Tratamiento;
import pe.edu.cibertec.DSWII_EF_CACHE_XXX.repository.TratamientoRepository;
import pe.edu.cibertec.DSWII_EF_CACHE_XXX.service.ITratamientoService;

import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TratamientoService implements ITratamientoService {

    private final TratamientoRepository tratamientoRepository;

    @Cacheable(value = "tratamientosRangoFechas", key = "{#fechaInicio, #fechaFin}")
    @Override
    public List<Tratamiento> obtenerTratamientosPorRangoFechas(Date fechaInicio, Date fechaFin) {
        return tratamientoRepository.obtenerTratamientosEntreFechas(fechaInicio, fechaFin);
    }

}

package pe.edu.cibertec.DSWII_EF_CACHE_XXX.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_CACHE_XXX.model.Tratamiento;

import java.util.Date;
import java.util.List;

@Repository
public interface TratamientoRepository extends JpaRepository<Tratamiento, Integer> {

    @Query(value = "select * from tratamiento where fecha between :fechaInicio and :fechaFin",
            nativeQuery = true)
    List<Tratamiento> obtenerTratamientosEntreFechas(
            @Param("fechaInicio")Date fechaInicio,
            @Param("fechaFin") Date fechaFin);

}

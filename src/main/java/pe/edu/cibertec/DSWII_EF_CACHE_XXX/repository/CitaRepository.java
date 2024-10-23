package pe.edu.cibertec.DSWII_EF_CACHE_XXX.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_CACHE_XXX.model.Cita;

import java.util.List;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Integer> {

    @Query(value = "select * from cita where idveterinario = :idveterinario",
            nativeQuery = true)
    List<Cita> obtenerCitasPorVeterinario(@Param("idveterinario") int idveterinario);

    @Query(value = "select * from cita where year(fecha) = :anio",
            nativeQuery = true)
    List<Cita> obtenerCitasPorAnio(@Param("anio") int anio);

}

package br.gov.sp.cps.api.poc.dash.outbound.jpa;

import br.gov.sp.cps.api.poc.dash.core.domain.dto.projection.ComboboxProjection;
import br.gov.sp.cps.api.poc.dash.core.domain.entity.FatoEntrevista;
import br.gov.sp.cps.api.poc.dash.core.domain.repository.FiltroRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FiltroJpaRepository extends JpaRepository<FatoEntrevista, Long>, FiltroRepository {

    @Query(value = "SELECT table_name AS nome, " +
            "CONCAT('Gerenciamento ', REPLACE(table_name, 'fato_', '')) AS alias, " +
            "array_to_string(array_agg(column_name), ',') AS campos " +
            "FROM information_schema.columns " +
            "WHERE table_schema = 'public' " +
            "AND table_name LIKE 'fato%' " +
            "AND column_name NOT LIKE 'id%' " +
            "GROUP BY table_name " +
            "ORDER BY table_name",
            nativeQuery = true)
    List<ComboboxProjection> findFatos();

}

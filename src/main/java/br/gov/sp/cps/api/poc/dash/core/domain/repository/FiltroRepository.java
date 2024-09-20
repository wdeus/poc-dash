package br.gov.sp.cps.api.poc.dash.core.domain.repository;

import br.gov.sp.cps.api.poc.dash.core.domain.dto.Combobox;
import br.gov.sp.cps.api.poc.dash.core.domain.dto.projection.ComboboxProjection;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface FiltroRepository {

    List<ComboboxProjection> findFatos();
}

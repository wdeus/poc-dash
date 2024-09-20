package br.gov.sp.cps.api.poc.dash.core.domain.dto.projection;

import java.util.List;

public interface ComboboxProjection {

    String getNome();
    String getAlias();
    List<String> getCampos();
}

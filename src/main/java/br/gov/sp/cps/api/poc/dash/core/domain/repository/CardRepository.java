package br.gov.sp.cps.api.poc.dash.core.domain.repository;

import br.gov.sp.cps.api.poc.dash.core.domain.dto.command.VisualizarCardCommand;

import java.util.List;

public interface CardRepository {

    List<?> getCard(VisualizarCardCommand command);

}

package br.gov.sp.cps.api.poc.dash.core.domain.repository;

import br.gov.sp.cps.api.poc.dash.core.domain.dto.command.VisualizarGraficoCommand;

import java.util.List;

public interface GraficoRepository {

    List<?> getGrafico(VisualizarGraficoCommand command);
}

package br.gov.sp.cps.api.poc.dash.core.domain.dto.command;

import br.gov.sp.cps.api.poc.dash.core.domain.dto.Eixo;
import lombok.Data;

@Data
public class VisualizarGraficoCommand extends VisualizarCardCommand{

    private Eixo eixoY;
}

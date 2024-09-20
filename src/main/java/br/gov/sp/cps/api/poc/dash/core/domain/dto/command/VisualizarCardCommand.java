package br.gov.sp.cps.api.poc.dash.core.domain.dto.command;

import br.gov.sp.cps.api.poc.dash.core.domain.dto.Eixo;
import br.gov.sp.cps.api.poc.dash.core.domain.dto.Filtro;
import lombok.Data;

import java.util.List;

@Data
public class VisualizarCardCommand {

    private Eixo eixoX;
    private List<Filtro> filtros;
}

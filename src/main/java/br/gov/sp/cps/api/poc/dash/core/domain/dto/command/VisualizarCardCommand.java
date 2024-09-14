package br.gov.sp.cps.api.poc.dash.core.domain.dto.command;

import br.gov.sp.cps.api.poc.dash.core.domain.dto.EixoX;
import br.gov.sp.cps.api.poc.dash.core.domain.dto.Filtro;
import lombok.Data;

import java.util.List;

@Data
public class VisualizarCardCommand {

    public EixoX eixoX;
    public List<Filtro> filtros;
}

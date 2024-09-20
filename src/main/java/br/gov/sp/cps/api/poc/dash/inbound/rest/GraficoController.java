package br.gov.sp.cps.api.poc.dash.inbound.rest;

import br.gov.sp.cps.api.poc.dash.core.domain.dto.command.VisualizarGraficoCommand;
import br.gov.sp.cps.api.poc.dash.core.usecase.VisualizarGraficoUC;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("visualizacao/grafico")
@RequiredArgsConstructor
public class GraficoController {

    private final VisualizarGraficoUC visualizarGraficoUC;

    @PostMapping
    public List<?> filtrar(@RequestBody VisualizarGraficoCommand command){
        return visualizarGraficoUC.executar(command);
    }
}

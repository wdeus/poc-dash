package br.gov.sp.cps.api.poc.dash.core.usecase;

import br.gov.sp.cps.api.poc.dash.core.domain.dto.command.VisualizarGraficoCommand;
import br.gov.sp.cps.api.poc.dash.core.domain.repository.GraficoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisualizarGraficoUC {

    private final GraficoRepository graficoRepository;

    public List<?> executar(VisualizarGraficoCommand command){
        return graficoRepository.getGrafico(command);
    }
}

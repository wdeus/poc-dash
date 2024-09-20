package br.gov.sp.cps.api.poc.dash.core.usecase;

import br.gov.sp.cps.api.poc.dash.core.domain.dto.Filtro;
import br.gov.sp.cps.api.poc.dash.core.domain.dto.command.VisualizarCardCommand;
import br.gov.sp.cps.api.poc.dash.core.domain.repository.CardRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisualizarCardUC {

    private final CardRepository cardRepository;

    public List<?> executar(VisualizarCardCommand command){
        return cardRepository.getCard(command);
    }
}

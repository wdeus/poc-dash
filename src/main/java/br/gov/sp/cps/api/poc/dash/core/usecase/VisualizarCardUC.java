package br.gov.sp.cps.api.poc.dash.core.usecase;

import br.gov.sp.cps.api.poc.dash.core.domain.dto.Filtro;
import br.gov.sp.cps.api.poc.dash.core.domain.dto.command.VisualizarCardCommand;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisualizarCardUC {

    private final EntityManager entityManager;

    public List<?> executar(VisualizarCardCommand command){
        StringBuilder queryBuilder = new StringBuilder("SELECT ");
        queryBuilder.append(command.getEixoX().getCampo())
                .append(" FROM ")
                .append(command.getEixoX().getNome());

        for (Filtro filtro : command.getFiltros()) {
            queryBuilder.append(" JOIN ")
                    .append(filtro.getNome())
                    .append(" ON ")
                    .append(command.getEixoX().getNome())
                    .append(".id_")
                    .append(filtro.getNome())
                    .append(" = ")
                    .append(filtro.getNome())
                    .append(".id_")
                    .append(filtro.getNome());
        }

        if (!command.getFiltros().isEmpty()) {
            queryBuilder.append(" WHERE ");
            for (int i = 0; i < command.getFiltros().size(); i++) {
                Filtro filtro = command.getFiltros().get(i);
                queryBuilder.append(filtro.getNome())
                        .append(".")
                        .append(filtro.getCampo())
                        .append(" ")
                        .append(filtro.getComparador())
                        .append(" '")
                        .append(filtro.getValor())
                        .append("'");
                if (i < command.getFiltros().size() - 1) {
                    queryBuilder.append(" AND ");
                }
            }
        }
        System.out.println("Query gerada: " + queryBuilder.toString());

        Query query = entityManager.createNativeQuery(queryBuilder.toString());
        return query.getResultList();
    }
}

package br.gov.sp.cps.api.poc.dash.outbound.bd;

import br.gov.sp.cps.api.poc.dash.core.domain.dto.Filtro;
import br.gov.sp.cps.api.poc.dash.core.domain.dto.command.VisualizarGraficoCommand;
import br.gov.sp.cps.api.poc.dash.core.domain.repository.GraficoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class GraficoRepositoryImpl implements GraficoRepository {

    private final EntityManager entityManager;

    @Override
    public List<?> getGrafico(VisualizarGraficoCommand command) {
        StringBuilder queryBuilder = new StringBuilder("SELECT ");

        queryBuilder.append(command.getEixoX().getNome())
                .append(".")
                .append(command.getEixoX().getCampo())
                .append(", ")
                .append(command.getEixoY().getNome())
                .append(".")
                .append(command.getEixoY().getCampo());

        queryBuilder.append(" FROM ")
                .append(command.getEixoX().getNome());

        queryBuilder.append(" JOIN ")
                .append(command.getEixoY().getNome())
                .append(" ON ")
                .append(command.getEixoX().getNome())
                .append(".id_")
                .append(command.getEixoY().getNome())
                .append(" = ")
                .append(command.getEixoY().getNome())
                .append(".id_")
                .append(command.getEixoY().getNome());

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

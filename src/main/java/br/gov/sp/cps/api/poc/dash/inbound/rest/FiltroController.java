package br.gov.sp.cps.api.poc.dash.inbound.rest;

import br.gov.sp.cps.api.poc.dash.core.domain.dto.Combobox;
import br.gov.sp.cps.api.poc.dash.core.domain.dto.projection.ComboboxProjection;
import br.gov.sp.cps.api.poc.dash.core.usecase.ObterFatosUC;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("filtros")
@RequiredArgsConstructor
public class FiltroController {

    private final ObterFatosUC obterFatosUC;

    @GetMapping("/fato")
    public ResponseEntity<List<ComboboxProjection>> listarFatos(){
        return ResponseEntity.ok(obterFatosUC.executar());
    }
}

package br.gov.sp.cps.api.poc.dash.core.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Combobox {

    private String nome;
    private String alias;
    private List<String> campos = new ArrayList<>();

}

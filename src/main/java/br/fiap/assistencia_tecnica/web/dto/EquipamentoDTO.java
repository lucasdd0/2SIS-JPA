package br.fiap.assistencia_tecnica.web.dto;

import br.fiap.assistencia_tecnica.domain.Cliente;

import java.time.LocalDate;

public class EquipamentoDTO {
    private Long id;
    private Cliente cliente;
    private String tipo;
    private String marca;
    private String modelo;
    private String numeroSerie;
    private LocalDate dataCadastro;
}

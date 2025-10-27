package br.fiap.assistencia_tecnica.web.controller;

import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.service.EquipemantoService;
import br.fiap.assistencia_tecnica.web.dto.EquipamentoDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipemento")
public class EquipamentoController {
    private final EquipemantoService service;

    public EquipamentoController(EquipemantoService service) {
        this.service = service;
    }

    @PostMapping
    public Equipamento inserir(@RequestBody EquipamentoDTO equipamentoDTO){
        return service.inserir(equipamentoDTO);
    }
}

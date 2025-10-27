package br.fiap.assistencia_tecnica.service;

import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.repository.ClienteRepository;
import br.fiap.assistencia_tecnica.repository.EquipamentoRepository;
import br.fiap.assistencia_tecnica.web.dto.EquipamentoDTO;

import java.util.NoSuchElementException;

public class EquipemantoService {
    private final ClienteRepository clienteRepository;
    private final EquipamentoRepository equipamentoRepository;

    public EquipemantoService(ClienteRepository clienteRepository, EquipamentoRepository equipamentoRepository, EquipamentoRepository equipamentoRepository1) {
        this.clienteRepository = clienteRepository;
        this.equipamentoRepository = equipamentoRepository1;
    }

    public Equipamento inserir(EquipamentoDTO equipamentoDTO){
        var cliente = clienteRepository.findById(equipamentoDTO.getIdCliente())
                .orElseThrow(() -> new NoSuchElementException("Cliente não encontrado"));

        var equipamento = new Equipamento();
        equipamento.setTipo(equipamentoDTO.getTipo());
        equipamento.setMarca(equipamentoDTO.getMarca());
        equipamento.setModelo(equipamentoDTO.getModelo());
        equipamento.setNumeroSerie(equipamentoDTO.getNumeroSerie());
        equipamento.setDataCadastro(equipamentoDTO.getDataCadastro());
        equipamento.setCliente(cliente);
        return equipamentoRepository.save(equipamento);
    }
}

package br.gov.ce.tce.controleDeProcessos.service;

import br.gov.ce.tce.controleDeProcessos.model.Processo;
import br.gov.ce.tce.controleDeProcessos.repository.ProcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProcessoService {

    @Autowired
    private ProcessoRepository processoRepository;

    //Encontrando todos os processos com paginacao
    public Page<Processo> findAllProcessos(Pageable pageable) {
        return processoRepository.findAll(pageable);
    }

    //Encontrando um processo pela ID
    public Optional<Processo> findById(Long id) {
        return processoRepository.findById(String.valueOf(id));
    }

    //Encontrando um processo pela IdProcesso
    public List<Processo> findProcessoByIdProcesso(String idProcesso) {
        return processoRepository.findByIdProcesso(idProcesso);
    }

    //Editando um processo
    public Processo updateProcesso(Processo processo) {
        return processoRepository.saveAndFlush(processo);
    }

}

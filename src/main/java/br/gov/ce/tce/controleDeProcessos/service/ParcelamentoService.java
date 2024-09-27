package br.gov.ce.tce.controleDeProcessos.service;

import br.gov.ce.tce.controleDeProcessos.model.Parcelamento;
import br.gov.ce.tce.controleDeProcessos.repository.ParcelamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParcelamentoService {

    @Autowired
    private ParcelamentoRepository parcelamentoRepository;

    //Encontrando todas as parcelas de um processo especifico com paginacao
    public Page<Parcelamento> findAllParcelasByProcessoAndCpf(String idProcesso, String cpf, Pageable pageable) {
        return parcelamentoRepository.findByProcessoPrincipalAndCpf(idProcesso, cpf, pageable);
    }

    //Encontrando um parcela pela ID
    public Optional<Parcelamento> findById(Long id) {
        return parcelamentoRepository.findById(id);
    }

    //Salvando uma parcela para insercoes ou atualizacoes
    public Parcelamento saveParcela(Parcelamento parcela) {
        return parcelamentoRepository.saveAndFlush(parcela);
    }

    //Excluindo uma parcela
    public void deleteParcela(Long id) {
        parcelamentoRepository.deleteById(id);
    }

}

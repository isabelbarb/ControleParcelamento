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
    public Page<Parcelamento> findAllParcelas(Pageable pageable) {
        return parcelamentoRepository.findAll(pageable);
    }

    //Editando uma parcela
    public Parcelamento updateParcela(Parcelamento parcela) {
        return parcelamentoRepository.saveAndFlush(parcela);
    }

    //Excluindo uma parcela
    public void deleteParcela(Long id) {
        parcelamentoRepository.deleteById(id);
    }

    //Encontrando uma parcela pela ID
    /*public Optional<Parcelamento> findParcelaById(Long idProcesso) {
        return parcelamentoRepository.findById(idProcesso);
    }*/
}

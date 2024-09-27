package br.gov.ce.tce.controleDeProcessos.repository;

import br.gov.ce.tce.controleDeProcessos.model.Parcelamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelamentoRepository extends JpaRepository<Parcelamento, Long> {

    Page<Parcelamento> findByProcessoPrincipalAndCpf(
            String idProcesso,
            String cpf,
            Pageable pageable
    );
}

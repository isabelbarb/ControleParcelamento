package br.gov.ce.tce.controleDeProcessos.controller;

import br.gov.ce.tce.controleDeProcessos.model.Parcelamento;
import br.gov.ce.tce.controleDeProcessos.service.ParcelamentoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/parcelamento")
public class ParcelamentoController {

    @Autowired
    private ParcelamentoService parcelamentoService;

    @GetMapping("/processo")
    public ResponseEntity<Page<Parcelamento>> getAllParcelasByProcesso(
            @RequestParam String idProcesso,
            @RequestParam String cpf,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        Page<Parcelamento> parcelas = parcelamentoService
                .findAllParcelasByProcessoAndCpf(idProcesso, cpf, PageRequest.of(page, size));

        return parcelas.hasContent() ? ResponseEntity.ok(parcelas) : ResponseEntity.noContent().build();
    }

    @GetMapping("/parcela/{id}")
    public ResponseEntity<Parcelamento> getParcelaById(@PathVariable Long id) {
        return parcelamentoService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Parcelamento> updateParcelas(@PathVariable Long id, @RequestBody Parcelamento parcela) {
        return parcelamentoService.findById(id)
                .map(existingParcela -> {
                    BeanUtils.copyProperties(parcela, existingParcela, "id");
                    return ResponseEntity.ok(parcelamentoService.saveParcela(existingParcela));
                })
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping("/inserir")
    public ResponseEntity<Parcelamento> inserirParcela(@RequestBody Parcelamento parcela) {
        Parcelamento novaParcela = parcelamentoService.saveParcela(parcela);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaParcela);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deleteParcela(@PathVariable Long id) {
        parcelamentoService.deleteParcela(id);
        return ResponseEntity.noContent().build();
    }

}

package br.gov.ce.tce.controleDeProcessos.controller;

import br.gov.ce.tce.controleDeProcessos.model.Parcelamento;
import br.gov.ce.tce.controleDeProcessos.model.Processo;
import br.gov.ce.tce.controleDeProcessos.service.ParcelamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/parcelamento")
public class ParcelamentoController {

    @Autowired
    private ParcelamentoService parcelamentoService;

    @GetMapping
    public ResponseEntity<Page<Parcelamento>> getAllParcelas(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        Page<Parcelamento> parcelas = parcelamentoService.findAllParcelas(PageRequest.of(page, size));

        return parcelas.hasContent() ? ResponseEntity.ok(parcelas) : ResponseEntity.noContent().build();
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Parcelamento> updateParcelas(@RequestBody Parcelamento parcela) {
        return ResponseEntity.ok(parcelamentoService.updateParcela(parcela));
    }

    @DeleteMapping("/deletar/{idParcela}")
    public ResponseEntity<Void> deleteParcela(@PathVariable Long idParcela) {
        parcelamentoService.deleteParcela(idParcela);
        return ResponseEntity.noContent().build();
    }

    /*@GetMapping("/{idParcela}")
    public ResponseEntity<Parcelamento> getParcelaById(@PathVariable Long idParcela) {
        Optional<Parcelamento> parcela = parcelamentoService.findParcelaById(idParcela);

        return parcela.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }*/
}

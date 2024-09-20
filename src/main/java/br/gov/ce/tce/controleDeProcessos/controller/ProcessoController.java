package br.gov.ce.tce.controleDeProcessos.controller;

import br.gov.ce.tce.controleDeProcessos.model.Processo;
import br.gov.ce.tce.controleDeProcessos.service.ProcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/processos")
public class ProcessoController {

    @Autowired
    private ProcessoService processoService;

    @GetMapping
    public ResponseEntity<Page<Processo>> getAllProcessos(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        Page<Processo> processos = processoService.findAllProcessos(PageRequest.of(page, size));

        return processos.hasContent() ? ResponseEntity.ok(processos) : ResponseEntity.noContent().build();

    }

    @GetMapping("/{idProcesso}")
    public ResponseEntity<Processo> getProcessoById(@PathVariable Long idProcesso) {
        Optional<Processo> processo = processoService.findProcessoById(idProcesso);

        return processo.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Processo> updateProcesso(@RequestBody Processo processo) {
        return ResponseEntity.ok(processoService.updateProcesso(processo));
    }
}

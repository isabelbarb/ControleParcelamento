package br.gov.ce.tce.controleDeProcessos.controller;

import br.gov.ce.tce.controleDeProcessos.model.Processo;
import br.gov.ce.tce.controleDeProcessos.service.ProcessoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/processos")
public class ProcessoController {

    @Autowired
    private ProcessoService processoService;

    @GetMapping
    public ResponseEntity<Page<Processo>> getAllProcessos(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        Page<Processo> processos = processoService.findAllProcessos(PageRequest.of(page, size));

        return processos.hasContent() ? ResponseEntity.ok(processos) : ResponseEntity.noContent().build();
    }

    @GetMapping("/processo")
    public ResponseEntity<List<Processo>> getProcessoByIdProcesso(@RequestParam String idProcesso) {
        List<Processo> processos = processoService.findProcessoByIdProcesso(idProcesso);

        if (processos.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.ok(processos);
    }

    @GetMapping("/processo/{id}")
    public ResponseEntity<Processo> getProcessoById(@PathVariable Long id) {
        return processoService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Processo> updateProcesso(@PathVariable Long id, @RequestBody Processo processo) {
        return processoService.findById(id)
                .map(existingProcesso -> {
                    BeanUtils.copyProperties(processo, existingProcesso, "id");
                    return ResponseEntity.ok(processoService.updateProcesso(existingProcesso));
                })
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}

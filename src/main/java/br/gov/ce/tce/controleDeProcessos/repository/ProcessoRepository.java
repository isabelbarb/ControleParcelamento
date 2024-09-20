package br.gov.ce.tce.controleDeProcessos.repository;

import br.gov.ce.tce.controleDeProcessos.model.Parcelamento;
import br.gov.ce.tce.controleDeProcessos.model.Processo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class ProcessoRepository implements JpaRepository<Processo, Long> {


    @Override
    public void flush() {

    }

    @Override
    public <S extends Processo> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Processo> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Processo> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Processo getOne(Long aLong) {
        return null;
    }

    @Override
    public Processo getById(Long aLong) {
        return null;
    }

    @Override
    public Processo getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Processo> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Processo> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Processo> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Processo> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Processo> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Processo> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Processo, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Processo> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Processo> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Processo> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Processo> findAll() {
        return List.of();
    }

    @Override
    public List<Processo> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Processo entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Processo> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Processo> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Processo> findAll(Pageable pageable) {
        return null;
    }
}

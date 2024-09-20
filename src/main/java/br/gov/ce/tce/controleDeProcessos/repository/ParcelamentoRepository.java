package br.gov.ce.tce.controleDeProcessos.repository;

import br.gov.ce.tce.controleDeProcessos.model.Parcelamento;
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
public class ParcelamentoRepository implements JpaRepository<Parcelamento, Long> {

    @Override
    public void flush() {

    }

    @Override
    public <S extends Parcelamento> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Parcelamento> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Parcelamento> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Parcelamento getOne(Long aLong) {
        return null;
    }

    @Override
    public Parcelamento getById(Long aLong) {
        return null;
    }

    @Override
    public Parcelamento getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Parcelamento> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Parcelamento> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Parcelamento> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Parcelamento> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Parcelamento> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Parcelamento> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Parcelamento, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Parcelamento> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Parcelamento> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Parcelamento> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Parcelamento> findAll() {
        return List.of();
    }

    @Override
    public List<Parcelamento> findAllById(Iterable<Long> longs) {
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
    public void delete(Parcelamento entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Parcelamento> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Parcelamento> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Parcelamento> findAll(Pageable pageable) {
        return null;
    }
}

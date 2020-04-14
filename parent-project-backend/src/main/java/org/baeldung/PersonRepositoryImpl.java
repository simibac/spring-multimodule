//package org.baeldung;
//
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Repository("h2-impl")
//public class PersonRepositoryImpl implements PersonRepository{
//    @Override
//    public List<Person> findAll() {
//        System.out.println("trying to access the h2");
//        return new ArrayList<Person>();
//    }
//
//    @Override
//    public List<Person> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public List<Person> findAllById(Iterable<Long> iterable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Person> List<S> saveAll(Iterable<S> iterable) {
//        return null;
//    }
//
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends Person> S saveAndFlush(S s) {
//        return null;
//    }
//
//    @Override
//    public void deleteInBatch(Iterable<Person> iterable) {
//
//    }
//
//    @Override
//    public void deleteAllInBatch() {
//
//    }
//
//    @Override
//    public Person getOne(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public <S extends Person> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends Person> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<Person> findAll(Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Person> S save(S s) {
//        return null;
//    }
//
//    @Override
//    public Optional<Person> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(Person person) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Person> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public <S extends Person> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends Person> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Person> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends Person> boolean exists(Example<S> example) {
//        return false;
//    }
//}

package br.com.store.store.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.store.store.app.entity.Teste;

@Repository
public interface TesteRepository extends JpaRepository<Teste, Long> {

}

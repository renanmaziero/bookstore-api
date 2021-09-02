package com.renan.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renan.bookstore.domain.Livro;

/*informa ao spring que ele deve criar a interface 
 * para a persistencia dos dados*/
@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}

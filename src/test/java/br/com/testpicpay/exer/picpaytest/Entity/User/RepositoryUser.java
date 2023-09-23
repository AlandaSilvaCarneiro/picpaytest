package br.com.testpicpay.exer.picpaytest.Entity.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface RepositoryUser extends JpaRepository<User,Long>{
      Optional<User> findUserByDocument(String document);
    
}

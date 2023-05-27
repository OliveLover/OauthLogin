package com.example.security1.repository;

import com.example.security1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository라는 어노테이션이 없어도 IoC가 된다. JpaRepository를 상속했기 때문
public interface UserRepository extends JpaRepository<User, Long> {
    // findBy규칙 -> Username 문법
    //SELECT * FROM USER WHERE  USERNAME = 1?  가 호출된다.
    public User findByUsername(String username);  //Jpa Query methods
}

package com.segurityjwt.jwtpuro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.segurityjwt.jwtpuro.entity.Demo;

public interface DemoRepository extends JpaRepository<Demo, Long> {
    

}

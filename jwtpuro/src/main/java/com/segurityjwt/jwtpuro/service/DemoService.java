package com.segurityjwt.jwtpuro.service;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.segurityjwt.jwtpuro.entity.Demo;
import com.segurityjwt.jwtpuro.repositories.DemoRepository;

@Service
public class DemoService {
    
    DemoRepository demoRepository;
    
    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }


    public Optional<Demo> getDemo(Long id) {
        return demoRepository.findById(id);
    }
}

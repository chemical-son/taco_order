package com.example.TacoCloudApplication.repositoies;

import com.example.TacoCloudApplication.data.Taco;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
    Page<Taco> findAll(Pageable pageable);
}

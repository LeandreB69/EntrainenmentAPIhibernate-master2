package fr.dawan.entrainementspringapi.generic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IGenericService<D> {
    Page<D> findAll(Pageable pageable);
    
    Optional<D> findById(long id);
    
    D saveOrUpdate(D dto);
    
    void deleteById(long id);
}

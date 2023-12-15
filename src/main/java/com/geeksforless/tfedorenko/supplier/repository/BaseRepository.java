package com.geeksforless.tfedorenko.supplier.repository;


import com.geeksforless.tfedorenko.supplier.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository <E extends BaseEntity> extends JpaRepository<E, Long> {
}

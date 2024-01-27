package com.example.ogett.Repository;

import com.example.ogett.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // JpaRepository가 기본 CRUD 작업을 제공하므로 추가 메서드 선언은 필요하지 않음
    List<Product> findByNameContaining(String keyword);
}

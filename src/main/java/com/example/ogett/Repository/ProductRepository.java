package com.example.ogett.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ogett.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // JpaRepository가 기본 CRUD 작업을 제공하므로 추가 메서드 선언은 필요하지 않음
}

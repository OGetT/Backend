package com.example.ogett.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ogett.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // 추가적인 메서드 선언
}


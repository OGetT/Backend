package com.example.ogett.Repository;

import com.example.ogett.Entity.CartItem;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartItem, Long> {
    // 여기에 추가적인 메서드가 필요하면 작성할 수 있습니다.
    @Transactional
    void deleteByProductId(Long productId);

}

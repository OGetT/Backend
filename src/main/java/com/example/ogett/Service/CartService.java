package com.example.ogett.Service;

import com.example.ogett.DTO.CartRequest;

public interface CartService {
    void addToCart(CartRequest cartRequest);
    void purchaseCart();
    void removeFromCart(Long productId);
}
package com.example.ogett.Service;

import com.example.ogett.DTO.CartRequest;
import com.example.ogett.Entity.CartItem;
import com.example.ogett.Entity.Product;
import com.example.ogett.Repository.CartRepository;
import com.example.ogett.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void addToCart(CartRequest cartRequest) {
        Long productId = cartRequest.getProductId();
        Integer quantity = cartRequest.getQuantity();

        Optional<Product> productOptional = productRepository.findById(productId);

        if (productOptional.isPresent()) {
            Product product = productOptional.get();

            CartItem cartItem = new CartItem();
            cartItem.setProduct(product);
            cartItem.setQuantity(quantity);

            cartRepository.save(cartItem);
        } else {
            System.err.println("Product not found with ID: " + productId);
        }
    }

    @Override
    public void removeFromCart(Long productId) {
        // 여기에서 장바구니에서 해당 상품을 제거하는 로직을 추가
        cartRepository.deleteByProductId(productId);
    }

    @Override
    public void purchaseCart() {
        // 여기에서 장바구니의 상품을 구매하는 로직을 추가
        Iterable<CartItem> cartItems = cartRepository.findAll();

        for (CartItem cartItem : cartItems) {
            Product product = cartItem.getProduct();
            Integer quantity = cartItem.getQuantity();


            productRepository.save(product);
        }

        // 장바구니 비우기
        cartRepository.deleteAll();
    }
}
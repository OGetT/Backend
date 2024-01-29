package com.example.ogett.Controller;

import com.example.ogett.DTO.CartRequest;
import com.example.ogett.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cart") // 장바구니 관련 요청은 /cart로 시작
public class CartController {


    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public String showCart() {
        // 장바구니 화면을 보여주는 뷰로 이동

        return "/Cart/Cart";
    }

    @PostMapping("/add-to-cart")
    public ResponseEntity<String> addToCart(@RequestBody CartRequest cartRequestDTO) {
        cartService.addToCart(cartRequestDTO);
        return ResponseEntity.ok("Product added to cart successfully");
    }

    @DeleteMapping("/remove-from-cart/{productId}")
    public ResponseEntity<String> removeFromCart(@PathVariable Long productId) {
        cartService.removeFromCart(productId);
        return ResponseEntity.ok("Product removed from cart successfully");
    }

    @PostMapping("/purchase")
    public ResponseEntity<String> purchaseCart() {
        cartService.purchaseCart();
        return ResponseEntity.ok("Cart purchased successfully");
    }
}
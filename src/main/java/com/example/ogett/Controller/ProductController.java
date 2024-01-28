package com.example.ogett.Controller;

import com.example.ogett.DTO.ProductDTO;
import com.example.ogett.Entity.Product;
import com.example.ogett.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String showAllProducts(Model model) {
        // 모든 제품을 가져와서 모델에 추가
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "index.html";  // 상품 목록을 보여줄 뷰의 이름 (productList.html 등)
    }

    @GetMapping("/product_registration")
    public String ProductRegistration() {
        return "/product/product_registration";
    }

    @PostMapping("/product_registration")
    public String saveProduct(@RequestParam("image") MultipartFile image,
                              @RequestParam("name") String name,
                              @RequestParam("price") String price,
                              @RequestParam("type") String type,
                              @RequestParam("author") String author,
                              @RequestParam("description") String description,
                              Model model) throws IOException {

        byte[] imageData = image.getBytes();

        ProductDTO productDTO = new ProductDTO();
        productDTO.setImageData(imageData);
        productDTO.setName(name);
        productDTO.setPrice(Double.parseDouble(price));
        productDTO.setType(type);
        productDTO.setAuthor(author);
        productDTO.setDescription(description);

        productService.registerProduct(productDTO);

        System.out.println("상품 등록 완료: " + productDTO.getName());

        List<ProductDTO> products = productService.getAllProductsDTO();
        model.addAttribute("products", products);

        // 등록 완료 시 홈 화면으로 이동
        return "redirect:/";
    }


    @GetMapping("/product_detail")
    public String productDetailById(@RequestParam("id") Long id, Model model) {
        ProductDTO product = productService.getProductDTOById(id);
        model.addAttribute("product", product);
        return "/product/productDetail";
    }

    @GetMapping("/searchResult")
    public String searchProducts(@RequestParam String keyword, Model model) {
        List<ProductDTO> searchResults = productService.searchProducts(keyword);
        model.addAttribute("products", searchResults);
        model.addAttribute("keyword", keyword);
        return "SearchResult";
    }

    @GetMapping("/product")
    public String productView() {
        return "/product/Product";
    }

    @GetMapping("/product/{productId}/image")
    public ResponseEntity<Resource> getImage(@PathVariable Long productId) {
        // productId를 사용하여 데이터베이스에서 Product 엔터티를 가져옴 (ProductService를 사용하도록 설정 필요)
        Product product = productService.getProductById(productId);

        // Product 엔터티에서 이미지 데이터 가져오기
        byte[] imageData = product.getImageData();

        // ByteArrayResource를 사용하여 이미지 데이터를 리소스로 변환
        ByteArrayResource resource = new ByteArrayResource(imageData);

        // 이미지 데이터의 Content-Type 설정
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG); // 예시로 PNG 이미지로 설정

        // ResponseEntity를 사용하여 이미지 데이터를 반환
        return ResponseEntity.ok()
                .headers(headers)
                .body(resource);
    }
}


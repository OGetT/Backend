package com.example.ogett.Controller;

import com.example.ogett.DTO.ProductDTO;
import com.example.ogett.Entity.Product;
import com.example.ogett.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    public  String productView(){
        return "/product/Product";
}


}
package com.example.ogett.Service;

import com.example.ogett.Controller.ProductController;
import com.example.ogett.DTO.ProductDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.verify;

@WebMvcTest(ProductController.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class ProductServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private ProductService productService;

    @Test
    @DirtiesContext
    public void testRegisterProduct() throws Exception {
        // 테스트에 사용할 상품 DTO 생성
        ProductDTO productDTO = new ProductDTO();
         // 이 부분을 실제로 알맞게 수정

        productDTO.setName("Test Product");
        productDTO.setPrice(99.99);
        productDTO.setType("Clothing");

        // ObjectMapper를 사용하여 JSON으로 변환
        String productDTOJson = objectMapper.writeValueAsString(productDTO);

        // MockMvc를 사용하여 POST 요청을 보내고, 응답을 확인
        mockMvc.perform(MockMvcRequestBuilders.post("/products/register")
                        .contentType("application/json")
                        .content(productDTOJson))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection()); // 적절한 리다이렉션 상태 코드로 확인

        // productService의 registerProduct 메서드가 호출되었는지 확인
        verify(productService).registerProduct(productDTO);
    }
}
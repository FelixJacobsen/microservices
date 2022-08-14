package se.fallqvistspecial.productservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import se.fallqvistspecial.productservice.dto.ProductRequest;
import se.fallqvistspecial.productservice.dto.ProductResponse;
import se.fallqvistspecial.productservice.model.Product;
import se.fallqvistspecial.productservice.repository.ProductRepository;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class ProductService {

    private final ProductRepository repository;

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .buyPrice(productRequest.getBuyPrice())
                .description(productRequest.getDescription())
                .build();

        repository.save(product);
        log.info("Product has been saved successfully");
    }

    public List<ProductResponse> getAllProducts(){
        List<Product> products = repository.findAll();
        return products.stream().map(this::mapToDto).toList();
    }

    private ProductResponse mapToDto(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .buyPrice(product.getBuyPrice())
                .build();

    }
}

package se.fallqvistspecial.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import se.fallqvistspecial.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {}

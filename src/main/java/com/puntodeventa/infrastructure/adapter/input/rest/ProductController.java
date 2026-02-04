package com.puntodeventa.infrastructure.adapter.input.rest;

import com.puntodeventa.application.ports.input.CreateProductUseCase;
import com.puntodeventa.domain.model.Product;
import com.puntodeventa.infrastructure.adapter.input.rest.dto.ProductRequest; // Nuevo
import com.puntodeventa.infrastructure.adapter.input.rest.dto.ProductResponse; // Nuevo
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final CreateProductUseCase createProductUseCase;

    @PostMapping
    public ProductResponse create(@RequestBody ProductRequest request) {
        // 1. Convertir DTO (Web) -> Dominio
        Product newProduct = new Product(null, request.getName(), request.getPrice(), request.getStock());

        // 2. Llamar al Caso de Uso
        Product createdProduct = createProductUseCase.create(newProduct);

        // 3. Convertir Dominio -> DTO (Web)
        return new ProductResponse(createdProduct.getId(), createdProduct.getName(), createdProduct.getPrice(), createdProduct.getStock());
    }

    @GetMapping
    public List<ProductResponse> list() {
        // Por ahora devolvemos una lista vacía para que GET /api/products no devuelva 405
        return Collections.emptyList();
    }
}
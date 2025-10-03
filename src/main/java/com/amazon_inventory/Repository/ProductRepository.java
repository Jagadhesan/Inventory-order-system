package com.amazon_inventory.Repository;

import com.amazon_inventory.Model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}

package com.maxim.api.repositories.bikes;
import com.maxim.api.models.bikes.production.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BikesRepository {
//    List<Product> getProducts();


    @Query("SELECT * from production.products where category_id = :categoryId")
    Product findByCategoryId(@Param("categoryId") Integer categoryId);

}

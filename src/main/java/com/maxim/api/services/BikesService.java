package com.maxim.api.services;

import com.maxim.api.models.bikes.production.Product;
import com.maxim.api.repositories.bikes.BikesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BikesService implements BikesRepository {
    BikesRepository service;
    public BikesService() {}
    public BikesService(BikesRepository repository) {
        service = repository;
    }

    @Override
    public Product findByCategoryId(Integer categoryId) {
        return service.findByCategoryId(categoryId);
    }

//    @Query("SELECT * FROM production.products")
//    public List<Product> getProducts() {
//        List<Product> list  = new ArrayList<>();
//        list.add(new Product());
//        return list;
//    }


//    @Query("SELECT t FROM Tutorial t WHERE t.published=:isPublished AND t.level BETWEEN :start AND :end")
//    List<Product> findByLevelBetween(@Param("start") int start, @Param("end") int end, @Param("isPublished") boolean isPublished);
}

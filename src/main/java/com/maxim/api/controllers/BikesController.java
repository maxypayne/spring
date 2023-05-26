package com.maxim.api.controllers;

import com.maxim.api.models.bikes.production.Product;
import com.maxim.api.services.BikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.sampled.Port;
import java.util.List;

@RestController
@RequestMapping(
        value = "/bikes",
        produces = "application/json"
)
public class BikesController {
    private final BikesService service;
    @Autowired
    public BikesController(BikesService service) {
        this.service = service;
    }
//    @GetMapping("/products")
//    public List<Product> getProducts() throws Exception {
//        List<Product> list = service.getProducts();
//        System.out.println(list);
//        return list;
//    }
//    @GetMapping("/{productId}")
//    public Product getProduct(@PathVariable() int id) {
//        return service.findByCategoryId(id);
//    }
}

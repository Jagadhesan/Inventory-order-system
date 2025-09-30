package com.amazon_inventory.Inventory_order_system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    String hello() {
        return "Hello welcome to my project";
    }
}

package com.tpdbd.cardpurchases.controllers;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ApiController {

    @GetMapping("/")
    String index() {
        return "Card Purchases application";
    }

}

package com.menu.digital.controller;

import com.menu.digital.dto.FoodRequestDTO;
import com.menu.digital.dto.FoodResponseDTO;
import com.menu.digital.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping( "/addFood")
    public void create(@RequestBody FoodRequestDTO data) {
        foodService.createItemOnMenu(data);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/listFoods")
    List<FoodResponseDTO> listFoods() {
        return foodService.listAllMenu();
    }
}

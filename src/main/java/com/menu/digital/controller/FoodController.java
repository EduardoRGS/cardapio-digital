package com.menu.digital.controller;

import com.menu.digital.dto.FoodRequestDTO;
import com.menu.digital.dto.FoodResponseDTO;
import com.menu.digital.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @PostMapping( "/addFood")
    public void create(@RequestBody FoodRequestDTO data) {
        foodService.createItemOnMenu(data);
    }

    @GetMapping("/listFoods")
    List<FoodResponseDTO> listFoods() {
        return foodService.listAllMenu();
    }
}

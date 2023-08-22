package com.menu.digital.menudigital.controller;

import com.menu.digital.menudigital.dto.FoodRequestDTO;
import com.menu.digital.menudigital.dto.FoodResponseDTO;
import com.menu.digital.menudigital.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @PostMapping(name = "/addFood")
    public void create(@RequestBody FoodRequestDTO data) {
        foodService.createItemOnMenu(data);
    }

    @GetMapping( name = "/listFoods")
    List<FoodResponseDTO> listFoods() {
        return foodService.listAllMenu();
    }
}

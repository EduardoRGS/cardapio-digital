package com.menu.digital.menudigital.service;

import com.menu.digital.menudigital.dto.FoodRequestDTO;
import com.menu.digital.menudigital.dto.FoodResponseDTO;
import com.menu.digital.menudigital.entity.Food;
import com.menu.digital.menudigital.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;

    public void createItemOnMenu(FoodRequestDTO data) {
        Food food = new Food(data);
        foodRepository.save(food);
    }

    public List<FoodResponseDTO> listAllMenu() {
        return foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
    }
}

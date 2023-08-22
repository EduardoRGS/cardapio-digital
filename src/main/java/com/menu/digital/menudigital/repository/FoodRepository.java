package com.menu.digital.menudigital.repository;

import com.menu.digital.menudigital.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}

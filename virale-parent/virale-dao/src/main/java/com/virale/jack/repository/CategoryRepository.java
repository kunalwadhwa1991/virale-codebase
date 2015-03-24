package com.virale.jack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virale.jack.dataobjects.CardCategory;

public interface CategoryRepository extends JpaRepository<CardCategory, Integer>{

}

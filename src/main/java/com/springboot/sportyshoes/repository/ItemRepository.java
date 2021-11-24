package com.springboot.sportyshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.sportyshoes.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

	}


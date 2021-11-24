package com.springboot.sportyshoes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.sportyshoes.model.Item;
import com.springboot.sportyshoes.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{
			
		@Autowired
		 private ItemRepository itemRepository;
		
		@Override
		public List < Item > getAllItems() {
	        return itemRepository.findAll();
	    }

	    @Override
	    public void saveItem(Item item) {
	        this.itemRepository.save(item);
	    }

	    @Override
	    public Item getItemById(long id) {
	        Optional <Item> optional = itemRepository.findById(id);
	        Item item = null;
	        if (optional.isPresent()) {
	        	item = optional.get();
	        } else {
	        	throw new RuntimeException(" Item not found for id :: " + id);
	        }
	        return item;
	    }

	    @Override
	    public void deleteItemById(long id) {
	        this.itemRepository.deleteById(id);
	    }
	}


package com.springboot.sportyshoes.service;


import java.util.List;

import com.springboot.sportyshoes.model.Item;

public interface ItemService {

	  List < Item > getAllItems();
	    void saveItem(Item Item);
	    Item getItemById(long id);
	    void deleteItemById(long id);
}

package com.mongodb.madicalshop.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.madicalshop.model.Shop;
import com.mongodb.madicalshop.repository.MedicalShopRepository;

@RestController
@RequestMapping("/medical-shop")
public class medicalshopController {
	
	@Autowired
	private MedicalShopRepository repository;

	@PostMapping("/placedOrderNow")
	public String placeOrder(@RequestBody Shop shop) {
		repository.save(shop);
		return "Order placed successfully...";
	}

	@GetMapping("/getShopByName/{name}")
	public List<Shop> getShoprbyName(@PathVariable String name) {
		return repository.findByName(name);
	}

	@GetMapping("/getShopByAddress/{city}")
	public List<Shop> getShopbyAddress(@PathVariable String city) {
		return repository.findByCity(city);
	}

	
}

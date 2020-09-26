package com.mongodb.madicalshop.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mongodb.madicalshop.model.Shop;


public interface MedicalShopRepository extends MongoRepository<Shop, Integer> {

	List<Shop> findByName(String name);

	@Query("{'Address.city':?0}")
	List<Shop> findByCity(String city);
}

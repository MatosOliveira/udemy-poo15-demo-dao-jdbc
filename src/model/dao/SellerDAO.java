package model.dao;

import java.util.List;

import model.entities.Seller;

/**
 * Classe DAO - Seller
 * 
 * @author Matos - 25.06.2023
 *
 */
public interface SellerDao {

	void insert(Seller obj);
	
	void update(Seller obj);
	
	void deleteById(Seller obj);
	
	Seller findById(Integer id);
	
	List<Seller> findAll();
}

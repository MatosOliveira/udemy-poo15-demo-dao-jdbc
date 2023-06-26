/**
 * 
 */
package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

/**
 * @author Matos
 *
 */
public class DemoDaoProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * Department department = new Department(1, "Eletronicos"); 
		 * Seller seller = new Seller(2, "Jose", "jose@gmail.com", LocalDate.parse("22/04/1990", dtf),
		 * 3000.0, department);
		 * 
		 * System.out.println(department); System.out.println(seller);
		 */
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("\n =====TEST 1: seller findById ========");
		Seller seller2 = sellerDao.findById(3);
		System.out.println(seller2);
		
		System.out.println("\n =====TEST 2: seller findByDepartment ========");
		Department department = new Department(1, null); 
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller sel : list) {
			System.out.println(sel);
		}
		
		System.out.println("\n =====TEST 3: seller findByAll ========");
		List<Seller> list2 = sellerDao.findAll();
		for(Seller sel : list2) {
			System.out.println(sel);
		}
		
		System.out.println("\n =====TEST 4: seller insert ========");
		Seller seller3 = new Seller(null, "Marta", "marta@gmail.com", LocalDate.parse("22/04/1990", dtf), 2600.0, department);
		sellerDao.insert(seller3);
		System.out.println("Inserted new seller! " + seller3.getId());
		
		/*
		 * System.out.println("\n =====TEST 5: seller update ========"); 
		 * seller3 = sellerDao.findById(11); seller3.setName("Maria Pink");
		 * seller3.setEmail("maria.pink@gmail.com"); sellerDao.update(seller3);
		 * System.out.println("Update completed! ");
		 */
		
		System.out.println("\n =====TEST 6: seller delete ========");
		sellerDao.deleteById(11);
		System.out.println("Delete completed! ");

	}

}

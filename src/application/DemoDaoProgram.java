/**
 * 
 */
package application;

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
		 * DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 * 
		 * Department department = new Department(1, "Eletronicos"); 
		 * Seller seller = new Seller(2, "Jose", "jose@gmail.com", LocalDate.parse("22/04/1990", dtf),
		 * 3000.0, department);
		 * 
		 * System.out.println(department); System.out.println(seller);
		 */
		
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
		

	}

}

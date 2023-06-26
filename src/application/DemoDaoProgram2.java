/**
 * 
 */
package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

/**
 * @author Matos
 *
 */
public class DemoDaoProgram2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Department department = new Department(1, "Eletronicos"); 
		 * Seller seller = new Seller(2, "Jose", "jose@gmail.com", LocalDate.parse("22/04/1990", dtf), 3000.0, department);
		 * 
		 * System.out.println(department); System.out.println(seller);
		 */

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("\n =====TEST 1: department findById ========");
		Department department2 = departmentDao.findById(3);
		System.out.println(department2);

		System.out.println("\n =====TEST 2: department findByAll ========"); 
		List<Department> list2 = departmentDao.findAll(); 
		for(Department sel : list2) {
			System.out.println(sel); 
		}

		System.out.println("\n =====TEST 3: department insert ========"); 
		Department department3 = new Department(null, "Financial");
		//departmentDao.insert(department3);
		//System.out.println("Inserted new department! " + department3.getId());
		  
		
		 System.out.println("\n =====TEST 4: department update ========"); 
		 department3 = departmentDao.findById(8); 
		 department3.setName("Controller");
		 departmentDao.update(department3); 
		 System.out.println("Update completed! ");
		  
		 System.out.println("\n =====TEST 5: department delete ========");
		 departmentDao.deleteById(8); 
		 System.out.println("Delete completed! ");
			 
		 
		 

	}

}

package model.dao;

import java.util.List;

import model.entities.Department;

/**
 * Classe DAO - Department
 * 
 * @author Matos - 25.06.2023
 *
 */
public interface DepartmentDAO {

	void insert(Department obj);
	
	void update(Department obj);
	
	void deleteById(Department obj);
	
	Department findById(Integer id);
	
	List<Department> findAll();
}

package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	//vai ser responsável por inserir o objeto no banco
	void insert(Department obj);
	void update (Department obj);
	void deletById (Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	
	

}

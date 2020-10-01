package application;



import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {

	public static void main(String[] args) {
		System.out.println("=== TEST 1: Seller Insert ====");	
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		Department newDep = new Department(5, "Acessórios");
		
		depDao.insert(newDep);
		System.out.println("Inserted! new id = "+ newDep.getId());
		
		System.out.println("=======================================================================================");
		

	}

}

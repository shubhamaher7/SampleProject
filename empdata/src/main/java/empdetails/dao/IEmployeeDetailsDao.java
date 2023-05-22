package empdetails.dao;

import java.sql.SQLException;

import empdetails.model.Employee;

public interface IEmployeeDetailsDao {
	
	public int addEmp(Employee employee) throws ClassNotFoundException, SQLException;
	public int delEmp(int empId) throws SQLException;
	
}

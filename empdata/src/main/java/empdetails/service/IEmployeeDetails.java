package empdetails.service;

import java.sql.SQLException;
import java.util.List;

import empdetails.exceptions.EmployeeNotFoundException;
import empdetails.exceptions.InvalidEmployeeDetailsException;
import empdetails.model.Employee;

public interface IEmployeeDetails {
	
	public String addEmp(Employee emp) throws InvalidEmployeeDetailsException, ClassNotFoundException, SQLException;
	public String delEmp(int empId) throws EmployeeNotFoundException, SQLException, ClassNotFoundException;
	public String updateEmp(int empId,Employee emp) throws EmployeeNotFoundException, ClassNotFoundException, SQLException;
	public List<Employee> viewEmp() throws EmployeeNotFoundException, ClassNotFoundException, SQLException;
	public List<Employee> viewById (int empId) throws EmployeeNotFoundException, ClassNotFoundException, SQLException;
}

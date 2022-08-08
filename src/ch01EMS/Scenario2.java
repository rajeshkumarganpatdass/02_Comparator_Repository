package ch01EMS;

import java.util.List;

//Print the name of all departments in the organization?
public class Scenario2 {

	
	/*
	Use distinct() method after calling map(Employee::getDepartment) 
	on the stream. It will return unique departments.
	*/
	public void printAllDepartmentNames()
	{
		List<Employee> employeeListLocal = CommonUtil.employeeList;
		employeeListLocal.stream()
						    .map(Employee::getDepartment)
						    .distinct()
						    .forEach(System.out::println);		         
	}
}

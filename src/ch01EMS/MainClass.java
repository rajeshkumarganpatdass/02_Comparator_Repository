package ch01EMS;

public class MainClass {

	public static void main(String args[])
	{
		//How many male and female employees are there in the organization?
		Scenario1 objScenario1 = new Scenario1();
		objScenario1.howManyMaleAndFemaleEmployees();
		
		////Print the name of all departments in the organization
		Scenario2 objScenario2 = new Scenario2();
		objScenario2.printAllDepartmentNames();
	}
}

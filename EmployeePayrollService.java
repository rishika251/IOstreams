package com.bridgelabz.file;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	public enum IOService {
	  CONSOLE_IO, FILE_IO, DB_IO, REST_IO 
}
	private List<EmployeePayrollData>employeePayrollList;
	public EmployeePayrollService() {}
	public EmployeePayrollService(List<EmployeePayrollData>employeePayrollList) {}
public static void main(String[] args){
ArrayList<EmployeePayrollData>employeePayrollList= new ArrayList<>();
EmployeePayrollService employeepayrollService = new EmployeePayrollService(employeePayrollList);
Scanner consoleInputReader = new Scanner(System.in);
employeepayrollService.readEmployeePayrollData(consoleInputReader);
employeepayrollService.writeEmployeePayrollData();
}

private void writeEmployeePayrollData() {
	System.out.println("\nWriting Employee payroll Roaster to Console\n"+employeePayrollList);
	}	
	
private void readEmployeePayrollData(Scanner consoleInputReader) {
System.out.println("Enter Employee Id:");
int id = consoleInputReader.nextInt();
System.out.println("Enter Employee Name:");
String  name = consoleInputReader.next();
System.out.println("Enter Employee Salary:");
double salary = consoleInputReader.nextInt();
employeePayrollList.add(new EmployeePayrollData(id,name,salary));

}
}

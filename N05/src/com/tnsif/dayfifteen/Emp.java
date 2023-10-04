package com.tnsif.dayfifteen;

import java.util.Comparator;

public class Emp {
	private int empId;
	private String empName;
	private float salary;
	private String designation;

	public Emp() {
	}

	public Emp(int empId, String empName, float salary, String designation) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.designation = designation;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
}


class SortByName implements Comparator<Emp>
{
	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getEmpName().compareTo(o2.getEmpName());
		
	}
}

class SortByDesignation implements Comparator<Emp>
{
	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o2.getDesignation().compareTo(o1.getDesignation());
		
	}
}
 

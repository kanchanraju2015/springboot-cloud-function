package com.briz.democloud;

public class Employee
{
int id;
String empname;
String empdept;
String empaddress;
public Employee(int id, String empname, String empdept, String empaddress) {
	super();
	this.id = id;
	this.empname = empname;
	this.empdept = empdept;
	this.empaddress = empaddress;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpdept() {
	return empdept;
}
public void setEmpdept(String empdept) {
	this.empdept = empdept;
}
public String getEmpaddress() {
	return empaddress;
}
public void setEmpaddress(String empaddress) {
	this.empaddress = empaddress;
}

}

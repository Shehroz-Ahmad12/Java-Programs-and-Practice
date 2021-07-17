package comp;

public class Employee {
String name;
Date birthDate;
Date hireDate;

public Employee(String a, Date b, Date c) {
	name=a;
	birthDate=new Date(b);
	hireDate=new Date(c);
	
}

public Employee(Employee e) {
	name=e.name;
	birthDate=new Date(e.birthDate);
	hireDate=new Date(e.hireDate);
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getBirthDate() {
	return birthDate;
}
public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}
public Date getHireDate() {
	return hireDate;
}
public void setHireDate(Date hireDate) {
	this.hireDate = hireDate;
}
public boolean equals(Employee e1) {
	if (e1==null) {
		return false;		
	}
	else {
		if ((this.name.equals(e1.name))&&(this.birthDate.getDay()==e1.birthDate.getDay() &&	
				this.birthDate.getMonth()==e1.birthDate.getMonth() && 
				this.birthDate.getYear()==e1.birthDate.getYear()) &&
				
				(this.hireDate.getDay()==e1.hireDate.getDay() &&
				this.hireDate.getMonth()==e1.hireDate.getMonth() &&
				this.hireDate.getYear()==e1.hireDate.getYear())) {
			return true;
		}
		else {
			return false;
		}
	}
}
}

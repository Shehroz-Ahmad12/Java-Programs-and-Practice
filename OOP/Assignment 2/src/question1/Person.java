package question1;

public class Person {
private String name;
private int age;

public Person() {
	
}
public Person(Person p) {
	this.name=p.name;
	this.age=p.age;
}

public Person(String name, int age) {
	this.name = name;
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public void display() {
	System.out.println("Name: "+ this.name);
	System.out.println("Age: "+ this.age);
	
}


}

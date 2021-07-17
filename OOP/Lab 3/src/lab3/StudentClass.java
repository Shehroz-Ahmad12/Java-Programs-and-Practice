package lab3;

import java.util.Arrays;

public class StudentClass {
 String name;
 double gpa;
 String[] subjects=new String[5];
 String email;
 
 public void setParameters(String a, double b ,String c, String[] d) {
	 name =a;
	 gpa=b;
	 email=c;
	 for (int i=0;i<5;i++) {
		 subjects[i]=d[i];
	 }
 }
 public void display() {
	 System.out.println("Name is: "+name+ " gpa is: "+gpa+ " Subjects are: "+ Arrays.toString(subjects)+ " and email is: " +email);
 }
 
 public boolean searchSubjects(String x) {
	 for (int i=0; i<5;i++) {
			if (subjects[i]==x) {
				return true;
				}
		}
			return false;
			}
	
 public boolean validateEmail() {
	 if (email.contains("@gmail.com")) {
		 return true;
	 }
	 else {
		 return false;
	 }
  }
 public boolean checkProbStatus() {
	 if (gpa<2.0) {
		 return true;
	 }
	 else {
		 return false;
	 }
 }
 
}

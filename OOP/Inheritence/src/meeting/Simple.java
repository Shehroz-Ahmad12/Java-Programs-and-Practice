package meeting;

public class Simple {
protected int num1;
protected int num2;
public Simple() {
	
}
public Simple(int num1, int num2) {
	
	this.num1 = num1;
	this.num2 = num2;
}
public int getNum1() {
	return num1;
}
public void setNum1(int num1) {
	this.num1 = num1;
}
public int getNum2() {
	return num2;
}
public void setNum2(int num2) {
	this.num2 = num2;
}

public void add() {
	System.out.println(num1+num2);
}
public void subtract() {
	System.out.println(num1-num2);
}
public void multiply() {
	System.out.println(num1*num2);
}
public void divide() {
	System.out.println(num1/num2);
}

}

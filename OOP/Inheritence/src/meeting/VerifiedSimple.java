package meeting;

public class VerifiedSimple extends Simple {
	public VerifiedSimple() {
		super();
	}
	public VerifiedSimple(int num1,int num2) {
		super(num1,num2);
	}
	public void add() {
		if(num1>0 &&num2>0) {
			super.add();
		}
	}
	public void subtract() {
		if(getNum1()>0 &&getNum2()>0) {
			super.subtract();
		}
	}
	public void multiply() {
		if(getNum1()>0 &&getNum2()>0) {
			super.multiply();
		}
	}
	public void divide() {
		if(getNum1()>0 &&getNum2()>0) {
			super.divide();
		}
	}

}

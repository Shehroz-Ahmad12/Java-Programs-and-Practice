package inheritence;

public class Computer {

	private int wordsize;
	private int memorysize;
	private int storagesize;
	private int speed;
	
	public Computer() {
		
	}
	public Computer(int a,int b,int c,int d) {
		wordsize=a;
		memorysize=b;
		storagesize=c;
		speed=d;
	}
	public int getWordsize() {
		return wordsize;
	}
	public void setWordsize(int wordsize) {
		this.wordsize = wordsize;
	}
	public int getMemorysize() {
		return memorysize;
	}
	public void setMemorysize(int memorysize) {
		this.memorysize = memorysize;
	}
	public int getStoragesize() {
		return storagesize;
	}
	public void setStoragesize(int storagesize) {
		this.storagesize = storagesize;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void display() {
		System.out.println("Wordsize is: "+ wordsize);
		System.out.println("Memorysize is: "+ memorysize);
		System.out.println("Storagesize is: "+ storagesize);
		System.out.println("Speed is: "+ speed);
	}
	
}

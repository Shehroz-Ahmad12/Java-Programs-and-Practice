package terminal;

public abstract class GeometricObject {
	String lineColour;
	
	public GeometricObject() {
		
	}
	
	public GeometricObject(String lineColour) {
		
		this.lineColour = lineColour;
	}

	public abstract double calcArea() ;
		
}

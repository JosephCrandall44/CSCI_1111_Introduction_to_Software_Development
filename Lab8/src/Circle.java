public class Circle {
	public static final double DAFULT_RADIUS = 5;
	public static final String DEFAULT_COLOR = "red";

	double radius;
	String color;

	public Circle() {
		radius = DAFULT_RADIUS;
		color = DEFAULT_COLOR;
	}

	public Circle(double radius) {
		this.radius = radius;
		color = DEFAULT_COLOR;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;	
	}
}

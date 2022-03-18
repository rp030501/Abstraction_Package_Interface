package wipro.automobile.ship;

public class compartment {
	private double height;
	private double width;
	private double breadth;
	public compartment(double height, double width, double breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	@Override
	public String toString() {
		return "compartment [height=" + height + ", width=" + width + ", breadth=" + breadth + "]";
	}
}

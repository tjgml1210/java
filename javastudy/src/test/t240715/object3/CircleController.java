package test.t240715.object3;

public class CircleController {
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double cArea =  Math.PI * c.getRadius() *c.getRadius();
		return "면적 : " + c.toString() + cArea ;	
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double cCircum = Math.PI * c.getRadius() *2;
		return "둘레 : " + c.toString() + cCircum;
	}

}

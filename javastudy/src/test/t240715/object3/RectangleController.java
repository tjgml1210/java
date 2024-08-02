package test.t240715.object3;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		double rArea = r.getHeight() * r.getWidth();
		return "면적 : " + r.toString() + " / "+ rArea;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		double rPerimeter = (r.getHeight() + r.getWidth())*2;
		return "둘레 : " + r.toString()+ " / "+ rPerimeter; 
	}

}


interface Shape{
	
	void draw();
}

class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	
}

class Square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square");
	}
	
}

class ShapeFactory{

	public Shape createShapeObject(String string) {
		Shape sh=null;
		if (string.equals("Circle")) 
		{
			sh=new Circle();
		}
		if (string.equals("Square")) 
		{
			sh=new Square();
		}
		return sh;
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		Shape s=new ShapeFactory().createShapeObject("Circle"); 
		s.draw();
		
		Shape s1=new ShapeFactory().createShapeObject("Square"); 
		s1.draw();
	}

}

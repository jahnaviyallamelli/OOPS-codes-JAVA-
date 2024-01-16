
abstract class ShapeTwo
{
	abstract public void getArea();
	abstract public void getPerimeter();
	//2d perimeter
	//

}
abstract class ShapeThree
{
	abstract public void getArea();
	abstract public void getVolume();
	//3d volume;
}

class rectangle extends ShapeTwo
{
	int length,breadth;
	public rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void getArea()
	{
		System.out.println("Area of rectangle is"+length*breadth);
	}
	public void getPerimeter()
	{
		System.out.println("perimeter of rectangle is"+2*length*breadth);
	}
	
}
class square extends ShapeTwo
{
	int side;
	public square(int side)
	{
		this.side=side;
	}
	public void getArea()
	{
		System.out.println("Area of square is"+side*side);
	}
	public void getPerimeter()
	{
		System.out.println("perimeter of square  is"+4*side);
	}
	
}
class cube extends ShapeThree
{
	int side;
	public cube(int side)
	{
		this.side=side;
	}
	public void getVolume()
	{
		System.out.println("Volume of cube is"+side*side*side);
	}
	public void getArea()
	{
		System.out.println("Area of square  is"+4*side*side);
	}
	
}


class circle extends ShapeTwo
{
	double radius;
	public circle(double radius)
	{
		this.radius=radius;
	}
	public void getArea()
	{
		System.out.println("Area of circle is"+Math.PI*radius*radius);
	}
	public void getPerimeter()
	{
		System.out.println("perimeter of circle  is"+2*Math.PI*radius*radius);
	}
	
}
class sphere extends ShapeThree
{
	double radius;
	public sphere(double radius)
	{
		this.radius=radius;
	}
	public void getArea()
	{
		System.out.println("Area of sphere is %.3f%n"+4*Math.PI*radius*radius);
	}
	public void getVolume()
	{
		System.out.println("Volume of circle  is"+4/3*Math.PI*radius*radius*radius);
		
	}
	
}

class cuboid extends ShapeThree
{
	int length,breadth,height;
	public cuboid(int length,int breadth,int height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	public void getArea()
	{
		System.out.println("Area of cube  is"+ 2*(length*breadth+length*height+breadth*height));
	}
	public void getVolume()
	{
		System.out.println("volume of cube is"+height*length*breadth);
	}
	
}





public class Area
{
	public static void main(String args[])
	{
		rectangle r=new rectangle(4,5);
		square s=new square(8);
		circle c=new circle(5);
		cube c2=new cube(6);
		cuboid r2=new cuboid(2,3,4);
		sphere s2=new sphere(3);
		r.getArea();
		r.getPerimeter();
		s.getArea();
		s.getPerimeter();
		c.getArea();
		c.getPerimeter();
		r2.getArea();
		r2.getVolume();
		s2.getArea();
		s2.getVolume();
		c2.getArea();
		c2.getVolume();
		
	}
}

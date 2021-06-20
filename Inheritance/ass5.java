abstract class shape
{
	abstract void display();
	
	
}
class polygon extends shape
{
	void display()
	{
		System.out.println(" polygon  is a shape");
	}

}
class rectangle extends polygon
{
	void display()
	{
		System.out.println("Rectangle is polygon");
	}
}

class triangle extends polygon
{
	void display()
	{
		System.out.println("Triangle is polygon");
	}
}

class squre extends rectangle
{
	void display()
	{
		System.out.println("Square is rectangle");
	}
	
}
public class ass5 
{
	public static void main(String args[])
	{
		shape sh = new polygon();
		sh.display(); // ref of parent object of child
	//	shape sh1 = new shape(); //ref and object both parent
	//	sh1.display();
		rectangle re = new rectangle();
		re.display();
		triangle tr = new triangle();
		tr.display();
		squre sq = new squre();
		sq.display();
	}

}

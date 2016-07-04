package InheritanceDemo;


public class Inheritance {

	public static void main(String[] args) {
		B ob = new B();
		
		ob.a();
		ob.x();
//		ob.y();
		ob.Z();
	}
}

class A
{
	public void a()
	{
		System.out.println("a");
	}
	public void x()
	{
		System.out.println("X");
	}
	public final void Z()
	{
		System.out.println("Z");
		
	}
}

class B extends A
{
  @Override	
  public void a()
  {
	  System.out.println("b");
  }
  public void y()
  {
	  System.out.println("y");
  }
}

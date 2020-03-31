class ovrld
{
   ovrld ()
   {
	   System.out.println("welcome to java constructor");
   }
  ovrld(int a)
  {
	  System.out.println(a);
  }
  ovrld(int a,int b)
  {
	  System.out.println(a+b);
  }
  ovrld(int a,float b,int c)
  {
	  float d=a+b+c;
	  System.out.println(d);
  }
  public static void main(String[] args)
	{
	  ovrld obj=new ovrld(33);
      ovrld obj1=new ovrld(999);
	  ovrld obj2=new ovrld(2,2.0f,6);
	}
}

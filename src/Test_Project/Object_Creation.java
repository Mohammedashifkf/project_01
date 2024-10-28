package Test_Project;

public class Object_Creation {

	void add() {
	
	int a=10;
	int b=20;
	{
		System.out.println(a+b);
	}
}
	
	static void sub() {
		int ab=20;
		int bc=30;
		{
			System.out.println(ab-bc);
		}
	}
	
	
	
public static void main(String[] args) 
    {
		Object_Creation ob=new Object_Creation();
		ob.add();
		ob.sub();
	}

}

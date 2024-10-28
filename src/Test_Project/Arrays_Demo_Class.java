package Test_Project;

public class Arrays_Demo_Class 
{
//Reverse a Names
	
	/*public static void main(String[] args) {
	String a=" Moahmmed Ashif";
		for(int i=a.length()-1;i>=0;i--) 
		{
			System.out.println(a.charAt(i));
		}*/
	//Reverse a Number
	
	public static void main (String[]args)	{
	long n=1234567890987654321L;
	String num=Long.toString(n);
	for(int i=num.length()-1;i>=0;i--)
	{
	
		System.out.println(num.charAt(i));

	}

}
}


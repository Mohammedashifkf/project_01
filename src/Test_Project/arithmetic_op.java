package Test_Project;

public class arithmetic_op {

	public static void main(String[] args) {
		
		
		int age=18;
		if (age>=20) {
		System.out.println("age:"+(age));
		}
		else if (age==18) {
			System.out.println("You are Eligible to vote");
		}
		

     int a=20;
     int b=10;
     //datatypes
     System.out.println("arithmetic :" + a+b);
     
     //float
     float c=2.5f;
     float d=2.0f;
     System.out.println("Floating value :" +c*d);

     //double      
     double f=24.123456378;
     double g=25.122348877;
     System.out.println("Double :"+f+g);
     
     // long 
     long l=252525;
     long m=111111;
     System.out.println("Longestnumber:"+ l * m );
     
     //boolean
     System.out.println("Boolean Value:"+(a>=b));
     
     //string
     String as="Ash";
     String hi="if";
     System.out.println("StringOperators: "+as+hi);
     
     //char
     char a1='Q';
     char a2='T';
     char a3='R';
     char a4='E';
     char a5='E';
     System.out.println("character:"+(a1));
     System.out.println("character:"+(a2));
     System.out.println("character:"+(a3));
     System.out.println("character:"+(a4));
     System.out.println("character:"+(a5));
     
     //Relational operator
     int Rp=20;
     int Rpo=40;
     System.out.println("Greater than:"+(Rp>=Rpo));
     System.out.println("Equals to:"+(Rp==Rpo));
     System.out.println("Not Equal to:"+(Rp!=Rpo));
    
     //arithmetic
     int ab=20;
     int ba=40;
     System.out.println("Subtraction:"+ (ab-ba));
     System.out.println("Division:"+(ba/ab));
     System.out.println("modulous:"+(ba%ab));
     System.out.println("postincrement:"+(ab++));
     System.out.println("Preincrement:"+(++ab));
     System.out.println("PostDecrement:"+(ba--));
     System.out.println("PreDecrement:"+(--ba));
     
     
     //Logical operators
     boolean abc=true;
     boolean cba=false;
     System.out.println("Logiacal and operators:"+(abc&&cba));
     System.out.println("Logical or:"+(abc||cba));
     
     //conditional operators
     int abba=(ab>=20)?40:-1;
     System.out.println("Conditional Opertaors:"+(abba+a));
     
     if(a>b) {
    	 System.out.println("Sucessfully printed");
     }

     else {
    	 System.out.println("the output is wrong");
     }
     
     
     
	}

}

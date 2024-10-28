package Test_Project;

public class Arrays_Concept_S {
	public static void main(String[]args) {
		//array using for loops
		int[] numbers= {20,30,40,50,60};
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
		
		
		String[] Names = {"Subbiah","Kali","Ari","Krishna"};
		int i=0;
		while(i<Names.length) 
		{
			if(Names[i].equals("Subbiah"))
			{
				System.out.println("kali");
				break;
			}
			i++;
		}
		
		
	}

}

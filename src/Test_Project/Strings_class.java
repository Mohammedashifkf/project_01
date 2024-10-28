package Test_Project;

public class Strings_class {

	public static void main(String[] args) {
		
		String name="Mohammed Ashif";
		String name1="AsHiF";
		String name2=" Ari Nayagan ";
		
		System.out.println("Contains"+" " +name.contains("ee"));
		System.out.println("Uppercase"+" "+name1.toUpperCase());
		System.out.println("Concat"+ " " +name.concat(name1));
		System.out.println("Length"+ " " +name.length());
		System.out.println("indexof"+" "+name.indexOf("mm"));
		System.out.println("Contains"+" " +name.contains("As"));
		System.out.println("Substring"+" "+name1.substring(2));
		System.out.println("Trim"+" "+ name2.trim());
		System.out.println("Replace" + " "+name.replace('o', 'u'));
		System.out.println("ReplaceAll"+" "+ name1.replaceAll("AsHiF","Ashif K F"));
		System.out.println("Equals" + " : "+name==name1);
		System.out.println("Ignorecase"+" "+name.equalsIgnoreCase(name1));
	}

}

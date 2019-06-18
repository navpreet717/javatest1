

public class SubstringForkids {

	public static void main(String[] args) {
		System.out.println("SUBSTRING FOR KIDS");
		SubstringForkids g1=new SubstringForkids();

		System.out.println(g1.substringForKids(2, 2, "jap"));
		
		
		System.out.println(g1.substringForKids(1, 7, "harmaghipoiop"));
		System.out.println(g1.substringForKids(2, 4, "sahib"));
		
	
		System.out.println(g1.substringForKids(5, 3, "nav"));
		
	
		System.out.println(g1.substringForKids(3, -2, "raj"));
		
	}

	
	public String substringForKids(int i, int j, String sentence) {
		
String result="";
	if(i < 0 ) {
		return "numbers are no correct";
	} else if(i == j) {
		return "" + sentence.charAt(i);
} else if(i < j){
		
		for(int n=i; n<=j ; n++) {
			result += sentence.charAt(n);
		}
		return result; 
	
	} else {
		return "numbers are no valid in string";
	}
	
}
}


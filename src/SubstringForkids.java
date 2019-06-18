

public class SubstringForkids {

	public static void main(String[] args) {
		System.out.println("substring for the kids");
		
		int t=9;
		int k=8;
		String s="navpreet";
	String commit1=	substringForKids(t,k,s);
	System.out.println(commit1);
		
	
	}

	
	public static String substringForKids(int i, int j, String sentence) {
		
String result="";
	 if(i == j) {
		return "" + sentence.charAt(i);
} 
		return "numbers are not equal";
	}
	
}



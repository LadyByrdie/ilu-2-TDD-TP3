package ilu2;
public class Welcome {
	public static String welcome(String input) {
	if(input==null||input.trim().length()==0) {
			return "Hello, my friend.";
		}
	
		StringBuilder in= new StringBuilder();
		in.append(input);
		return "Hello " + in.toString().substring(0,1).toUpperCase()+in.toString().substring(1);
	}
}

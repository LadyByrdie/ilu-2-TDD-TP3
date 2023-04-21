package ilu2;
public class Welcome {
	public static String welcome(String input) {
	if(input==null||input.trim().length()==0) {
			return "Hello, my friend.";
		}
	
	
	if(input.equals(input.toUpperCase())) {
		return "HELLO, " + input + "!";
	}
	
	StringBuilder in= new StringBuilder();
	input= input.substring(0,1).toUpperCase()+input.toString().substring(1);
	in.append(input);
	return "Hello, " + in.toString();
	}
}

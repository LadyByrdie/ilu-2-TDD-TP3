package ilu2;
public class Welcome {
	public static String welcome(String input){	
	if(input==null||input.trim().length()==0){
		return "Hello, my friend.";
	}
	String[] personnes= input.split(",");
	StringBuilder in= new StringBuilder();
	for(String personne: personnes) {
		in.append(", ");
		if(personne.equals(personne.toUpperCase())) {
			return "HELLO, " + input + "!";
		}
		personne = personne.substring(0,1).toUpperCase()+personne.toString().substring(1);
		in.append(personne);
		}
	return "Hello" + in.toString();
	}
}
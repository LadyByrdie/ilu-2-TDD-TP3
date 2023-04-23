package ilu2;
public class Welcome {
	public static String welcome(String input){	
	if(input==null||input.trim().length()==0){
		return "Hello, my friend.";
	}
	String[] personnes= input.split(",");
	int i=0,j=0;
	String[] majuscule= new String[personnes.length], minuscule= new String[personnes.length];
	for(String personne: personnes) {
		if(personne.equals(personne.toUpperCase())) {
			majuscule[i]=personne;
			i++;
		}else{
			minuscule[j]=personne;
			j++;
		}
	}
	return leReturn(minuscule, majuscule,j,i) ;
	}
//################################################################################
	
	private static String minuscule(String[] input) {
		StringBuilder in= new StringBuilder();
		
		if(input[0]==null) {
			return "";
		}
		
		for(String personne: input) {
			if(personne==null) {
				return "Hello" + in.toString()+".";
			}
			in.append(", ");
			personne = personne.substring(0,1).toUpperCase()+personne.toString().substring(1);
			in.append(personne);
		}
		return "Hello" + in.toString()+".";
	}
//#################################################################################
	
	private static String majuscule(String[] input) {
		StringBuilder in= new StringBuilder();
		if(input[0]==null){	
			return "";
	}
		for(String personne:input) {
			if(personne==null) {
				return "HELLO"+ in.toString() + "!";
			}
			in.append(", ");
			in.append(personne);
		}
		return "HELLO"+ in.toString() + "!";
	}
//##################################################################################
	
private static String leReturn(String[] min, String[] maj, int i1, int i2){
	if(i1<1) {
		return majuscule(maj);
	}
	else if(i2<1) {
		return minuscule(min);
	}
	return minuscule(min) + " AND " +majuscule(maj);
	}
}

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
	
	private static String minuscule(String[] input, int quantite) {
		StringBuilder in= new StringBuilder();
		if(quantite==0) {
			return "";
		}
		
		if(quantite==1){
			input[quantite-1]= input[quantite-1].substring(0,1).toUpperCase()+input[quantite-1].toString().substring(1);
			in.append(input[quantite-1]);
			return "Hello, "+ in.toString() +".";
		}
		
		for(int i=0;i<quantite-1;i++) {
			in.append(", ");
			input[i]= input[i].substring(0,1).toUpperCase()+input[i].toString().substring(1);
			in.append(input[i]);
		}
		in.append(" and ");
		input[quantite-1]= input[quantite-1].substring(0,1).toUpperCase()+input[quantite-1].toString().substring(1);
		in.append(input[quantite-1]);
		
		return "Hello" + in.toString()+".";
	}
//#################################################################################
	
	private static String majuscule(String[] input, int quantite) {
		StringBuilder in= new StringBuilder();
		if(quantite==0){	
			return "";
		}
		
		if(quantite==1){
			input[quantite-1]= input[quantite-1].substring(0,1).toUpperCase()+input[quantite-1].toString().substring(1);
			in.append(input[quantite-1]);
			return "HELLO, "+ in.toString()+"!";
		}
		
		for(int i=0;i<quantite-1;i++){
			in.append(", ");
			in.append( input[i]);
		}
		in.append(" AND ");
		in.append(input[quantite-1]);
		return "HELLO"+ in.toString() + "!";
	}
//##################################################################################
	
private static String leReturn(String[] min, String[] maj, int i1, int i2){
	
	if(i1<1) {
		return majuscule(maj,i2);
	}
	else if(i2<1) {
		return minuscule(min,i1);
	}
	return minuscule(min,i1) + " AND " +majuscule(maj,i2);
	}
}

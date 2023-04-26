package ilu2;
public class Welcome {
	private static int[] nombreParutionsMin;
	private static int[] nombreParutionsMaj;
	private static int min,maj;
	
	public static String welcome(String input){	
	if(input==null||input.trim().length()==0){
		return "Hello, my friend.";
	}
	String[] personnes= input.replace(" ", "").split(",");
	String[] majuscule= new String[personnes.length], minuscule= new String[personnes.length];
	nombreParutionsMin= new int[personnes.length];
	nombreParutionsMaj= new int[personnes.length];
	min=maj=0;
	for(String personne: personnes){
		if(personne.equals(personne.toUpperCase())) {
			triMaj(majuscule,personne);
		}else{
			triMin(minuscule,personne);
		}
	}
	return leReturn(minuscule, majuscule,min,maj);
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
			foismin(in,quantite-1);
			return "Hello, "+ in.toString() +".";}
		for(int i=0;i<quantite-1;i++) {
			in.append(", ");
			input[i]= input[i].substring(0,1).toUpperCase()+input[i].toString().substring(1);
			in.append(input[i]);
			foismin(in,i);
		}
		in.append(" and ");
		input[quantite-1]= input[quantite-1].substring(0,1).toUpperCase()+input[quantite-1].toString().substring(1);
		in.append(input[quantite-1]);
		foismin(in,quantite-1);
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
			foismaj(in,quantite-1);
			return "HELLO, "+ in.toString()+"!";
		}
		for(int i=0;i<quantite-1;i++){
			in.append(", ");
			in.append( input[i]);
			foismaj(in,i);
		}
		in.append(" AND ");
		in.append(input[quantite-1]);
		foismaj(in,quantite-1);
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
//#######################################################################################
private static String[] triMaj(String[] majuscule, String personne) {
		for(int i=0;i<maj;i++) {
			if(majuscule[i].equals(personne)) {
				nombreParutionsMaj[i]++;
				return majuscule;
			}
		}
		majuscule[maj]=personne;
		nombreParutionsMaj[maj]=1;
		maj++;
		return majuscule;
	}
//##########################################################################################
private static String[] triMin(String[] minuscule,String personne) {
		for(int i=0;i<min;i++) {
			if(minuscule[i].equals(personne)) {
				nombreParutionsMin[i]++;
				return minuscule;
			}
		}
		nombreParutionsMin[min]=1;
		minuscule[min]=personne;
		min++;
		return minuscule;
	}
//##########################################################################################
private static StringBuilder foismin(StringBuilder mon, int nom){
	if(min!=0&&nombreParutionsMin[nom]>1)
		mon.append("(x"+String.valueOf(nombreParutionsMin[nom])+")");
	return mon;
}
//#########################################################################################
private static StringBuilder foismaj(StringBuilder mon, int nom){
	if(maj!=0&&nombreParutionsMaj[nom]>1)
		mon.append("(x"+String.valueOf(nombreParutionsMaj[nom])+")");
	return mon;
}
	
}

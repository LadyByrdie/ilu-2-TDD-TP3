package ilu2;
public class Welcome {
	private static int[] nombreParutionsMin;
	private static int[] nombreParutionsMaj;
	private static int min,maj;
	private static boolean yodaMin, yodaMaj;

//##################################################################################
	public static String welcome(String input){	
	if(input==null||input.trim().length()==0){
		return "Hello, my friend.";
	}
	String[] personnes= input.replace(" ", "").split(",");
	String[] majuscule= new String[personnes.length], minuscule= new String[personnes.length];
	nombreParutionsMin= new int[personnes.length];
	nombreParutionsMaj= new int[personnes.length];
	min=maj=0;
	yodaMin=yodaMaj=false;
	for(String personne: personnes){
		if(personne.equals(personne.toUpperCase())) {
			triMaj(majuscule,personne);
			
		}else{
			triMin(minuscule,personne);
		}
	}
	return leReturn(minuscule, majuscule,min,maj);
	}
//###################################################################################
	private static String minuscule(String[] input, int quantite) {
		StringBuilder in= new StringBuilder();
		if(quantite==1){
			transformerMin(in, input[quantite-1],quantite-1);
			}
		else if(quantite>1) {
		transformerMin(in,input[0],0);
		for(int i=1;i<quantite-1;i++) {
			in.append(", ");
			transformerMin(in, input[i],i);
		}
		in.append(" and ");
		transformerMin(in, input[quantite-1],quantite-1);
		}
		return yodaReturnMin(in,quantite);
	}
//#################################################################################
	private static String majuscule(String[] input, int quantite) {
		StringBuilder in= new StringBuilder();
		if(quantite==1){
			transformerMaj(in, input[quantite-1],quantite-1);

		}
		else if(quantite>1){
		in.append(input[0]);
		foismaj(in,0);
		for(int i=1;i<quantite-1;i++){
			in.append(", ");
			transformerMaj(in, input[i],i);
		}
		in.append(" AND ");
		transformerMaj(in, input[quantite-1],quantite-1);
		}
		return yodaReturnMaj(in,quantite);
	}

//#######################################################################################
private static String[] triMaj(String[] majuscule, String personne) {
		for(int i=0;i<maj;i++) {
			if(majuscule[i].equals(personne)) {
				nombreParutionsMaj[i]++;
				return majuscule;
			}
		}
		if(personne.equals("YODA")){
			yodaMaj=true;
		}
		majuscule[maj]=personne;
		nombreParutionsMaj[maj]=1;
		maj++;
		return majuscule;
	}
//##########################################################################################
private static String[] triMin(String[] minuscule,String personne) {
	personne= personne.substring(0,1).toUpperCase()+personne.toString().substring(1);
		for(int i=0;i<min;i++) {
			if(minuscule[i].equals(personne)) {
				nombreParutionsMin[i]++;
				return minuscule;
			}
		}
		if(personne.equals("Yoda")){
			yodaMin=true;
		}
		nombreParutionsMin[min]=1;
		minuscule[min]=personne;
		min++;
		return minuscule;
	}
//##########################################################################################
private static StringBuilder foismin(StringBuilder mon, int nom){
	if(min!=0&&nombreParutionsMin[nom]>1)
		mon.append(" (x"+String.valueOf(nombreParutionsMin[nom])+")");
	return mon;
	}
//#########################################################################################
private static StringBuilder foismaj(StringBuilder mon, int nom){
	if(maj!=0&&nombreParutionsMaj[nom]>1)
		mon.append(" (x"+String.valueOf(nombreParutionsMaj[nom])+")");
	return mon;
	}

//#######################################################################################
private static void transformerMin(StringBuilder builder, String nom,int nombre) {
	builder.append(nom);
	foismin(builder,nombre);
}
//####################################################################################
private static void transformerMaj(StringBuilder builder, String nom,int nombre) {
	builder.append(nom);
	foismaj(builder,nombre);
}
//#############################################################################################
private static String yodaReturnMin(StringBuilder builder,int quantite){
	if(yodaMin){
		return builder.toString() + ", Hello.";
	}
	return "Hello, " + builder.toString() + ".";
	}
//###########################################################################################
private static String yodaReturnMaj(StringBuilder builder, int quantite){
	if(yodaMaj){
		return builder.toString() + " HELLO!";
	}
		return "HELLO, " + builder.toString() + "!";
	
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
//##################################################################################
}
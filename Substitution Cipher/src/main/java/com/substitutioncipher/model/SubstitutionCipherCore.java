package com.substitutioncipher.model;

import java.util.List;

import com.substitutioncipher.dao.SubstitutionCipherDao;

public class SubstitutionCipherCore {
	
	static SubstitutionCipherDao DAO = new SubstitutionCipherDao();
	
	public static String msgmapping(String message) {
		
		List<SubstitutionCipherMapping> Mapping = DAO.getSubstitutionCipherMapping();
		
		char chr = 0;
				
		char[] ch = new char[message.length()];
		
		for (int i = 0; i < message.length(); i++) {
	        
			if ((message.charAt(i)=='a')||(message.charAt(i)=='b')||(message.charAt(i)=='c')||(message.charAt(i)=='d')||
				(message.charAt(i)=='e')||(message.charAt(i)=='f')||(message.charAt(i)=='g')||(message.charAt(i)=='h')||
				(message.charAt(i)=='i')||(message.charAt(i)=='j')||(message.charAt(i)=='k')||(message.charAt(i)=='l')||
				(message.charAt(i)=='m')||(message.charAt(i)=='n')||(message.charAt(i)=='o')||(message.charAt(i)=='p')||
				(message.charAt(i)=='q')||(message.charAt(i)=='r')||(message.charAt(i)=='s')||(message.charAt(i)=='t')||
				(message.charAt(i)=='u')||(message.charAt(i)=='v')||(message.charAt(i)=='w')||(message.charAt(i)=='x')||
				(message.charAt(i)=='y')||(message.charAt(i)=='z'))
			{
					//Mapped to retrieval from database, where the key can be changed.
				
					if(message.charAt(i)=='a') {
					chr = Mapping.get(0).getAlp1mapping().charAt(0);
					}
					
					if(message.charAt(i)=='b') {
					chr = Mapping.get(0).getAlp2mapping().charAt(0);
					}
					
					if(message.charAt(i)=='c') {
					chr = Mapping.get(0).getAlp3mapping().charAt(0);
					}
					
					if(message.charAt(i)=='d') {
					chr = Mapping.get(0).getAlp4mapping().charAt(0);
					}
					
					if(message.charAt(i)=='e') {
					chr = Mapping.get(0).getAlp5mapping().charAt(0);
					}
					
					if(message.charAt(i)=='f') {
					chr = Mapping.get(0).getAlp6mapping().charAt(0);
					}
					
					if(message.charAt(i)=='g') {
					chr = Mapping.get(0).getAlp7mapping().charAt(0);
					}
					
					if(message.charAt(i)=='h') {
					chr = Mapping.get(0).getAlp8mapping().charAt(0);
					}
					
					if(message.charAt(i)=='i') {
					chr = Mapping.get(0).getAlp9mapping().charAt(0);
					}
					
					if(message.charAt(i)=='j') {
					chr = Mapping.get(0).getAlp10mapping().charAt(0);
					}
					
					if(message.charAt(i)=='k') {
					chr = Mapping.get(0).getAlp11mapping().charAt(0);
					}
					
					if(message.charAt(i)=='l') {
					chr = Mapping.get(0).getAlp12mapping().charAt(0);
					}
					
					if(message.charAt(i)=='m') {
					chr = Mapping.get(0).getAlp13mapping().charAt(0);
					}
					
					if(message.charAt(i)=='n') {
					chr = Mapping.get(0).getAlp14mapping().charAt(0);
					}
					
					if(message.charAt(i)=='o') {
					chr = Mapping.get(0).getAlp15mapping().charAt(0);
					}
					
					if(message.charAt(i)=='p') {
					chr = Mapping.get(0).getAlp16mapping().charAt(0);
					}
					
					if(message.charAt(i)=='q') {
					chr = Mapping.get(0).getAlp17mapping().charAt(0);
					}
					
					if(message.charAt(i)=='r') {
					chr = Mapping.get(0).getAlp18mapping().charAt(0);
					}
					
					if(message.charAt(i)=='s') {
					chr = Mapping.get(0).getAlp19mapping().charAt(0);
					}
					
					if(message.charAt(i)=='t') {
					chr = Mapping.get(0).getAlp20mapping().charAt(0);
					}
					
					if(message.charAt(i)=='u') {
					chr = Mapping.get(0).getAlp21mapping().charAt(0);
					}
					
					if(message.charAt(i)=='v') {
					chr = Mapping.get(0).getAlp22mapping().charAt(0);
					}
					
					if(message.charAt(i)=='w') {
					chr = Mapping.get(0).getAlp23mapping().charAt(0);
					}
					
					if(message.charAt(i)=='x') {
					chr = Mapping.get(0).getAlp24mapping().charAt(0);
					}
					
					if(message.charAt(i)=='y') {
					chr = Mapping.get(0).getAlp25mapping().charAt(0);
					}
					
					if(message.charAt(i)=='z') {
					chr = Mapping.get(0).getAlp26mapping().charAt(0);
					}
			
			}
			
			else {
					chr = message.charAt(i);
			}
			
			 ch[i] = Character.toLowerCase(chr);
			 								
	    }
		
		String finalMsg = String.valueOf(ch);
		
		return finalMsg;
		
	}

}

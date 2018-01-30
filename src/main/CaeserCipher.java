package main;

public class CaeserCipher {

	/*
	 * hop= 2
	 * middle-Outz ciphers to okffng-Qwvb
	 * a - z ASCII 97-122
	 * A - Z ASCII 65-90
	 * */

	public static void main(String[] args) {
		String text="middle-Outz";
		int hop = 2;
		char[] charInt= new char[text.length()];
		int number;
		for(int i =0; i<text.length(); i++){
			number=(int) text.charAt(i);
			if(!Character.isLetter(text.charAt(i))){
				charInt[i]=text.charAt(i);	
			}else if(122>=number && number>=97 )
				charInt[i]=(char) ((number+hop-97)%26 + 97);
			else if(90>=number && number>=65){ 
				charInt[i]=(char) ((number+hop-65)%26 + 65);
			}
		}
		System.out.println(new String(charInt));
	}

}

package main;

public class Encryption {

	/**
	 * An English text needs to be encrypted using the following encryption scheme. 
	 * First, the spaces are removed from the text. Let L be the length of this text. 
	 * Then, characters are written into a grid, whose rows and columns have the following constraints:
	 * 1. Ceil.L=<row=<column=<Floor.L
	 * 2. rows*columns>=L
	 * */

	public static void main(String[] args) {
		String s= "haveaniceday";
		s=s.replaceAll(" ", "");
		int column=  (int) Math.ceil(Math.sqrt(s.length()));
		int row=  (int) Math.floor(Math.sqrt(s.length()));

		//	int i=0, j=0;
		//	while(j<(s.length()-columnCeil)){
		//		matrix[i]=s.substring(j, j+columnCeil);
		//		j+=columnCeil;
		//		i++;
		//	}
		//	matrix[i]= s.substring(j, s.length());

		if(column * row >= s.length()){
			encrypt(s, row, column);
		}else{
			row= column+1;
			encrypt(s, row, column);
		}
	}

	private static void encrypt(String string, int row, int column) {
		/* String = adg jbeh kcfil
		 * 3 rows, 4 columns
		 * a d g j
		 * b e h k
		 * c f i l
		 * 
		 * abc def ghi jkl
		 * */
		for(int i=0; i< column; i++){
			int index=i;
			for(int j=0; j< row; j++){
				if(index <= string.length()-1)
					System.out.print(string.charAt(index));
				index+=column;
			}
			System.out.print(" ");
		}
	}

}

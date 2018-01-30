package main;
import java.io.IOException;
import java.util.Scanner;

public class RaiseNumPow {
	public static void main(String[] args) throws IOException
	{
		Scanner scanner= new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println(findPower(x,y));
		scanner.close();
	}

	private static int findPower(int x, int y) {
		if(y==0){
			return 1;
		}else if(y==1){
			return x;
		}else{
			return x*findPower(x,y-1);
		}
	}
}

package Class1;

import java.util.Scanner;

public class p2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Count = sc.nextInt();
		
		StringBuilder Stb = new StringBuilder();
		
		for(int i = 0; i < Count; i++) {
			Stb.append("*");
			System.out.println(Stb);
		}
	}

}

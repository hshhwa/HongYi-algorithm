package Class1;

import java.util.Scanner;

public class p1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] strr = new String[3];
		
		strr[0] = ">";
		strr[1] = "<";
		strr[2] = "==";
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int check = 0;
		
		if(A > B) {
			check = 0;
		}
		else if(A < B) {
			check = 1;
		}
		else {
			check= 2;
		}
		
		System.out.println(strr[check]);
	}

}

package Class1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class p1000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < 2; i++) {
			arr.add(sc.nextInt());
		}
		int sum = arr.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum);
	}

}


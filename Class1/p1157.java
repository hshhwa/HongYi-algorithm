package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1157 {

	public static void main(String[] args) throws IOException {
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(bf.readLine());
		 
		 String s = st.nextToken();
		 
		 int MAX_INDEX = s.length();
		 
		 int[] arr = new int[26];
		 
		 for(int i = 0; i < MAX_INDEX; i++) {
			 if('a' <= s.charAt(i) && 'z' >= s.charAt(i)) {
				 arr[s.charAt(i) - 97]++;
			 }
			 else {
				 arr[s.charAt(i) - 65]++;
			 }
		 }
		 
		 int MaxCount = 0;
		 int charindex = 0;
		 
		 for(int i = 0; i < 26; i++) {
			 if(arr[i] > MaxCount) {
				 MaxCount = arr[i];
				 charindex = i;
			 }
			 else if (arr[i] == MaxCount) {
				 charindex = -1;
			 }
		 }
		 
		 
		 char result;
		 
		 if(charindex == -1) {
			 result = '?';
		 }
		 else {
			 result = (char)(charindex + 65);
		 }
		 

		 System.out.println(result);
	}

}

package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p11728 {

	public static void main(String[] args) throws IOException {
		// Scanner 시간오버
				 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				 StringTokenizer st = new StringTokenizer(bf.readLine());
				 
				
				int N = Integer.parseInt(st.nextToken());
				int M = Integer.parseInt(st.nextToken());
				
				
				int [] ConcatArr = new int[N + M];
				
				st = new StringTokenizer(bf.readLine());
				for(int i = 0; i < N; i++) {
					ConcatArr[i] = Integer.parseInt(st.nextToken());
				}

				st = new StringTokenizer(bf.readLine());
				for(int i = N; i < M + N; i++) {
					ConcatArr[i] = Integer.parseInt(st.nextToken());
				}
				
				bf.close();
				
				Arrays.sort(ConcatArr);
				
				// 시간오버
//				while(A < N && B < M) {
//					
//					if(arrA[A] <= arrB[B]) {
//						ConcatArr[index] = arrA[A++];
//					}
//					else {
//						ConcatArr[index] = arrB[B++];
//					}
//					index++;
//				}
//				
//				
//				
//				while (A < N) {
//					ConcatArr[index++] = arrA[A++];
//				}
//				
//				while (B < N) {
//					ConcatArr[index++] = arrB[B++];
//				}
//				
				StringBuilder stb = new StringBuilder();
				// 시간오버 
//				System.arraycopy(arrA, A, ConcatArr, index, N - A);
//				index += (N - A);
//		
//				System.arraycopy(arrB, B, ConcatArr, index, M - B);
//				index += (M - B);

				for(int r : ConcatArr) {
					stb.append(r+" "); 				
				}
				
				System.out.println(stb);
			}

}

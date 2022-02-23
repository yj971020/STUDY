package baekjoon;

import java.util.Scanner;

public class P11021 {

	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		int sum=0;
		int answer[]=new int[n];
		
		for(int i=0;i<2*n;i++) {
			sum+=in.nextInt();
			if(i%2==1){
				answer[i/2]=sum;
				sum=0;
			}
		}
		for(int i=0;i<answer.length;i++) {
			System.out.printf("Case #%d: %d\n",i+1,answer[i]);
		}

	}

}

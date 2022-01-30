package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1546 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] scores = new int[n];
		int max=0;
		double sum=0;
		for(int i=0;i<n;i++) {
			scores[i]=in.nextInt();
			if(max<scores[i])
					max=scores[i];
		}
		for(int i=0;i<n;i++) {
		
		sum=sum+(double)scores[i]/max*100;
		}
		System.out.println((double)sum/n);
	}
}

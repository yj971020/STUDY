package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P8958 {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.nextLine()); 
		String[] OX=new String[n];
		int[] answer=new int[n];
		
		for(int i=0;i<n;i++) {
			OX[i]=in.nextLine();
			String[] sp= OX[i].split("");
			int score=0;
			for(int j=0;j<sp.length;j++) {
				if(sp[j].equals("O")) {
					answer[i]+= ++score;
				}else if(sp[j].equals("X")) {
					score=0;
				}
				}
		}
	
		for(int i:answer) {
			System.out.println(i);
		}
		
		
	}
}

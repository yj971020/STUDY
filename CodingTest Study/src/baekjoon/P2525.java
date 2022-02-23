package baekjoon;

import java.util.Scanner;

public class P2525 {
	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		
		int hour=sc.nextInt();
		int min=sc.nextInt();
		int d=sc.nextInt();
		
		hour+=(min+d)/60;
		min=(min+d)%60;
		
		if(hour>=24)
			hour=hour%24;
		
			System.out.println(hour+" "+min);
	}
}

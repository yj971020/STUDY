package baekjoon;

import java.util.Scanner;

public class P1316 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.nextLine());
		String[] arr=new String[n];
		int answer=n;
		
		for(int i=0;i<n;i++) {
		arr[i]=in.nextLine();
		String[] st=arr[i].split("");
		
			outer:
			for(int j=0;j<st.length;j++) {
				if(j!=st.length-1) { // ������ �ε����� �ƴҶ�
					if(st[j].equals(st[j+1])) { //���� ���ڿ� ���ٸ� 
						continue;
					}else {
						
						for(int k=j+2;k<st.length;k++){
							if(st[j].equals(st[k])) {
								answer--;
								break outer;
							}
							
						}
						
					}
					
				}
			}
		}

		System.out.println(answer);
	}

}

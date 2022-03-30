3import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    System.out.println(solution(x));
    
  }

// 등차수열 사용
  static String solution(int x){
    int sum=0; 
    int sumnum=1;
    while(true){
      sum+=sumnum++;
      if(sum>=x){
        break;
      }
    }
    int a=0,b=0;// 분자, 분모
    if(sumnum%2==1){ // 홀수 이면
      a=(sumnum-1-(sum-x));
      b=1+(sum-x);
    }else{
         b=(sumnum-1-(sum-x));
          a=1+(sum-x);
    }
 
    return a+"/"+b;
  }
}

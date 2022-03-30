import java.util.Scanner;

//부녀회장이 될거야!
public class P2775 {
    public static void main(String args[]) {
    
    Scanner in= new Scanner(System.in);
    int T=in.nextInt();
         for(int i=0;i<T;i++){
        int k = in.nextInt();
        int n=in.nextInt();
        solution(k,n);
          }
    
    }

    
    public static void solution(int k, int n){
        //k : 층, N : 호수 ( 1 부터 시작) 
        // 호수 -1 =  열
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=i+1;
        }
        
       for(int i=0;i<k;i++){
           int[] newArr=array;
            int sum=0;
             for(int j=0;j<n;j++){
                sum+=array[j];
                newArr[j]=sum;
             }
             array=newArr;
            
       }
       
       System.out.println(array[n-1]);
    }
}

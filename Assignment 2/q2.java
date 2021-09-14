import java.util.*;
public class question2 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in); 
     int n=sc.nextInt();
     int[] arr=new int[n],cr=new int[20];
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
         cr[arr[i]]++;
     }
     for(int i=0;i<20;i++){
         while(cr[i]--!=0){
             System.out.print(i+" ");
         }
     }
     
    }
}
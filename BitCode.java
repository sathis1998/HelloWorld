import java.util.*;
public class Solution
{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int binary[] = new int[40];  
   int decimal =161;
         int index = 0;  
         int count=0;
        while(decimal > 0){    
         binary[index++] = decimal%2;    
         decimal = decimal/2;    
        }    
        for(int i = index-1;i >= 0;i--){
            if(binary[i]==1){
                count++;
            }
       // System.out.print(binary[i]);    
     }
     System.out.print(count);
      for(int i = index-1;i >= 0;i--){
            if(binary[i]==1){
                System.out.print(i);
            }
       // System.out.print(binary[i]);    
     }
}
}

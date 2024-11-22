import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
       char[] c=A.toCharArray();
       int r=c.length;
       int s=0;
       int l=r-1;
       while(s<=l){
           char t=c[s];
           c[s]=c[l];
           c[l]=t;
           s++;
           l--;
       }
       if(Arrays.equals(A.toCharArray(),c)){
           System.out.println("Yes");
       }
       else{
       System.out.println("No");
    }
       sc.close();
    }
}




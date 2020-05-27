//Arrange ARRAY
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        String a;
        char b[]=new char[100];
        Scanner s=new Scanner(System.in);
        a=s.nextLine();
        int l=a.length();
        int k=l-1,i=0,p=0,q=0;
        for(i=0;i<l;i++)
        {
            char n=a.charAt(i);
            if(n>=65&n<90)
            {
                q++;
            }
        }
        
        for (i=0;i<l;i++)
        {
            char c=a.charAt(i);
            if(c>=65&c<90)
            {
                --q;
                b[k-q]=c;   
            }
            else
            {
                b[p]=c;
                p++;
            }

        }
        for(i=0;i<l;i++)
        {
            System.out.print(""+b[i]);
        }
     
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    }
}



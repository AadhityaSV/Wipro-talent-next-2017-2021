//powers of 2
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'isPower' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> isPower(List<Integer> arr) {
    
    int n=arr.size();
    int i,j=0,k;
    double b;
    ArrayList<Integer> a=new ArrayList<Integer>();
    for(i=0;i<n;i++)
    {
        k=arr.get(i);
        b=k;
        while(b!=2.0 & b>=2.0)
        {
            b=b/2.0;
        }
        if(b%2==0)
        {
            a.add(1);
            
        }
        else
            a.add(0);

    }
    return (a);    // Write your code here

    }

}

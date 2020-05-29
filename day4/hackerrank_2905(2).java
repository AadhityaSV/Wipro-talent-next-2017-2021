//sort the summary
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'groupSort' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<List<Integer>> groupSort(List<Integer> arr) {
    int n=arr.size();
    int i,j,d=0,k;
    int b[][]=new int[n][2];
    b[0][0]=arr.get(0);
    for(i=0;i<n;i++)
    {
        k=arr.get(i);
        for(j=0;j<n;j++)
        {
            if(b[i][j]==k)
                d++;
        }
        b[i][j]=k;
        b[i][j+1]=d;
    }
    return b;
    }
    

}


//Sum them all
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'arraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static int arraySum(List<Integer> numbers) {
        int sum=0;
        int l=numbers.size();
        for(int i=0;i<l;i++)
        {
            sum=sum+numbers.get(i);
        }
    // Write your code here
    return sum;
    }

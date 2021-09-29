import java.util.*;
public class Trace
{
    public static void main(String args[])
    {
        int array[][]=new int[][]{{1,2,3},{3,2,1},{4,5,6}};
        int i, j;
        double sum = 0;

        System.out.println("Trace :  ");
  	for(i = 0; i < 3; i++)
  	{  
    	    for(j = 0; j < 3; j++)
       	    {
                if(i == j)
            	 {
               	     sum = sum + (array[i][j]);
               	 }
            }
        }
        System.out.println(sum);
    }
}
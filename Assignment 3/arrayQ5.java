import java.util.*;
public class Solution {
    public static void main (String[] args)
 {
         
        int mat[][] = { { 1, 3, 5 },
                    { 3, 2, 4 },
                    { 5, 4, 1 } };
        boolean flag=false;
        int tr [][]=new int[3][3];
        for (int i = 0; i < 3; i++)
        {   for (int j = 0; j < 3; j++)
            {   tr[i][j] = mat[j][i];
            }
        }
        for (int i = 0; i < 3; i++)
        { for (int j = 0; j < 3; j++)
            { if (mat[i][j] != tr[i][j])
                { System.out.println ( "No"); 
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }    
    if (!flag){
        System.out.println( "Yes");
    }
}
}
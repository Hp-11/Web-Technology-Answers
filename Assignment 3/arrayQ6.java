import java.util.*;
public class ModulusOfAMatrix {
    public static void main(String[] args) {
        
        int[][] matrix=new int[][]{{1,2,3},{3,4,5},{6,5,8}};
        
        int determinant,x,y,z;
        x=(matrix[0][0] * (matrix[1][1] * matrix[2][2]
                       - matrix[1][2] * matrix[2][1]));
        y=(matrix[0][1] * (matrix[1][0] * matrix[2][2]
                       - matrix[1][2] * matrix[2][0]));
        z=(matrix[0][2] * (matrix[1][0] * matrix[2][1]
                       - matrix[1][1] * matrix[2][0]));
        determinant= x - y + z;
        System.out.println("The modulus of the given matrix is "+ determinant);
 
    }
}
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

       
        System.out.print("Enter the number of rows: ");
        int x = scan.nextInt();
        System.out.print("Enter the number of columns: ");
        int y = scan.nextInt();

        
        int num[][] = new int[x][y];
        
        
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                num[i][j] = scan.nextInt();
            }
        }
        
        for(int i=0;i<x;i++){
            int R_Sum=0;
            for(int j=0;j<y;j++){
                R_Sum=R_Sum + num[i][j];
                
            }
            System.out.printf("\nsum of %d row: %d\n",i+1,R_Sum);
        }
        for(int i=0;i<y;i++){
            int C_Sum=0;
            for(int j=0;j<x;j++){
                C_Sum = C_Sum + num[j][i];
                
            }
            System.out.printf("\nsum of %d colum: %d\n",i+1,C_Sum);
        }
        
    }
}

import java.util.Scanner;
public class q4 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num[]=new int[10];
        
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<=9;i++){
            System.out.println("Enter elements in array");
            num[i]=scan.nextInt();
            if(num[i]<min){
                min=num[i];
            }
            if(num[i]>max){
                max=num[i];
            }
        }
        
        System.out.print("Maximum number is: "+max);
        System.out.print("Minimum number is: "+min);
    }
}

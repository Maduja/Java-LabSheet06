import java.util.Scanner;
public class q7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter your array size: ");
        n=scan.nextInt();
        int num[] = new int[n];
        
        for(int i=0;i<num.length;i++){
            System.out.println("Enter array elements: ");
            num[i]=scan.nextInt();
        }
        System.out.print("even array is: ");
        for(int j=0;j<num.length;j++){
            if(num[j]%2==0){
                System.out.print(num[j]+",");
                
            }
        }
        System.out.print("\nodd array is: ");
        for(int j=0;j<num.length;j++){
            if(num[j]%2!=0){
                System.out.print(num[j]+",");
                
            }
        }
   
    }
}


import java.util.Scanner;
public class q6 {
    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n,m;
        System.out.println("Enter your array size: ");
        n=scan.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter your element: ");
            arr[i]=scan.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                if(arr[j]<arr[k]){
                    m=arr[j];
                    arr[j]=arr[k];
                    arr[k]=m;
                }
            }
        }
        System.out.println("desc5ending order is: ");
        for(int l=0;l<arr.length;l++){
            System.out.println(arr[l]+",");
        }
    }
}

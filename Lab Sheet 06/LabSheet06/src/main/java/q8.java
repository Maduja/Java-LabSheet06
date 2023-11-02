import java.util.Scanner;
public class q8 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n,count = 1,m;
        System.out.print("Enter your array size: ");
        n=scan.nextInt();
        int num[] = new int[n];
        
        System.out.println("Enter array elements: ");
        for(int i=0;i<num.length;i++){
            num[i]=scan.nextInt();
        }
        System.out.println("Repeated elements and freequency");
        for(int j=0;j<num.length;j++){
            for(int k=j+1;k<num.length;k++){
                if(num[j]==num[k]){
                    count=count+1;
                    m=num[j];
                    
                    System.out.println("\n"+m+","+count);
                }
            
            }
        
        }
        
    }
}

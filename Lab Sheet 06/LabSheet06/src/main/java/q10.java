import java.util.Vector;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Enter value: ");
        int n=scan.nextInt();
        
        Vector<Integer> v =new Vector<Integer>();
        
        for(int i=0;i<n;i++){
            System.out.print("Enter numbers: ");
            x=scan.nextInt();
            v.add(x);
        }
        
        System.out.print("Enter max number: ");
        int y=scan.nextInt();
        
        for(int i=0;i<v.size();i++){
            if(v.get(i)<y){
                v.remove(i);
                i--;
            }
        }
        System.out.println("Updated Vector after removing elements less than " + y + ": " + v);
    }
}

import java.util.Scanner;
public class q3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age[]=new int[10];
        int count=0;
        for(int i=0;i<age.length;i++){
            System.out.println("Enter your age: ");
            age[i]=scan.nextInt();
        }
        for(int j=0;j<10;j++){
            if((age[j]>=12)&(age[j]<=25)){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}

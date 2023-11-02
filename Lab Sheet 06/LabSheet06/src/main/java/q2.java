
public class q2 {
    public static void main(String[] args){
        float arr1[]={1.5f,2.5f,3.5f,4.5f,5.5f};
        float avg =0;
        float sum=0;
        for(int i=0;i<arr1.length;i++){
            sum=sum+arr1[i];
            avg=sum/arr1.length;
        }
        System.out.print("The Average of array: "+avg);
    }
}

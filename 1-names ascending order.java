
import java.util.*;
class ascjava{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Strings:");
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        Arrays.sort(s);
        for(int i=0;i<n;i++){
            System.out.println(s[i]+" ");
        }
    }
}

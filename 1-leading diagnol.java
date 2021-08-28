import java.util.*;
class week3a {
      public static void main(String[] args) {

            Scanner input=new Scanner(System.in);

            int n,i,index=0;

            System.out.println("Enter the size of matrix ");
            n=input.nextInt();

            System.out.println("Enter the elements");

            int arr[]=new int[n*n];
            
            for(i=0;i<n*n;++i)
                  arr[i]=input.nextInt();

            System.out.print("The Diagnol Elements are " + arr[0]);

            for(i=1;i<n;++i){
                  index =index + n + 1 ;
                  System.out.print(" " + arr[index]);
            }
      }
}

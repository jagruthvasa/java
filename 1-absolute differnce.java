import java.util.*;

class week3c {
      public static void main(String[] args) {

            Scanner input=new Scanner(System.in);

            int n,i,diff=0,j;
            System.out.println("Enter the size of matrix ");

            n=input.nextInt();
            int arr[][]=new int[n][n];
            
            System.out.println("Enter the elemnts in the matrix ");

            for(i=0;i<n;++i)  
                  for(j=0;j<n;j++)
                        arr[i][j]=input.nextInt();

            int sum1=0,sum2=0;

            int flag=n-1;

            for(i=0;i<n;i++){
                  j=i;
                  sum1 += arr[i][j];
                  sum2 += arr[i][flag];
                  --flag;
            }

            diff=Math.abs((sum1-sum2));
            System.out.println("The absolute difference is " + diff);
      }
}
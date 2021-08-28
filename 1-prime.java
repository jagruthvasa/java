import java.util.*;

class week2b {
      public static void main(String[] args) {

            Scanner in=new Scanner(System.in);
            
            System.out.println("Enter the no of inputs");
            int n=in.nextInt();

            int i,j,flag,found=1;
            int arr[]=new int[n];

            System.out.println("Enter the inputs");

            for(i=0;i<n;i++)
                  arr[i]=in.nextInt();
            
            for(i=0;i<n;i++){

                  flag=0;
                  for(j=2;j<=arr[i]/2+1;j++){

                        if(arr[i] % j == 0){
                              ++flag;
                              break;
                        }      
                  }
                  
                  if(flag==0){
                        System.out.println("The  prime and odd number is "+arr[i]);
                        found=0;
                  }
            }

            if(found==1)
                  System.out.print("Not Found");  
      }     
}
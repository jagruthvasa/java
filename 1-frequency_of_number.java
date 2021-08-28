import java.util.*;

class week2c {
      public static void main(String[] args) {
            
            Hashtable <Integer,Integer> hash=new Hashtable<Integer,Integer>();
      
            Scanner input=new Scanner(System.in);
            int n,i,value;

            System.out.println("Enter the no of inputs");

            n=input.nextInt();

            int arr[]=new int[n];

            System.out.println("Enter the inputs");

            for(i=0;i<n;++i)
                  arr[i]=input.nextInt();

            for(i=0;i<n;i++){

                  if(hash.get(arr[i])==null)
                        hash.put(arr[i],1);
            

                  else{
                        value =hash.get(arr[i]);
                        hash.put(arr[i],++value);
                  }
            }

            for(i=0;i<n;++i){

                  if(hash.containsKey(arr[i]))

                        if(hash.get(arr[i]) != -1){

                              System.out.println(arr[i]  + ":" + hash.get(arr[i]));
                              hash.put(arr[i],-1);
                        }
            }
      }
}

class sharedresourcee{

      boolean flag = false;
      int n;

      synchronized public void put(int i){

            if(flag)
                  try{  wait(); } catch(Exception e) {}
            n=i;
            System.out.println("put " + n);
            flag=true;
            notify();
            
      }

      synchronized public void get(){

            if(!flag)
                  try{  wait(); } catch (Exception e){}

            System.out.println("get " + n);

            flag = false;

            notify();

      }

}

class consumer extends Thread{

      sharedresourcee s;

      consumer( sharedresourcee s){

            this.s=s;
      }

      public void run(){
            for(int i=0;i<5;++i)
                  s.get();
      }
}

class producer extends Thread {
      
      sharedresourcee s;

      producer( sharedresourcee s){

            this.s=s;
      }

      public void run(){

            for(int i=0;i<5;++i)

                  s.put(i);
      }

}

public class producerconsumer {

      public static void main(String[] args) {

            sharedresourcee s = new sharedresourcee();

            producer p = new producer(s);
            p.start();

            consumer c = new consumer(s);
            c.start();
      }
}




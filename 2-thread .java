class goodmorning extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Good Morning");
            try{ Thread.sleep(1000); }catch(Exception e){}
        }
    }
}
class hello extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try{ Thread.sleep(2000); }catch(Exception e){}
        }
    }
}
class welcome extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Welcome");
            try{ Thread.sleep(3000); }catch(Exception e){}
        }
    }
}
    class ThreadDemo{
    public static void main(String ar[]) throws Exception{
        goodmorning obj1=new goodmorning();
        hello obj2=new hello();
        welcome obj3=new welcome();
        obj1.start();
        obj2.start();
        obj3.start();

    }
}

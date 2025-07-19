 class myThread extends Thread{
   public void run(){
     try{
     for(int i = 0; i <= 5; i++){
       System.out.println("Sahil");
       Thread.sleep(1000);
        }
     }
     catch(Exception e){
       System.out.println(e);
     }
   
    }
  }
 public class Main{
  public static void main(String[] args) throws Exception{
    myThread t1 = new myThread();
    t1.start();
    
    
     for(int i = 0; i <= 5; i++){
       System.out.println("Bharti");
       Thread.sleep(1000);
     }
  }
 }
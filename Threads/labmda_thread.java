public class labmda_thread {
    public static void main(String[] args){
        Runnable r1 = new Runnable() {
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println("Hi");
                    try{Thread.sleep(10);}catch(Exception e){}
                }      
            }
        };
        Runnable r2 =new Runnable() {
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.println("Hello");
                    try{Thread.sleep(10);}catch(Exception e){}
                }
            }
        };
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}
        t2.start();
    }
}

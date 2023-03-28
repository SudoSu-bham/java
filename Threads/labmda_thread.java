public class labmda_thread {
    public static void main(String[] args){
        // Runnable r1 = () -> {
        //         for(int i=0;i<10;i++){
        //             System.out.println("Hi");
        //             try{Thread.sleep(10);}catch(Exception e){}
        //         }      
        // };
        
        Thread t1 = new Thread(() -> {
            for(int i=0;i<10;i++){
                System.out.println("Hi");
                try{Thread.sleep(100);}catch(Exception e){}
            }      
    });
        Thread t2 = new Thread(() -> {
            for(int i=0;i<10;i++){
                System.out.println("Hello");
                try{Thread.sleep(100);}catch(Exception e){}
            }
    });
        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}
        t2.start();
    }
}

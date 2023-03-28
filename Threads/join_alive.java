import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class join_alive {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() ->{
            for(int i=0;i<10;i++){
                System.out.println("Hi");
                try{
                    Thread.sleep(100);
                }
                catch(Exception e){
                    System.out.print("Error Occured: \n");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0;i<10;i++){
                System.out.println("Hello");
                try{
                    Thread.sleep(100);
                }
                catch(Exception e){
                    System.out.print(e.getMessage());
                }
            }
        });
        t1.start();
        t2.start();
        
        System.out.println(t1.isAlive());
        //Comment join to see the changes
        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}

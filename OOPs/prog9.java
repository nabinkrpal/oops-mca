// MainThreadOperations
public class prog9 {
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        
        mainThread.setName("My Main Thread");

        mainThread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Thread Name: " + mainThread.getName());
        System.out.println("Thread Priority: " + mainThread.getPriority());

        for (int i = 0; i < 20; i++) {
            System.out.println("Main thread is running: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
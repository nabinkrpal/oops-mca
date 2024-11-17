// ChildThreadExample 
public class prog10 {
    public static void main(String[] args) {
        Thread childThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Child Thread: " + i);
                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


        childThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
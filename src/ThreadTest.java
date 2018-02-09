public class ThreadTest {
    public static void main(String[] args ) {
        Thread1 thread1 = new Thread1();
        Thread1 thread11 = new Thread1();
        thread1.start();
        thread11.start();
        for(int i = 0 ; i < 11 ; i++) {
            System.out.println("main:"+i);
        }
    }




    public static class Thread1 extends Thread {
        public void run() {
            for(int i = 0 ; i < 11 ; i++) {
                System.out.println("T1:"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


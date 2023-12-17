import java.util.concurrent.*;

class MyTask implements Runnable {
    private String name;

    public MyTask(String name) {
        this.name = name;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    @Override
    public void run() {
        try {
                    System.out.println("실행중 : " +name);
                    Thread.sleep((long)(Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadPoolTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        for(int i = 1; i <= 5; i++) {
            MyTask task = new MyTask("작업" + i);
            System.out.println("작업 생성 : " + task.getName());
            executor.execute(task);

        }

        executor.shutdown();
    }
}
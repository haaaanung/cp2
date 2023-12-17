public class RambdaThread {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i <= 10; i++)
                System.out.println(i + " ");
        };
        new Thread(task).start();
    }
}
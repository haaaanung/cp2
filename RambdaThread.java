public class RambdaThread {     //람다식을 이용한 스트림 생성(Runnable 인터페이스 이용)
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i <= 10; i++)
                System.out.println(i + " ");
        };
        new Thread(task).start();
    } 
}
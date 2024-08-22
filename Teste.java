package MinhaThreadRunnable;

public class Teste {
    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 200);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 400);
    }
}
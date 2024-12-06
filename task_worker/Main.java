package dz_lyambda_and_stream_api.task_worker;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;

        Worker worker = new Worker(listener);
        worker.start();
    }
}

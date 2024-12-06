package dz_lyambda_and_stream_api.task_worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}

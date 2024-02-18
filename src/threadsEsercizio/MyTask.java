package threadsEsercizio;

public class MyTask implements Runnable{
    private String taskName;
    private int nStep, delay;

    public MyTask(String taskName, int nStep, int delay) {
        this.taskName = taskName;
        this.nStep = nStep;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 0; i < nStep ; i++) {
            System.out.printf("\n%s, step: %3d [%s]", taskName, i,
                    Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(delay);
            } catch (InterruptedException e) {

            }
        }
    }
}

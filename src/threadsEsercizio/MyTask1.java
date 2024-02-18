package threadsEsercizio;

import java.util.concurrent.Callable;

public class MyTask1 implements Callable<Integer> {

    private String taskName;
    private int nStep, delay;

    public MyTask1(String taskName, int nStep, int delay) {
        this.taskName = taskName;
        this.nStep = nStep;
        this.delay = delay;
    }

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < nStep; i++) {
            System.out.printf("\n%s, step: %3d [%s]", taskName, i,
                    Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(delay);
            } catch (InterruptedException e) {

            }
        }
        return nStep;
    }


}

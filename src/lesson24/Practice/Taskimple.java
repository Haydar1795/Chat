package lesson24.Practice;

public abstract class Taskimple implements Task{
    private int tryCount;


    @Override
    public int getTryCount() {
        return tryCount;
    }

    @Override
    public void incTryCount() {
      tryCount++;
    }


}

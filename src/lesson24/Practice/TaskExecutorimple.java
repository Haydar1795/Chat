package lesson24.Practice;

public class TaskExecutorimple extends Thread implements TaskExecutor {
    private TasksStorage storage;
    private boolean needstop = false;

    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        this.storage = storage;
    }

    @Override
    public TasksStorage getStorage() {
        return storage;
    }

    @Override
    public void run() {
        while (!needstop) {
            Task task = storage.get();
            if (task != null) {

            } else {
                System.out.println("Я поток" + Thread.currentThread().getName() + "завершаю свою работу");
                needstop = true;
            }
        }
    }
}

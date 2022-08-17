package lesson24.Practice;

public class Main {
    public static void main(String[] args) {
        CopyFaleTaskimple task1=new CopyFaleTaskimple("","");
        CopyFaleTaskimple task2=new CopyFaleTaskimple();


        TaskStorageimpse storage=new TaskStorageimpse();
        storage.add(task1);
        storage.add(task2);
        storage.add(task1);
    }
}

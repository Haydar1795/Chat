package lesson24.Practice;

import lesson16.CopyUtils;

public class CopyFaleTaskimple extends Taskimple implements CopyFileTask {
    private String from;
    private String to;
    private CopyUtils copyUtils;

    public CopyFaleTaskimple(){

    }

    public CopyFaleTaskimple(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void setFileCopyUtils(CopyUtils copyUtils) {

    }

    @Override
    public void execute() throws TaskExecutionFailedException {
       try {
           copyUtils.copy(from,to);
       }catch (Exception e){

       }
    }
}

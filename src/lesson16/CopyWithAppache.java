package lesson16;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyWithAppache implements CopyUtils{
    @Override
    public void copy(String from, String to) {
        File fileFrom = new File(from);
        File fileTo = new File(to);

        try {
            FileUtils.copyFile(fileFrom, fileTo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

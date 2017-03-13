package template;

import java.io.File;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA
 * User yugai
 * Time 17/2/24.
 */
public class FileUtil {
    public static String traverseFolder(String path) {
        File file = new File(path);
        if (file.exists()) {
            LinkedList<File> list = new LinkedList<File>();
            File[] files = file.listFiles();
            for (File file2 : files) {
                if (file2.isDirectory()) {
                    System.out.println("文件夹:" + file2.getAbsolutePath());
                    if (file2.getName().endsWith("mvp")){
                        return file2.getAbsolutePath();
                    }
                    list.add(file2);
                }
            }
            File temp_file;
            while (!list.isEmpty()) {
                temp_file = list.removeFirst();
                files = temp_file.listFiles();
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        if (file2.getName().endsWith("mvp")){
                            return file2.getAbsolutePath();
                        }
                        list.add(file2);

                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
        System.out.println("没有发现文件");
        return "";
    }
}

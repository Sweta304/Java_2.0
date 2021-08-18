package collections;

/**Класс для считывания строки из файла
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScan {

    private String path;
    String line;

    public FileScan(String path) {
        this.path = path;
    }
    public String fileScan() {
        File list = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
        } return line;
    }
}
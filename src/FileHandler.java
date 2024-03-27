import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private String sourceFileName = "input.txt";

    public List<String> readFile() {
        List<String> listFruct  = new ArrayList<String>();

        try {
            File sourceFile = new File(sourceFileName);
            FileReader fr = new FileReader(sourceFile);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)
            {
                String[] fruct = line.split(" ");
                for (int i = 0; i < fruct.length; i++) {
                    if (fruct[i].length() > 1) {
                        listFruct.add(fruct[i]);
                    }
                }
                line = reader.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Не удалось считать файл");
        } finally {
            return listFruct;
        }

    }

}

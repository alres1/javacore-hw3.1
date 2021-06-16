package JavaCore.hw3_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> folders = Arrays.asList("C:/testfiles/games/src/", "C:/testfiles/games/res/",
                "C:/testfiles/games/savegames/", "C:/testfiles/games/temp/", "C:/testfiles/games/src/main/",
                "C:/testfiles/games/src/test", "C:/testfiles/games/res/drawables/",
                "C:/testfiles/games/res/vectors/", "C:/testfiles/games/res/icons/");
        List<String> files = Arrays.asList("C:/testfiles/games/src/main/Main.java",
                "C:/testfiles/games/src/main/Utils.java", "C:/testfiles/games/temp/temp.txt");

        StringBuilder sb = new StringBuilder();

        //create folders
        for (String str: folders) {
            File newdir = new File(str);
            if(newdir.mkdir())
                System.out.println("Folder has been created");
                sb.append("Folder \""+ str +"\" has been created\n");
        }

        //create files
        for (String str: files) {
            File newfile = new File(str);
            try {
                if (newfile.createNewFile())
                    System.out.println("File has been created");
                sb.append("File \""+ str +"\" has been created\n");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        FileWriter writer = new FileWriter("C:/testfiles/games/temp/temp.txt");
        writer.append(sb);
        writer.close();
    }
}

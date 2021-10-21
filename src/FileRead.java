import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FileRead {

    public static ArrayList<String> makeWords(){
        ArrayList<String> hangmanWord = new ArrayList<String>();
        try {
            File file = new File("src/ReadMe");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                hangmanWord.add(scanner.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");

        }

        return hangmanWord;
    }
}
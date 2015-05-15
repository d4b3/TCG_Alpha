package mainPack;

/**
 * Created by Dan Blocker on 5/14/2015.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class CardReader {
    public static String searchList(String name, String set) throws FileNotFoundException {
        String targetLine = null;
        Scanner input = new Scanner(new File("Cardlist" + set + ".txt"));
        while(input.hasNextLine()){
            String currentLine = input.nextLine();
            if(currentLine.contains(name)){
                StringTokenizer tokenizer = new StringTokenizer(currentLine);
                while(tokenizer.nextToken().equals(name)){
                    if(tokenizer.nextToken().equals(name)){
                        targetLine = currentLine;
                    }
                }
            }
        }
        return targetLine;
    }
}

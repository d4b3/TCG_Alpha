package mainPack;

/**
 * Created by Dan Blocker on 5/14/2015.
 */
import javafx.collections.transformation.SortedList;

import java.io.*;
import java.util.*;

public class SortFile {
    static SortedSet<String> nameList = new TreeSet<String>();

    public static String getFileName(String set){
        String fileName = "Cardlist"+ set + ".txt";
        return fileName;
    }
    public static void setTokens(String line){
        StringTokenizer token = new StringTokenizer(line);
        String[] tokens = new String[6];
        for(int i = 0; i < tokens.length; i++){
            tokens[i] = token.nextToken();
        }
        setName(tokens[1]);

    }
    public static void setName(String token){
        nameList.add(token);
    }
    public static SortedSet<String> getName(){
        return nameList;
    }
    public static void readFile() throws FileNotFoundException {
        String fileName = getFileName("One");
        Scanner file = new Scanner(new File(fileName));
        while(file.hasNextLine()){
            String currentLine = file.nextLine();
            setTokens(currentLine);
        }
    }
}

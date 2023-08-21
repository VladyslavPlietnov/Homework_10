

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("file.txt");

        NumberReader.printNumber(file);

        File usersFile = new File("users.txt");
        UserList.writeDown(usersFile);
        File words = new File("words.txt");
        WordCounter.wordCounter(words);
        //something else
    }
}


import java.io.*;
import java.util.*;

public class WordCounter {
    public static void wordCounter(File file) throws FileNotFoundException{
        FileInputStream is = new FileInputStream(file);
        Scanner scanner = new Scanner(is);
        Map<String, Integer> wordCount = new HashMap<>();
        String s = scanner.nextLine();
             while(scanner.hasNext()){
                 s= String.join(" ", s, scanner.nextLine());
             }

            String[] strings = s.split(" ");

            for (String string : strings) {
                int count = 0;
                for (String s1 : strings) {
                    if (s1.equals(string)) {
                        count++;
                    }
                }
                wordCount.put(string, count);
            }

        wordCount.entrySet().stream()
                        .sorted((e1,e2)->(e2.getValue()-e1.getValue()))
                                .forEach(System.out::println);
        System.out.println();
        scanner.close();
    }


}

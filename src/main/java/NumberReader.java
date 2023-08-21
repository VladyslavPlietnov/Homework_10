

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberReader {
    public static void printNumber(File file)throws FileNotFoundException {
        FileInputStream is = new FileInputStream(file);
        Scanner scanner = new Scanner(is);
        String s = "";
        while(scanner.hasNext()){
            String s1 = scanner.nextLine();
            if(check(s1)){
                s +="\n"+s1;
            }
        }
        System.out.println(s);
        scanner.close();
    }

    public static boolean check(String s){
        String regex1 = "[\\(]\\d{3}[\\)]\\s\\d{3}\\-\\d{4}";
        String regex2 = "\\d{3}\\-\\d{3}\\-\\d{4}";
        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher1 = pattern1.matcher(s);
        Matcher matcher2 = pattern2.matcher(s);
        return matcher1.matches() || matcher2.matches();
    }
}

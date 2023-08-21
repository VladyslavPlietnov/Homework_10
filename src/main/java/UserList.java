
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.*;
public class UserList {
    public static ArrayList<User> createUserList(File file) throws FileNotFoundException {
        FileInputStream is = new FileInputStream(file);
        Scanner scanner = new Scanner(is);
        String header = scanner.nextLine();
        System.out.println(header);

        ArrayList<User> users = new ArrayList<>();
         while(scanner.hasNext()){
             String[] data = scanner.nextLine().split(" ");
            users.add(new User(data[0],Integer.parseInt(data[1])));
             //System.out.println(scanner.nextLine() + " "+scanner.nextInt());
             System.out.println(data[1]);
         }
         scanner.close();
         return users;
    }

    public static void writeDown(File file) throws IOException {
        ArrayList<User> users = createUserList(file);
        FileWriter fileWriter = new FileWriter("users.json");
        fileWriter.write(new Gson().toJson(users));
        fileWriter.flush();
        fileWriter.close();
    }

}

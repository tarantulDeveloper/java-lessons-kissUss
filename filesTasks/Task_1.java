import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Task_1 {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("files/data_csv.csv");
            FileWriter fileToWrite = new FileWriter(file);
            CSVWriter writer = new CSVWriter(fileToWrite);
            List<String[]> data = new ArrayList<>();
            data.add(new String[] {"Aygul", "2000", "+996600900800"});
            data.add(new String[] {"Joomart", "2003", "+996890900450"});
            data.add(new String[] {"Bekzhan", "2020", "+996809607888"});
            data.add(new String[] {"Amir", "2003", "+996500345678"});
            writer.writeAll(data);
            writer.close();
            System.out.println(findPhoneNumberByUsername("Amir"));
            System.out.println(countUsersFromGivenYear(2005));

        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    static String findPhoneNumberByUsername(String userName) throws IOException {
        String path = "files/data_csv.csv";
        String line = "";
        String tempUserName = "\"" + userName + "\"";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        while((line = bufferedReader.readLine()) != null) {
            String[] user = line.split(",");
            if (user[0].equals(tempUserName)) {
                return user[2];
            }
        }
        return "User not found";

    }

    static int countUsersFromGivenYear(int year) throws IOException{
        String path = "files/data_csv.csv";
        int count = 0;
        String name = ""; int connectedDate; String phoneNumber = "";

        Scanner scanner = new Scanner(new File(path));
        scanner.useDelimiter("[,\n]");
        while(scanner.hasNext()) {
            name = scanner.next();
            connectedDate = Integer.parseInt(scanner.next().replaceAll("\"",""));
            phoneNumber = scanner.next();


            if (connectedDate >= year) {
                count++;
            }
        }
        return count;
    }

}

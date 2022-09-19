import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task_5 {
    public static void main(String[] args) throws IOException, CsvException {
        String path = "files/students.csv";
        String line = "";
        int currentRow = 0;

        BufferedReader reader = new BufferedReader(new FileReader(path));
        while ((line = reader.readLine()) != null) {
            String[] student = line.split(",");
            if(student[0].equals("Name")) {
                continue;
            } else {
                ArrayList<Double> marks = new ArrayList<Double> ();
                for (int i = 1; i <= 3; i++) {
                    if (currentRow == 0) {
                        continue;
                    }
                    marks.add(Double.parseDouble(student[i].replaceAll("\"","")));
                }
                double average = marks.stream().mapToDouble(a -> a).average().orElse(0);
                if (average > 4) {
                    CSVReader csvReader = new CSVReader(new FileReader(path));
                    List<String[]> csvBody = csvReader.readAll();
                    csvBody.get(currentRow)[0] = student[0].toUpperCase();
                    csvReader.close();
                    CSVWriter writer = new CSVWriter(new FileWriter(path));
                    writer.writeAll(csvBody);
                    writer.flush();
                    writer.close();
                }
                System.out.println("The average mark of " + student[0] + " is " + average);
            }

            currentRow++;
        }

    }
}


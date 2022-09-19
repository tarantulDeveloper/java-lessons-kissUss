import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Task_2 {
    public static void main(String[] args) {
        String path = "files/dots.txt";
        try {
            /*// filling txt file with data
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            String line1 = "12 14\n";
            String line2 = "10 1\n";
            String line3 = "0 8\n";
            writer.write(line1);
            writer.write(line2);
            writer.write(line3);
            writer.close();*/

            //reading file


            BufferedReader reader = new BufferedReader(new FileReader(path));
            ArrayList<Double> numsArray = new ArrayList<>();
            while (reader.ready()) {
                String line = reader.readLine();
                StringTokenizer tokens = new StringTokenizer(line, " ");
                while (tokens.hasMoreTokens()) {
                    numsArray.add(Double.valueOf(tokens.nextToken()));
                }
            }

            reader.close();

            ArrayList<double[]> pairNums = new ArrayList<>();
            for (int i = 0; i < numsArray.size(); i += 2) {
                double[] temp = {numsArray.get(i), numsArray.get(i + 1)};
                pairNums.add(temp);
            }

            ArrayList<Double> distances = new ArrayList<>();

            for (int i = 0; i < pairNums.size(); i++) {
                for (int j = i + 1; j < pairNums.size(); j++) {
                    distances.add(calculateDistanceBetweenTwoDots(pairNums.get(i), pairNums.get(j)));
                }
            }

            double maxDistance = Collections.max(distances);
            double minDistance = Collections.min(distances);
            System.out.println(distances);
            System.out.println(distances.size());
            System.out.println("The max distance between these dots is: " + maxDistance);
            System.out.println("The min distance between these dots is: " + minDistance);


        } catch (IOException e) {
            System.out.println(e);
        }
    }


    static double calculateDistanceBetweenTwoDots(double[] first, double[] second) {
        return Math.sqrt(Math.pow((second[1] - first[1]), 2) + Math.pow(second[0] - first[0], 2));
    }
}

import java.io.*;

public class Task_8 {
    public static void main(String[] args) throws IOException {
        String path = "files/g.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        while (bufferedReader.ready()) {
            System.out.printf("%70s\n",bufferedReader.readLine());
        }
        bufferedReader.close();
    }
}

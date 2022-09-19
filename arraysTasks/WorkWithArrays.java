import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WorkWithArrays {
    public static void main(String[] args) {

        //#1
        int[] array = new int[10];
        for (int i = 1; i <= array.length; i++) {
            array[i-1] = i;
        }
        Arrays.fill(array, 1, 9, 0);
        System.out.println(Arrays.toString(array));

        //#2
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                arrayList.add(0);
            } else {
                arrayList.add(1);
            }
        }

        System.out.println(arrayList);

        //#3
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < 14; i+=2) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        //#4
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        System.out.println("Enter difference \"d\"");
        int d = scanner.nextInt();

        for (int i = 1; i < 15; i++) {
            int element = start + d*(i - 1);
            arrayList.add(element);
        }

        System.out.println(arrayList);

        //#5
        Random random = new Random();
        int[] arrayList = new int[15];

        for (int i = 0; i < arrayList.length; i++) {
            int currentNum;
            if ( i == 0) {
                currentNum = arrayList[0];
            } else {
                currentNum = arrayList[i - 1];
            }
            int randNum = random.nextInt();
            while(!(randNum % 2 == 0 && currentNum < randNum)) {
                randNum = random.nextInt();
            };
            arrayList[i] = randNum;
        }
        for (int item : arrayList) {
            System.out.println(String.format("%,d",item));
        }

        //#6
        int[] arrayList = new int[15];
        Random random = new Random();

        for (int i = 0; i < arrayList.length; i++) {
            int currentNum;
            if ( i == 0) {
                currentNum = arrayList[0];
            } else {
                currentNum = arrayList[i - 1];
            }
            int randNum = random.nextInt();
            while(!(randNum % 3 == 0 && currentNum > randNum)) {
                randNum = random.nextInt();
            }
            arrayList[i] = randNum;

        }
        for (int item : arrayList) {
            System.out.printf("%,d%n",item);
        }

        //#7
        Scanner scanner = new Scanner(System.in);
        System.out.println("N: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int n1 = 0, n2 = 1, n3;

        for (int i = 0; i < n; i++) {
            if ( i == 0 ) {
                array[i] = 0;
            } else if (i == 1) {
                array[i] = 1;
            } else {
                n3 = n1 + n2;
                array[i] = n3;
                n1 = n2;
                n2 = n3;
            }
        }

        System.out.println(Arrays.toString(array));

        //#8
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            array.add(random.nextInt());
        }
        int evensNum = 0;
        for (int num: array) {
            if (num % 2 == 0) {
                evensNum++;
            }
        }
        System.out.println("Initial array " + array);
        System.out.println("Numbers of evens " + evensNum);

        //#9
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            array.add(random.nextInt());
        }
        int desiredNum = 0;
        for (int num: array) {
            if (num % 3 == 0 && num % 7 != 0) {
                desiredNum++;
            }
        }
        System.out.println("Initial array " + array);
        System.out.println("Numbers of desired numbers " + desiredNum);

        //10
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            array.add(random.nextInt());
        }
        int dividedByFirst, dividedByLast;
        dividedByLast = dividedByFirst = 0;
        for (int num: array) {
            if (num % array.get(0) == 0 ) {
                dividedByFirst++;
            } else if (num % array.get(array.size() - 1) == 0) {
                dividedByLast++;
            }
        }
        System.out.println("Initial array " + array);
        System.out.println("Numbers of divided by first " + dividedByFirst);
        System.out.println("Numbers of divided by last " + dividedByLast);

        //#11
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            array.add(i+1);
        }
        int sum = 0;
        int product = 1;

        for (int num: array) {
            sum += num;
            product *= num;
        }

        System.out.println("Initial array " + array);
        System.out.println("Sum " + sum);
        System.out.println("product " + product);

        //#12
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            array.add(i+1);
        }
        int evenSum = 0;

        for (int num: array) {
            if (num % 2 == 0) {
                evenSum += num;
            }
        }

        System.out.println("Initial array " + array);
        System.out.println("Sum " + evenSum);

        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            array.add(i+1);
        }
        int oddSum = 0;

        for (int num: array) {
            if (num % 2 != 0 && num < 11) {
                oddSum += num;
            }
        }

        System.out.println("Initial array " + array);
        System.out.println("Sum " + oddSumqqqqqqqa);

    }
}

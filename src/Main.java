import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача 1");
            int[] inputArray1 = {12000, 8500, 9400, 11000, 7600};
            double[] outputArray1 = new double[4];
            int sum = 0;
            int max = inputArray1[0];
            int min = inputArray1[0];
            for (int value : inputArray1) {
                sum += value;
                if (value < min) min = value;
            }
            double avg = (double) sum / inputArray1.length;
            outputArray1[0] = sum;
            outputArray1[1] = max;
            outputArray1[2] = min;
            outputArray1[3] = avg;
            System.out.println("inputArray1: " + Arrays.toString(inputArray1));
            System.out.println("outputArray1 (сумма, макс, мин, среднее): " + Arrays.toString(outputArray1));
        }
        {
            System.out.println("Задача 2");
        }
        int[] inputArray2 = {50000, 62000, 48000, 71000, 53500};
        double[] outputArray2 = new double[inputArray2.length];
        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * 0.13;
        }
        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2 (налог 13%): " + Arrays.toString(outputArray2));
        {
            System.out.println("Задача 3");
        }
        int[] inputArray3 = {3000, 6800, 4900, 8200, 4500};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        for (int i = 0; i < inputArray3.length; i++) {
            outputArray3[i] = inputArray3[i] > 5000;
        }
        System.out.println("inputArray3: " + Arrays.toString(inputArray3));
        System.out.println("outputArray3 (бонус больше 5000): " + Arrays.toString(outputArray3));
        {
            System.out.println("Задача 4");
        }
        int[] inputArray4 = {1000, 2500, 0, 3200, 1800};
        boolean[] outputArray4 = new boolean[1];
        boolean hasNegative = false;
        for (int value : inputArray4) {
            if (value < 0) {
                hasNegative = true;
                break;
            }
        }
        outputArray4[0] = !hasNegative;
        System.out.println("inputArray4: " + Arrays.toString(inputArray4));
        System.out.println("outputArray4 (просрочек нет): " + Arrays.toString(outputArray4));
        {
            System.out.println("Задача 5");
        }
        int[] inputArray5 = {1500, -300, 0, 4200, -100};
        int[] outputArray5 = new int[1];
        int profitableMonths = 0;
        for (int value : inputArray5) {
            if (value > 0) profitableMonths++;
        }
        outputArray5[0] = profitableMonths;
        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("outputArray5 (рентабельных месяцев): " + Arrays.toString(outputArray5));
    }
}
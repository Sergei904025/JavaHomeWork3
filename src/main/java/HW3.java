public class HW3 {

    public static void main(String[] args) {

        System.out.println("Задача №1");

        int[] numbers = {2, 5, 13, 7, 6, 4};
        int size = 6;
        double avg = 0;
        int sum = 0;
        int index = 0;
        while (index < size) {
            sum = sum + numbers[index];
            index++;
        }
        avg = (double) (1.0 * sum / size);

        System.out.println("среднее арифметическое массива numbers равно " + avg);
    }
}



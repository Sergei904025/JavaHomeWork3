public class HW3 {

    public static void main(String[] args) {
        int[] arr = {10, 3, 1, 100, 7, 4, 11};

// Предположим, что нулевой элемент максимальный
        int max = arr[0];

// В цикле начинаем с первой ячейки
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max); // => 11
    }
}
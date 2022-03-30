package Les2.HomeWork;

import static Les2.HomeWork.Method.method;

public class Main {
    public static void main(String[] args) {

        String[][] arr = new String[][]{{"4", "6", "8", "9"}, {"1", "3", "5", "7"}, {"2", "3", "9", "7"}, {"1", "4", "5", "1"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }
}

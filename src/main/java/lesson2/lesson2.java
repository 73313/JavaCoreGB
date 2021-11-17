package lesson2;

public class lesson2 {
    public static void main(String[] args) {

        String[][] arrCorrect = {{"1", "2", "5", "6"}, {"3", "5", "5", "7"},
                {"5", "2", "5", "6"}, {"5", "5", "7", "9"},};

        String[][] arrCorrectWrongSize = {{"1", "2", "5", "6"}, {"3", "4", "5", "7"},
                {"5", "2", "5", "6"}, {"5", "5", "7", "9"},{"5", "5", "7", "9"}};
        String[][] arrInvalidTransform = {{"1", "5", "5", "6"}, {"3", "4", "5", "7"},
                {"5", "2", "5", "6"}, {"5", "j", "7", "9"}};
        try{
            try {
                System.out.println(" /Корректный массив [4 x 4]/  ");
                int summa =MethodWithExceptions(arrCorrect);
                System.out.println("Сумма всех элементов массива ="+ " "+ summa);

            } catch (MyArraySizeException e) {
                System.out.println("Размер массива не соответствует условию!");
            }
            System.out.println();

            try {
                System.out.println(" /Массив с изменнённым размером/");
                int summa1 =MethodWithExceptions(arrCorrectWrongSize);
                System.out.println("Сумма всех элементов массива ="+ " "+ summa1);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива не соответствует условию!");
            }
            System.out.println();

            try {
                System.out.println(" /Не правильное преобразование массива/");
                int summa2 =MethodWithExceptions(arrInvalidTransform);
                System.out.println("Сумма всех элементов массива ="+ " "+ summa2);

            } catch (MyArraySizeException e) {

                System.out.println("Размер массива не соответствует условию!");
            }

        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение  в массиве!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }
    public static int MethodWithExceptions(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException( );
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
    static class MyArrayDataException extends Exception {
        public int i;
        public int j;

        MyArrayDataException(int i, int j) {

            this.i = i;
            this.j = j;

        }

    }
    static class MyArraySizeException extends Exception {
        MyArraySizeException(){
            super("Размерность массива должна быть [4 x 4]");
        }
    }
}

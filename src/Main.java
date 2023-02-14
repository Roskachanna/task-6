import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        for (int i = 1; i <= 7; ++i) {
            numbers[i-1] = i;
        }
        System.out.println("Массив " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 ==0) {
                numbers[i] +=1;
            }
        }
        System.out.println("Массив +1 " + Arrays.toString(numbers));
        int total = printPiece(numbers);

    }
    public static int printPiece(int[] arr) {
        int printPiece = 0;
        for (int i = 0; i < arr[2]; i++) {
            printPiece = printPiece + arr[i];
            System.out.println(printPiece);
        }
        return printPiece;

    }
}
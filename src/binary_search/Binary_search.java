package binary_search;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Fuad
 */
public class Binary_search {

    static Scanner getInput = new Scanner(System.in);

    public static void main(String[] args) {

        int numbers[] = {1, 3, 5, 7, 8, 24, 9, 10, 79};
        int start = 0, mid, end = numbers.length - 1;

        Arrays.sort(numbers);
        System.out.println("Numbers after sorted: " + Arrays.toString(numbers));
        System.out.println("enter a value:");
        int value = getInput.nextInt();

        mid = (start + end) / 2;
        while (start <= end) {
            if (numbers[mid] < value) {
                start = mid + 1;
            } else if (numbers[mid] == value) {
                System.out.println(value + " is found at index: " + mid);
                break;
            } else {
                end = mid - 1;
            }

            mid = (start + end) / 2;
        }

        if (start > end) {
            System.out.println("Element not found!");
        }

    }

}

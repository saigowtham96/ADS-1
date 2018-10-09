import java.util.Scanner;
/**
 * List of minimum priorities.
 *
 * @param      <E>
 */
class PriorityQueue<E extends Comparable<E>> {
    /**
     * Generic array.
     */
    private E[] arr;
    /**
     * Constructs the object.
     *
     * @param      array   The arr.
     */
    PriorityQueue(final E[] array) {
        this.arr = array;
    }
    /**
     * Determines if minimum heap.
     *
     * @return     True if minimum heap, False otherwise.
     */
    public boolean isminHeap() {
        for (int i = 0; i < arr.length - 1; i++) {
            if (less(i + 1, i)) {
                return false;
            }
        }
        return true;
    }
    /**
     * less function.
     *
     * @param      first  The first
     * @param      second   The second
     *
     * @return     true if first one is less than the other, else false.
     */
    public boolean less(final int first,
     final int second) {
        return arr[first].compareTo(arr[second]) < 0;
    }
}
/**
 * client class.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused constructor.
    }
    /**
     * main method.
     *
     * @param      args  The arguments.
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String datatype = scan.nextLine();
        int numoftestcases = Integer.parseInt(scan.nextLine());
        switch (datatype) {
        case "String":
            int count = 0;
            while (count < numoftestcases) {
                String[] input = scan.nextLine().split(",");
                PriorityQueue<String> obj =
                 new PriorityQueue<String>(input);
                System.out.println(obj.isminHeap());
                count++;
            }
            break;
        case "Integer":
            count = 0;
            while (count < numoftestcases) {
                String[] input = scan.nextLine().split(",");
                Integer[] intArray = new Integer[input.length];
                for (int i = 0; i < input.length; i++) {
                    intArray[i] = Integer.parseInt(input[i]);
                }
                PriorityQueue<Integer> obj =
                 new PriorityQueue<Integer>(intArray);
                System.out.println(obj.isminHeap());
                count++;
            }
            break;
        case "Double":
            count = 0;
            while (count < numoftestcases) {
                String[] input = scan.nextLine().split(",");
                Double[] doubleArray = new Double[input.length];
                for (int i = 0; i < input.length; i++) {
                    doubleArray[i] = Double.parseDouble(input[i]);
                }
                PriorityQueue<Double> obj =
                 new PriorityQueue<Double>(doubleArray);
                System.out.println(obj.isminHeap());
                count++;
            }
            break;
        case "Float":
            count = 0;
            while (count < numoftestcases) {
                String input = scan.nextLine();
                if (input.equals("")) {
                    System.out.println(false);
                    break;
                } else {
                    String[] floatToken = input.split(",");
                    Float[] floatArray =
                     new Float[floatToken.length];
                    for (int i = 0; i < floatToken.length; i++) {
                        floatArray[i] =
                         Float.parseFloat(floatToken[i]);
                    }
                    PriorityQueue<Float> obj =
                     new PriorityQueue<Float>(floatArray);
                    System.out.println(obj.isminHeap());
                }
                count++;
            }
            break;
        default:
            break;
        }
    }
}

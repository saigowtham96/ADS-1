import java.util.Scanner;
/**.
 * Solution class.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * main method 
     * Time complexity of this method is
     * O(MlogN*+PlogN*)
     * M is the number of times put method called
     * logN* is  put method time complexity for N values
     * P is te number of times get method called
     * logN* is  get method time complexity for N values
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        LinearProbingHashST<Integer, String> object =
            new LinearProbingHashST<Integer, String>();
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        for (int k = 0; k < input; k++) {
            String[] tokens = scan.nextLine().split(",");
            String str = tokens[1] + "," + tokens[2];
            object.put(Integer.parseInt(tokens[0]), str);
        }
        int value = Integer.parseInt(scan.nextLine());
        for (int j = 0; j < value; j++) {
            String[] tokens1 = scan.nextLine().split(" ");
            String str = object.get(Integer.parseInt(tokens1[1]));
            if (str != null) {
                String[] tokens2 = str.split(",");
                if (Integer.parseInt(tokens1[2]) == 1) {
                    System.out.println(tokens2[0]);
                } else {
                    System.out.println(
                        Double.parseDouble(tokens2[1]));
                }
            } else {
                System.out.println("Student does not exists");
            }
        }
    }

}

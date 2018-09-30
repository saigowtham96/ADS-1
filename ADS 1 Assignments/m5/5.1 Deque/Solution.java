import java.util.Scanner;
/**.
 * {final class}
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
    }
    /**.
     * { main }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Deque<Integer> d = new Deque<Integer>();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(" ");
            switch (tokens[0]) {
            case "pushLeft":
                d.pushLeft(Integer.parseInt(tokens[1]));
                break;
            case "pushRight":
                d.pushRight(Integer.parseInt(tokens[1]));
                break;
            case "size":
                System.out.println(d.size());
                break;
            case "isEmpty":
                System.out.println(d.isEmpty());
                break;
            case "popLeft":
                d.popLeft();
                break;
            case "popRight":
                d.popRight();
                break;
            default:
                break;
            }
        }
    }
}
/**.
 * Class for deque.
 *
 * @param      <E>   { parameter_description }
 */
class Deque<E> {
    /**.
     * Size variable
     */
    private int size;
    /**.
     * Object for linked list
     */
    private LinkedList<E> linkedQueue;
    /**.
     * Constructs the object.
     */
    Deque() {
        linkedQueue = new LinkedList<E>();
        size = 0;
    }
    /**.
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }
    /**.
     * { return size }
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        return size;
    }
    /**
     * Pushes a left.
     *
     * @param      item  The item
     */
    public void pushLeft(final E item) {
        linkedQueue.addAtStart(item);
        size++;
        linkedQueue.print();
    }
    /**
     * Pushes a right.
     *
     * @param      item  The item
     */
    public void pushRight(final E item) {
        linkedQueue.addAtEnd(item);
        size++;
        linkedQueue.print();
    }
    /**.
     * {removes left element}
     */
    public void popLeft() {
        if (size == 0) {
            System.out.println("Deck is empty");
            return;
        }
        size--;
        linkedQueue.removeAtStart();
        if (linkedQueue.getSize() == 0) {
            System.out.println("[]");
            return;
        }
        linkedQueue.print();
    }
    /**.
     * { removes right element}
     */
    public void popRight() {
        if (size == 0) {
            System.out.println("Deck is empty");
            return;
        }
        size--;
        linkedQueue.removeAtEnd();
        if (linkedQueue.getSize() == 0) {
            System.out.println("[]");
            return;
        }
        linkedQueue.print();
    }



}

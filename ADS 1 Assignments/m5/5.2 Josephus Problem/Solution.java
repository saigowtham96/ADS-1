import java.util.Scanner;
/**
 * { class for solution }
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    public static void main(final String[] args) {
        /**.
         * scanner object to read the data
         */
        Scanner scan = new Scanner(System.in);
        /**.
         * Queue object to store the given data
         */
        Queue queueObj = new Queue();
        /**.
         * Variable to define the no of inputs
         */
        int noOfInputs = Integer.parseInt(scan.nextLine());
        for (int index1 = 0; index1 < noOfInputs; index1++) {
            String[] tokens = scan.nextLine().split(" ");
            int number = Integer.parseInt(tokens[0]);
            int position = Integer.parseInt(tokens[1]);
            /**.
             * adding given elements into the Queue.
             */
            for (int index = 0; index < number; index++) {
                queueObj.enQueue(index);
            }
            /**.
             * Checking of mth position person and poping the same
             */
            while (!queueObj.isEmpty() && number != 1) {
                for (int i = 1; i < position; i++) {
                    queueObj.enQueue(queueObj.deQueue());
                }
                System.out.print(queueObj.deQueue() + " ");
                number--;
            }
            System.out.print(queueObj.deQueue());
            System.out.println();
    
        }
    }
}
/**.
 * Queue class for queue implementaion
 */
class Queue {
    /**
     * { variable for size }
     */
    private int size;
    /**
     * { node object}
     */
    private Node queue;
    /**
     * { node for head }
     */
    private Node head;
    /**
     * Class for node.
     */
    class Node {
       
        private int data;
        private Node link;
        Node() {
            this.data = 0;
            this.link = null;
        }
        
        Node(final int data1) {
            this.data = data1;
            this.link = null;
        }
    }
    /**
     * Constructs the object.
     */
    Queue() {
        queue = new Node();
        size = 0;
    }
    /**
     * {adds element at the head}
     *
     * @param      data  The data
     */
    public void enQueue(final int data) {
        if (size == 0) {
            head = new Node(data);
            size++;
            return;
        }
        Node start = new Node(data);
        start.link = head;
        head = start;
        size++;
        return;
    }
    /**
     * {removes element at end}
     *
     * @return     { description_of_the_return_value }
     */
    public int deQueue() {
        Node current = head;
        if (size == 1) {
            size--;
            int n = head.data;
            head = null;
            return current.data;
        }

        int counter = 1;
        while (counter < size - 1) {
            counter++;
            current = current.link;
        }
        int data = current.link.data;
        current.link = null;
        size--;
        return data;
    }
    /**
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }
    /**
     * Gets the size.
     *
     * @return     The size.
     */
    public int getSize() {
        return size;
    }
}

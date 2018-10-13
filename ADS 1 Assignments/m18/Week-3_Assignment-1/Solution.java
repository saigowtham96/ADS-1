import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
class BinarySearchST<Keys extends Comparable<Keys>, Values> {
	private Keys[] stockname;
	private Values[] frequency;
	private int size;


	BinarySearchST() {
        final int ten = 10;
        stockname = (Keys[]) new Comparable[ten];
        frequency = (Values[]) new Comparable[ten];
        size = 0;
    }
    private void resize() {
        stockname = Arrays.copyOf(stockname, size + 1);
        frequency = Arrays.copyOf(frequency, size + 1);
    }
    public void put(final Keys stockname, final Values frquency) {
        if (size == keys.length) {
            resize();
        }
        if (size == 0) {
            keys[0] = stockname;
            values[0] = frequency;
            size++;
            return;
        }
        int rank = rank(key);
        if (rank < size && keys[rank].compareTo(stockname) == 0) {
            values[rank] = frquency;
            return;
        }
        for (int i = size; i > rank; i--) {
            keys[i] = keys[i - 1];
            values[i] = values[i - 1];
        }
        keys[rank] = stockname;
        values[rank] = frequency;
        size++;
    }
    
}

class Stock implements Comparable<Stock> {
	private int hours;
	private String name;
	private int change;

	Stock(String name, int change) {
		this.name = name;
		this.change = change;
	}

	public String getname() {
		return this.name;
	}

	public int change() {
		return this.change;
	}

	public String toString() {
	    return hours+" = " + name  + " + " + change;
	}


}



public class Solution {
	static final int INPUT = 100;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        BinarySearchST<String, Integer> obj = new BinarySearchST<>();
		String[] tokens = scan.nextLine().split(",");
		int count = 0;
		int stockdata = Integer.parseInt(tokens[0]);
		int queries = Integer.parseInt(tokens[1]);
		int temp = -1;
		MinPQ<Stock> pq = new MinPQ<Stock>();
        for (int i = 0; i <= INPUT; i++) {
            pq.insert(new Stock(i, i));
        }

        while (!pq.isEmpty()) {
            stock s = pq.delMin();
            if (temp == s.getname()) {
                count++;
            } else {
                count = 0;
            }
            if (count == times - 1) {
                stockdata--;
                if (stockdata == 0) {
                    System.out.println(s.getname());
                    break;
                }
            }

            temp = s.getname();
            if (s.getchange() < INPUT) {
                pq.insert(new stock(
                              s.getname(), s.getchange() + 1));
            }
        }

        MaxPQ<Stock> pq = new MaxPQ<Stock>();
        for (int i = 0; i <= INPUT; i++) {
            pq.insert(new Stock(i, i));
        }

        while (!pq.isEmpty()) {
            stock s = pq.delMax();
            if (temp == s.getname()) {
                count++;
            } else {
                count = 0;
            }
            if (count == times - 1) {
                stockdata--;
                if (stockdata == 0) {
                    System.out.println(s.getname());
                    break;
                }
            }

            temp = s.getname();
            if (s.getchange() < INPUT) {
                pq.insert(new stock(
                              s.getname(), s.getchange() + 1));
            }
        }

        


    }

}


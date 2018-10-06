import java.util.Scanner;
import java.util.Arrays;
class Details {
	String sname;
	String dob;
	int sub1;
	int sub2;
	int sub3;
	int tot;
	String cat;
	Details(){

	}
	Details(String sName1, String dob1, int subOne, int subTwo,
	        int subThree, int total, String category) {
		this.sname = sName1;
		this.dob = dob1;
		this.sub1 = subOne;
		this.sub2 = subTwo;
		this.sub3 = subThree;
		this.tot = total;
		this.cat = category;
	}
	public int compareTo(Details obj) {
		if (this.tot < obj.tot) {
			return 1;
		}
		if (this.tot > obj.tot) {
			return -1;
		} else {
			if (this.sub3 < obj.sub3) {
				return -1;
			}
			if (this.sub3 > obj.sub3) {
				return 1;
			} else {
				if (this.sub2 < obj.sub2) {
					return 1;
				}
				if (this.sub2 > obj.sub2) {
					return -1;
				} else {
					if (this.sub1 < obj.sub1) {
						return 1;
					}
					if (this.sub1 > obj.sub1) {
						return -1;
					}
				}
			}
			return 0;
		}

	}
	public String toString() {
		String str;
		str = this.sname+","+this.tot+","+this.cat;
		return str;
	}
	public String getCategory(){
		return this.cat;
	}
}
class Results {
	Details[] details;
	int size;
	int vac;
	int un;
	int bc;
	int sc;
	int st;
	Details obj1 = new Details();
	Results() {
		details = new Details[20];
		size = 0;
	}
	public void addVac(int vace, int unr, int bc1, int sc1, int st1) {
		this.vac = vace;
		this.un = unr;
		this.bc = bc1;
		this.sc = sc1;
		this.st = st1;
	}
	public void add(Details obj) {
		if (details.length == size) {
			resize();
		}
		details[size++] = obj;
	}
	public void sort(){
		Insertion insobj = new Insertion();
		insobj.sort(details);
	}
	public void resize() {
		details = Arrays.copyOf(details, details.length + 1);
	}
	public void print(){
		for(int i = 0;i<size;i++){
			System.out.println(details[i].toString());
		}
	}
	public void allotment(){
		int i;
		int countbc =0;
		int countsc = 0;
		int countst = 0;
		for(i = 0;i<un;i++){
			System.out.println(details[i].toString());
		}
		int l = i;
		while(countst<st&&l<size){
			if(details[l].getCategory().equals("ST")){
				System.out.println(details[l].toString());
				countst++;
			}
			l++;
		}
		int k = i;
		while(countsc<sc&&k<size){
			if(details[k].getCategory().equals("SC")){
				System.out.println(details[k].toString());
				countsc++;
			}
			k++;
		}
		int j = i;
		while(countbc<bc&&j<size){
			if(details[i].getCategory().equals("BC")){
				System.out.println(details[j].toString());
				countbc++;
			}
			j++;
		}
		
		
	}
}
/**
 * Class for selectionsort.
 */
class InsertionSort {
	/**
	 * {Insertion sort}
	 *
	 * @param      a     { parameter_description }
	 */
	public static void sort(final Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0; j--) {
				if (less(a[j], a[j - 1])) {
					exch(a, j, j - 1);
				} else break;
			}
		}
	}
	/**
	 * { function_description }
	 *
	 * @param      i     { parameter_description }
	 * @param      j     { parameter_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	private static boolean less(final Comparable i, final Comparable j) {
		return i.compareTo(j) < 0;
	}
	/**
	 * { function_description }
	 *
	 * @param      a     { parameter_description }
	 * @param      i     { parameter_description }
	 * @param      j     { parameter_description }
	 */
	private static void exch(final Comparable[] a,
	                         final int i, final int j) {
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
}

class Solution {
	public static void main(String[] args) {
		Results resultObj = new Results();
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		int vac = Integer.parseInt(scan.nextLine());
		int un = Integer.parseInt(scan.nextLine());
		int bc = Integer.parseInt(scan.nextLine());
		int sc = Integer.parseInt(scan.nextLine());
		int st = Integer.parseInt(scan.nextLine());
		resultObj.addVac(vac, un, bc, sc, st);
		for (int i = 0; i < N; i++) {
			String[] tokens = scan.nextLine().split(",");
			resultObj.add(new Details(tokens[0], tokens[1], Integer.parseInt(tokens[2]),
			                          Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]),
			                          tokens[6]));
		}
		resultObj.sort();
		resultObj.print();
		System.out.println();
		resultObj.allotment();
	}
}
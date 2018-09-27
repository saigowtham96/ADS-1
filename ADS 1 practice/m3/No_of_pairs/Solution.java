import java.util.*;
public class Solution {
	public static void main(String[] args) {
		int[] a = {1,1,2,2,3,6,7,8,9};
		int count = 0;
		int check = 1;
		for(int i=0;i<a.length-1;i++) {
			// System.out.println(a[i]);
			if(a[i] == a[i+1]) {
				check+=1;
			} else {
				count += check*(check-1)/2;
				check = 1;
			}
			
		}
		count += check*(check-1)/2;
		System.out.println(count);
	}
}
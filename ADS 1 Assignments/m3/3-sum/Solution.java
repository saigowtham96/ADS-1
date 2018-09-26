import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int[] threesum = new int[m];
		for(int i = 0;i < m;i++) {
			threesum[i] = s.nextInt();
		}
		Arrays.sort(threesum);
		int count = 0;
		int j;
		for(int i =0;i<m-2;i++) {
			j = i+1;
			int k = m-1;
			while(j<k) {
				if(threesum[i]+threesum[j]+threesum[k] == 0) {
					count++;
					j++;
					k--;
				} else if (threesum[i]+threesum[j]+threesum[k] < 0) {
					j++;
				} else {
					k--;
				}
			}
		}
		System.out.println(count);
	}
}
import java.util.*;

public class A211206 {
	public static void main (String args[]) {
		solve();
	}
	
	public static void solve() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++){
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			
			sum += (x1-x2+1)*(y1-y2+1);
			
		}

		System.out.println(sum);
	}
}
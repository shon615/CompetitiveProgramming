import java.io.*;
import java.util.*;

public class D211352 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
    	int n = in.nextInt();
    	int k = in.nextInt();
    	int lo = 1, hi = n, ans = -1;
    	while (lo <= hi) {
    		int mid = (lo + hi)/2;
    		if (burnOil(n, k, mid)) {ans = mid; hi = mid - 1;}
    		else lo = mid + 1;
    	}
    	System.out.println(ans);
    }
    
    public static boolean burnOil(int n, int k, int v) {
    	int count = 0;
    	for (int i = 0; ; i++) {
    		int p = (int) Math.floor(v/Math.pow(k,  i));
    		if (p != 0) {
    			count += Math.floor(v/Math.pow(k, i));
    		}
    		else
    			break;
    	}
    	if (count >= n) return true;
    	return false;
    }

	public static void main(String[] args)
    {
        in = new FastReader(System.in);
        out = new PrintWriter(System.out);
        solve();
        out.flush();
        out.close();

    }

	static class FastReader {

        BufferedReader read;
        StringTokenizer tokenizer;

        public FastReader(InputStream in)
        {
            read = new BufferedReader(new InputStreamReader(in));
        }

        public String next()
        {
            while(tokenizer == null || !tokenizer.hasMoreTokens())
            {
                try{
                    tokenizer = new StringTokenizer(read.readLine());
                }catch(Exception e){
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public String nextLine(){

            try
            {
                return read.readLine();
            }
            catch(Exception e)
            {
                throw new RuntimeException(e);
            }
        }
        public int nextInt()
        {
            return Integer.parseInt(next());
        }
        public long nextLong()
        {
            return Long.parseLong(next());
        }
        public double nextDouble()
        {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n)
        {
            int[] a = new int[n];
            for(int i=0; i<n; ++i)
            {
                a[i] = nextInt();
            }
            return a;
        }

        public long[] nextLongArr(int n)
        {
            long[] a = new long[n];
            for(int i=0; i<n; ++i)
            {
                a[i] = nextLong();
            }
            return a;
        }
    }


}


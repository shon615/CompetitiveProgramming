import java.io.*;
import java.util.*;

public class H211563 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
    	int n = in.nextInt();
    	int[] a = in.nextIntArr(n);
    	if (n == 2){
    		out.println(0);
    		return;
    	}
    	int[] sums = new int[n];
    	sums[0] = a[0];
    	for (int i = 1; i < n; i++) {
    		sums[i] = a[i] + sums[i-1];
    	}
    	int sumWhole = sums[n-1];
    	if (sumWhole % 3 != 0) {
    		out.println(0);
    		return;
    	}
    	int c1 = 0;
    	
    	
    	int total = 0;
    	for (int i = 0; i < n; i++) {
    		if (sumWhole == 0) {
    			if (sums[i] == sumWhole*2/3 && a[i] == 0) {
        			total+=c1-2;
        		}
        		if (sums[i] == sumWhole/3) {
        			c1++;
        		}
    		}
    		else {
	    		if (i >= 2 && sums[i] == sumWhole*2/3) {
	    			total+=c1;
	    		}
	    		if (sums[i] == sumWhole/3) {
	    			c1++;
	    		}
    		}
    		
    	}
    	
    	out.println(total);
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


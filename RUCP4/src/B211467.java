import java.io.*;
import java.util.*;

public class B211467 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
    	int n = in.nextInt();
    	char[] s = new char[n];
    	s = in.next().toCharArray();
    	char[] decode = new char[n];
    	if (n % 2 == 0) {
    		int pos = n/2-1;
    		for (int i = 0; i < n; i++) {
    			decode[pos] = s[i];
    			if (i % 2 == 0) {
    				pos += i+1;
    			}
    			else {
    				pos -= i+1;
    			}
    		}
    	}
    	else {
    		int pos = n/2;
    		for (int i = 0; i < n; i++) {
    			decode[pos] = s[i];
    			if (i % 2 == 0) {
    				pos -= i+1;
    			}
    			else {
    				pos += i+1;
    			}
    		}
    	}
    	System.out.println(decode);
    	
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


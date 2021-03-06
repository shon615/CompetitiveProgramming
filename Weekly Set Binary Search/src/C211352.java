import java.io.*;
import java.util.*;

public class C211352 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
    	
    	long n = in.nextLong();
    	long[] b = in.nextLongArr((int)n);
    	Arrays.sort(b);
    	long countSmall = 1;
    	int i = 1;
    	while(i < n && b[i] == b[0]) {
    		countSmall++;
    		i++;
    	} 
    	
    	int j = (int)n-2;
    	long countBig = 1;
    	while (j >= 0 && b[(int) (n-1)] == b[j]) {
    		countBig++;
    		j--;
    	}
    	long ans;
    	if (countSmall + countBig > n) {
    		ans = (n * (n-1))/2;
    	}
    	else {
    		ans = countSmall*countBig;
    	}
    	
    	System.out.println((b[(int) (n-1)] - b[0]) + " " + ans);
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


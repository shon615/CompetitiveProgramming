import java.io.*;
import java.util.*;

public class C211998 {

    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
    	int a = in.nextInt();
    	int b = in.nextInt();
    	
    	int c2 = a*a;
    	int i1 = 0;
    	int j1 = 0;
    	boolean foundit = false;
    	for (i1 = 1; i1 < a; i1++) {
    		foundit = false;
    		int a2 = i1*i1;
    		for (j1 = 0; j1 < a; j1++){
    			int b2 = j1*j1;
    			if (a2 + b2 == c2){
    				foundit = true;
    				break;
    			}
    		}
    		if (foundit) break;
    	}
    	if (!foundit) {
    		out.println("NO");
    		return;
    	}
    	
    	c2 = b*b;
    	int i2 = 0, j2 = 0;
    	for (i2 = 1; i2 < a; i2++) {
    		foundit = false;
    		int a2 = i2*i2;
    		for (j2 = 1; j2 < a; j2++){
    			int b2 = j2*j2;
    			if (a2 + b2 == c2){
    				foundit = true;
    				break;
    			}
    		}
    		if (foundit) break;
    	}
    	if (!foundit) {
    		out.println("NO");
    		return;
    	}
    	//see if i1, j1 and i2, j2 are similar triangles.
    	
    	double scale = i2/(double)i1;
    	if (j2/(double)j1 == scale) {
    		out.println("YES");
    		out.printf("0 0\n %d %d\n %d %d", i1, j1, -j2, i2);
    	}
    	else {
    		out.println("NO");
    	}
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


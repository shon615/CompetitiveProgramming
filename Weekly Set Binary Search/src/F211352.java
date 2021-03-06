import java.io.*;
import java.util.*;


public class F211352 {
	static class Laptop {
		Integer price;
		Integer value;
		public Laptop(int p, int v) {
			price = p;
			value = v;
		}
		
	}
	static class LaptopComparator implements Comparator<Laptop> {

		@Override
		public int compare(Laptop arg0, Laptop arg1) {
			// TODO Auto-generated method stub
			return arg0.price.compareTo(arg1.price);
		}
	}
	
    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
    	int n = in.nextInt();
    	Laptop[] l = new Laptop[n];
    	for (int i = 0; i < n; i++) {
    		int a = in.nextInt();
    		int b = in.nextInt();
    		l[i] = new Laptop(a, b);
    	}
    	Arrays.sort(l, new LaptopComparator());
    	
    	for (int i = 1; i < n; i++) {
    		
    		if (l[i].value < l[i-1].value){
    			System.out.println("Happy Alex");
    			return;
    		}
    	}
    	System.out.println("Poor Alex");
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


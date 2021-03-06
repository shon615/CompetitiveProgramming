import java.io.*;
import java.util.*;

public class B212472 {

    static FastReader in = null;
    static PrintWriter out = null;
    public static void solve()
    {
    	
    	int m = in.nextInt();
    	int s = in.nextInt();
    	if (m == 1 && s == 0) {
    		out.println(0 + " " + 0);
    		return;
    	}
    	if (s > m*9 || s == 0) {
    		out.println("-1 -1");
    		return;
    	}
    	char[] maxnum = new char[m];
    	Arrays.fill(maxnum, '0');
    	maxnum = getmaxnum(0, s, maxnum);
    	
    	char[] minnum = new char[m];
    	Arrays.fill(minnum, '0');
    	//fill the first index
    	int first = 0;
    	if ((m-1)*9 >= s-1) {
    		first = 1;
			minnum[0] = (char)(1 + '0');
    	}
    	else {
    		first = s - (m-1)*9;
    		minnum[0] = (char)(first + '0');
    	}
    	minnum = getminnum(m-1, s-first, minnum);
    	
    	
    	out.print(new String(minnum) + " " + new String(maxnum));
    	
    }
    
    public static char[] getmaxnum(int index, int s, char[] num) {
		if (index >= num.length) {
			return num;
		}
    	if (s >= 9) {
			num[index] = '9';
			return getmaxnum(index+1, s-9, num);
		}
		else {
			num[index] = (char)(s + '0');
			return num;
		}
    }
    
    public static char[] getminnum(int index, int s, char[] num) {
    	
    	if (index <= 0) {
    		return num;
    	}
    	
    	if (s >= 9) {
    		num[index] = (char)(9 + '0');
    		return getminnum(index-1, s-9, num);
    	}
    	else {
    		num[index] = (char)(s + '0');
    		return num;
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


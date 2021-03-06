import java.io.*;
import java.util.*;

public class B211998 {
	static class Player {
		int num;
		int y;
		boolean hasRed;
		int tor;
		String team;
		
	}
	static class Foul {
		String team;
		int num;
		int time;
		String card;
		
	}
    static FastReader in = null;
    static PrintWriter out = null;

    public static void solve()
    {
    	
    	String h = in.nextLine();
    	String a = in.nextLine();
    	
    	int n = in.nextInt();
    	Player homePlayers[] = new Player[100];
    	Player awayPlayers[] = new Player[100];
    	ArrayList<Player> red = new ArrayList<Player>();
    	for (int i = 0; i < n; i++) {
    		int time = in.nextInt();
    		String team = in.next();
    		int play = in.nextInt();
    		String card = in.next();
    		if (team.equals("h")) {
    			if (homePlayers[play] == null) {
    				Player p = new Player();
    				p.num = play;
    				p.team = h;
    				if (card.equals("r")) {
    					p.hasRed = true;
    					p.tor = time;
    					red.add(p);
    				}
    				homePlayers[play] = p;
    			}
    			else {
    				Player p = homePlayers[play];
    				if (p.hasRed) continue;
					p.hasRed = true;
					p.tor = time;
					red.add(p);
    			}
    		}
    		else {
    			if (awayPlayers[play] == null) {
    				Player p = new Player();
    				p.num = play;
    				p.team = a;
    				if (card.equals("r")) {
    					p.hasRed = true;
    					p.tor = time;
    					red.add(p);
    				}
    				awayPlayers[play] = p;
    			}
    			else {
    				Player p = awayPlayers[play];
    				if (p.hasRed) continue;
					p.hasRed = true;
					p.tor = time;
					red.add(p);
    			}
    		}
    		
    	}
    	for (Player p : red) {
    		out.printf("%s %d %d \n", p.team, p.num, p.tor);
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


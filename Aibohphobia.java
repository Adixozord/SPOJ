import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;

class Aibohphobia {
    Parser in = new Parser(System.in);
    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        new Aibohphobia().run();
    }

    private static short[][] dp = new short[3][6100];   // Space reuse for all test cases

    void run() throws IOException {
        int testcases = in.nextInt();
        while (testcases-- > 0) {
            String str = in.readLine();
            solve(str.toCharArray());
        }
        out.flush();
    }

    void solve(char[] str) {    // chatAt() method is slow when the string is long
        int n = str.length;

        Arrays.fill(dp[0], 0, n, (short)0);    // dp(i,i-1)
        Arrays.fill(dp[1], 0, n, (short)0);    // dp(i,i)

        // Used (costly) mod to compute row, lastRow, and lastLastRow earlier, leading to TLEs
        int row = 2, lastRow = 1, lastLastRow = 0;

        for (short d = 1; d < n; d++) {
            for (short i = 0; i < n-d; i++) {
                if (str[i] == str[i+d])   // dp(i,j) where j = i+d
                    dp[row][i] = dp[lastLastRow][i+1];
                else
                    dp[row][i] = (dp[lastRow][i] < dp[lastRow][i+1]) ?
                            (short)(dp[lastRow][i]+1) :
                            (short)(dp[lastRow][i+1]+1);
            }
            lastLastRow = lastRow;
            lastRow = row;
            row = (row == 2) ? 0 : row+1;
        }

        out.println(dp[lastRow][0]);
    }

    /**
     * A fast parser taking in an InputStream, with self-maintained buffer
     */
    static class Parser {
        final private int BUFFER_SIZE = 1 << 16;  // 2^16, a good compromise for some problems
        private InputStream din;    // Underlying input stream
        private byte[] buffer;      // Self-maintained buffer
        private int bufferPointer;  // Current read position in the buffer
        private int bytesRead;      // Effective bytes in the buffer read from the input stream

        public Parser(InputStream in) {
            din = in;
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        /**
         * Read the next integer from the input stream.
         * @return The next integer.
         * @throws java.io.IOException
         */
        public int nextInt() throws IOException {
            int result = 0;
            byte c = read();
            while (c <= ' ') c = read();
            boolean neg = (c == '-');
            if (neg) c = read();
            while (c >= '0' && c <= '9') {
                result = result * 10 + c - '0';
                c = read();
            }
            if (neg) return -result;
            return result;
        }

        /**
         * Read a line of data from the input stream.
         * @return the next line of data.
         * @throws IOException if an I/O error occurs.
         */
        public String readLine() throws IOException {
            StringBuilder line = new StringBuilder();
            char c;
            while ((c = (char)(read())) != '\n') {
                line.append(c);
            }
            return line.toString();
        }

        /**
         * Read the next byte of data from the input stream.
         * @return the next byte of data, or -1 if the end of the stream is reached.
         * @throws IOException if an I/O error occurs.
         */
        public byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        /**
         * Read data from the input stream into the buffer
         * @throws IOException if an I/O error occurs.
         */
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
    }
}
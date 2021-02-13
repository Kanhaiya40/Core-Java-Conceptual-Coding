package hacker_earth_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InterestingPairs {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        int[] result = new int[T];
        for (int t_i = 0; t_i < T; t_i++) {
            int count = 0;
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int M = Integer.parseInt(line[1]);
            int X = Integer.parseInt(line[2]);
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for (int i_A = 0; i_A < arr_A.length; i_A++) {
                A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
            wr.close();
            br.close();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if ((A[i] + A[j]) % M <= X) {
                        count++;
                    }
                }
            }
            result[t_i] = count;
        }
        for (int res : result) {
            System.out.println(res);
        }
    }
}

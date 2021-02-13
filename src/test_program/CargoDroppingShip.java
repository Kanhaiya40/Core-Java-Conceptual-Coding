package test_program;

import java.util.ArrayList;
import java.util.Scanner;

public class CargoDroppingShip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int[] result = new int[testCase];
        int sum;
        for (int l = 0; l < testCase; l++) {
            sum = 0;
            int k = 0;
            int min;
            int N = scanner.nextInt();
            int[] waves = new int[N];
            for (int j = 0; j < N; j++) {
                waves[j] = scanner.nextInt();
            }
            ArrayList<Integer> continuousWaves = new ArrayList<>();
            while (k != waves.length - 1) {
                int i;
                continuousWaves.clear();
                if (waves[k + 1] > waves[k]) {
                    i = k;
                    min = waves[i];
                    continuousWaves.add(waves[i]);
                    while (waves[i + 1] > waves[i]) {
                        if (waves[i + 1] < min) {
                            min = waves[i];
                        }
                        continuousWaves.add(waves[i + 1]);
                        i++;
                        if (i == waves.length - 1) {
                            break;
                        }
                    }
                } else {
                    i = k;
                    min = waves[i];
                    continuousWaves.add(waves[i]);
                    while (waves[i + 1] < waves[i]) {
                        if (waves[i + 1] < min) {
                            min = waves[i + 1];
                        }
                        continuousWaves.add(waves[i + 1]);
                        i++;
                        if (i == waves.length - 1) {
                            break;
                        }
                    }
                }
                sum = sum + min * continuousWaves.size();
                if (i == waves.length - 1) {
                    break;
                }
                k = i;
            }
            result[l] = sum;
        }
        for (int res : result) {
            System.out.println(res);
        }
    }
}

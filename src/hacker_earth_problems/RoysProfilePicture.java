package hacker_earth_problems;

import java.util.Scanner;

public class RoysProfilePicture {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int numOfPhoto = scanner.nextInt();
        String[] result = new String[numOfPhoto];
        for (int i = 0; i < numOfPhoto; i++) {
            int width = scanner.nextInt();
            int height = scanner.nextInt();
            if (width < L || height < L) {
                result[i] = "UPLOAD ANOTHER";
            } else if ((width > L || height > L) && width==height) {
                result[i] = "ACCEPTED";
            }
            else if (width > L || height > L){
                result[i]="CROP IT";
            }
            if (width == L && height == L) {
                result[i] = "ACCEPTED";
            }
        }
        for (String res : result) {
            System.out.println(res);
        }
    }
}

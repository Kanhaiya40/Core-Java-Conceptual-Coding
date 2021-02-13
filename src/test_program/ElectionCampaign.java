package test_program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElectionCampaign {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int noOfHouses=scanner.nextInt();
        int noOfDays=scanner.nextInt();
        Map<Integer,Integer> noOfVisitPerHouse=new HashMap<>();
        for (int i = 0; i < noOfDays; i++) {
            int totalVisitThatDay=scanner.nextInt();
            for (int j = 0; j < totalVisitThatDay; j++) {
                int houseNumber=scanner.nextInt();
                if (noOfVisitPerHouse.containsKey(houseNumber)){
                    noOfVisitPerHouse.put(houseNumber,noOfVisitPerHouse.get(houseNumber)+1);
                }
                else {
                    noOfVisitPerHouse.put(houseNumber,1);
                }
            }
        }
        for (Map.Entry<Integer,Integer> entry:noOfVisitPerHouse.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}

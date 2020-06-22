package oracledocumentation.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchingTechniqueOfCollection {
    public static void main(String[] args) {
        List<String> listOfItems = new ArrayList<>();
        listOfItems.add("Sports Eqipments");
        listOfItems.add("Library Books");
        listOfItems.add("Video Games");
        listOfItems.add("Food Items");
        listOfItems.add("Utensils");
        System.out.println(Collections.binarySearch(listOfItems, "Sports Eqipments"));
        System.out.println(Collections.frequency(listOfItems, "Utensils"));
        String randomString = "najnsnisnnja";
        Character[] ch = new Character[randomString.length()];
        for (int i = 0; i < randomString.length(); i++) {
            ch[i] = randomString.charAt(i);
        }
        List<Character> listOfCharacterInString = Arrays.asList(ch);
        System.out.println(Collections.frequency(listOfCharacterInString, 'n') + ": no of Times the Given Character Comes in List");
        System.out.println("Minimum Value Of Character InGiven List:" + Collections.min(listOfCharacterInString));
        System.out.println("Maximum Value Of Character InGiven List:" + Collections.max(listOfCharacterInString));
    }
}

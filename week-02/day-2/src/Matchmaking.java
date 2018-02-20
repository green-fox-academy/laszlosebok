import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }
    public static List<String> makingMatches(List<String> listOfGirls, List<String> listOfBoys) {
        int whereToPut = 1;
        int lastSorted = 0;
        int numberOfGirls = listOfGirls.size();
        if (listOfBoys.size() <= numberOfGirls) {
            for (String currentBoy : listOfBoys) {
                listOfGirls.add(whereToPut, currentBoy);
                whereToPut += 2;
            }

            return  listOfGirls;
        } else {
            for (int i = 0; i < numberOfGirls; i++) {
                listOfGirls.add(whereToPut, listOfBoys.get(i));

                whereToPut += 2;
                lastSorted = i;
            }
            for (int i = lastSorted + 1; i < listOfBoys.size(); i++) {
                listOfGirls.add(listOfBoys.get(i));
            }
            return listOfGirls;
        }
    }
}
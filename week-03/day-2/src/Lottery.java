import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Lottery {
  public static final String SOURCE_STRING_PATH = "lottery.csv";
  public static final int NUMBERS_STARTING_INDEX = 11;
  public static final int NUMBER_RANGE = 90;
  public static final int TOP_X_NUMBERS = 5;
  
  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers in lottery.csv
    Path sourcePath = Paths.get(SOURCE_STRING_PATH);
  
    List<Integer> numberList = getNumbers(sourcePath);
    findTopNumbers(numberList);
    
  }
  public static List<Integer> getNumbers(Path sourcePath) {
    List<Integer> numberList = new ArrayList<>();
    try {
      for (String currentLine : Files.readAllLines(sourcePath)) {
        for (int index = NUMBERS_STARTING_INDEX; index < NUMBERS_STARTING_INDEX + 5; index++) {
          numberList.add(Integer.valueOf(currentLine.split(";")[index]));
        }
      }
    } catch (IOException IOE) {
      System.out.println(("Loading data from file was unsuccessful!"));
    }
    return numberList;
  }
  public static void findTopNumbers(List<Integer> numberList) {
    List<Integer> indexes = new ArrayList<>();
    int[] lotteryArray = countFrequency(numberList);
    
    for (int i = 0; i < TOP_X_NUMBERS; i++) {
      indexes.add(findBiggest(lotteryArray));
    }
    System.out.println(indexes);
  }
  
  private static int[] countFrequency(List<Integer> numberList) {
    int[] lotteryArray = new int[NUMBER_RANGE];
    
    for (int i = 0; i < numberList.size(); i++) {
      lotteryArray[numberList.get(i) - 1] += 1;
    }
    return lotteryArray;
  }
  
  private static int findBiggest(int[] lotteryArray) {
    int previousBiggest = 0;
    int previousBiggestIndex = 0;
    
    for (int j = 0; j < lotteryArray.length; j++) {
      if (lotteryArray[j] > previousBiggest) {
        previousBiggest = lotteryArray[j];
        previousBiggestIndex = j;
      }
    }
    lotteryArray[previousBiggestIndex] = 0;
    
    return previousBiggestIndex + 1;
  }
}
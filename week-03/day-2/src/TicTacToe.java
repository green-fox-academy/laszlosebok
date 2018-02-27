import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TicTacToe {
  
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.
    
    System.out.println(ticTacResult("win-o.txt"));
    // should print O
    
    System.out.println(ticTacResult("win-x.txt"));
    // should print X
    
    System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }
  public static String ticTacResult(String fileName) {
    Path filePath = Paths.get(fileName);
    char[][] ticTacResult = new char[3][3];
    String result;
    
    try {
      for (int row = 0; row < Files.readAllLines(filePath).size(); row++) {
        for (int column = 0; column < Files.readAllLines(filePath).get(row).length(); column++) {
          ticTacResult[row][column] = Files.readAllLines(filePath).get(row).charAt(column);
        }
      }
    } catch (IOException IOE) {
      System.out.println(("Couldn't input the result!"));
    }
    
    if (ticTacResult[0][0] == ticTacResult[0][1] && ticTacResult[0][1] == ticTacResult[0][2]) {
      result = String.valueOf(ticTacResult[0][0]);
    } else if (ticTacResult[1][0] == ticTacResult[1][1] && ticTacResult[1][1] == ticTacResult[1][2]) {
      result = String.valueOf(ticTacResult[1][0]);
    } else if (ticTacResult[2][0] == ticTacResult[2][1] && ticTacResult[0][1] == ticTacResult[2][2]) {
      result = String.valueOf(ticTacResult[2][0]);
    } else if (ticTacResult[0][0] == ticTacResult[1][0] && ticTacResult[1][0] == ticTacResult[2][0]) {
      result = String.valueOf(ticTacResult[0][0]);
    } else if (ticTacResult[0][1] == ticTacResult[1][1] && ticTacResult[1][1] == ticTacResult[2][1]) {
      result = String.valueOf(ticTacResult[0][1]);
    } else if (ticTacResult[0][2] == ticTacResult[1][2] && ticTacResult[1][2] == ticTacResult[2][2]) {
      result = String.valueOf(ticTacResult[0][2]);
    } else if (ticTacResult[0][0] == ticTacResult[1][1] && ticTacResult[1][1] == ticTacResult[2][2]) {
      result = String.valueOf(ticTacResult[0][0]);
    } else if (ticTacResult[0][2] == ticTacResult[1][1] && ticTacResult[1][1] == ticTacResult[2][0]) {
      result = String.valueOf(ticTacResult[0][2]);
    } else {
      result = "draw";
    }
    
    return result;
  }
}
//© 2018 GitHub, Inc.
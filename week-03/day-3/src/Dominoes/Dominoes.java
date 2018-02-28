package Dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    dominoes = orderDominoes(dominoes);
    System.out.println(dominoes);
  }
  
  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
  
  static List<Domino> orderDominoes(List<Domino> dominoesToOrder) {
    List<Domino> orderedDominoes = new ArrayList<>();
    orderedDominoes.add(dominoesToOrder.get(0));
    int valueToLookFor = dominoesToOrder.get(0).getValues()[1];
    for (int i = 1; i < dominoesToOrder.size(); i++) {
      for (int j = 0; j < dominoesToOrder.size(); j++) {
        int currentValue = dominoesToOrder.get(j).getValues()[0];
        if (valueToLookFor == currentValue) {
          orderedDominoes.add(dominoesToOrder.get(j));
          valueToLookFor = dominoesToOrder.get(j).getValues()[1];
          break;
        }
      }
    }
    return orderedDominoes;
  }
}
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FoxStream {
  
  // Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes,
  // it's up to you how you name/create them!
  // Write a Stream Expression to find the foxes with green color!
  // Write a Stream Expression to find the foxes with green color and pallida type!
  
  public static void main(String[] args) {
    
    List<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("83c001", "macrotis", "green"));
    foxes.add(new Fox("84dc47", "corsac", "green"));
    foxes.add(new Fox("Vuk", "vulpes", "red"));
    foxes.add(new Fox("248817", "pallida", "green"));
    foxes.add(new Fox("024c13", "pallida", "green"));
    
    List<Fox> greenFoxes = foxes
        .stream()
        .filter(f -> f.getColor().equals("green"))
        .collect(Collectors.toList());
    
    List<Fox> greenPallida = greenFoxes
        .stream()
        .filter(f -> f.getType().equals("pallida"))
        .collect(Collectors.toList());
  
    System.out.println(greenFoxes);
    System.out.println(greenPallida);
    
    
  }
}

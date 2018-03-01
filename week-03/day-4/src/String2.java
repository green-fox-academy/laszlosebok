public class String2 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    String convertThis = "xDSJxnfdskXxldsjx";
    System.out.println(stringConverter(convertThis));
  }
  private static String stringConverter(String toConvert) {
    if (toConvert.length() == 0) {
      return "";
    } else if (toConvert.charAt(0) == 'x') {
      return "" + stringConverter(toConvert.substring(1));
    } else {
      return toConvert.charAt(0) + stringConverter(toConvert.substring(1));
    }
  }
}

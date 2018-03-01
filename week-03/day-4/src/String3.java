public class String3 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".
    String convertThis = "xDSJxnfdskXxldsjx";
    System.out.println(stringConverter(convertThis));
  }
  private static String stringConverter(String toConvert) {
    if (toConvert.length() == 1) {
      return "" + toConvert.charAt(0);
    } else {
      return toConvert.charAt(0) + "*" + stringConverter(toConvert.substring(1));
    }
  }
}

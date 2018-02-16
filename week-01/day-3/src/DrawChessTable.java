public class DrawChessTable {
    public static void main(String[] args) {
        int squareSize = 8;
        boolean isTheSquareDark = false;
        String darkSquare = "%";
        String whiteSquare = " ";
        String currentLine;

        for (int i = 0; i < squareSize; i++) {
            currentLine = "";
            isTheSquareDark = !isTheSquareDark;
            for (int j = 0; j < squareSize; j++) {
                if (isTheSquareDark) {
                    currentLine += darkSquare;
                    isTheSquareDark = false;
                } else {
                    currentLine += whiteSquare;
                    isTheSquareDark = true;
                }
            }
            System.out.println(currentLine);
        }
    }
}

public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String addToBeginning = "My todo:";
        String addToEnd = " - Download games";
        String addWithIndention = " - Diablo";
        String newLine = "\n";
        String addTab = "\t";

        todoText = addToBeginning.concat(newLine.concat(todoText.concat(addToEnd.concat(newLine.concat(addTab.concat(addWithIndention))))));

        System.out.println(todoText);
    }
}
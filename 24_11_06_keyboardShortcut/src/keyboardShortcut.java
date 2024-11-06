

public class keyboardShortcut {
    public static void main(String[] args) throws Exception {
        if ( args.length > 1) {
            System.out.println("Please provide only a String as Argument");
            System.exit(0);
        }
        String argument = args[0];
        if (argument.length() == 0) {
            System.out.println("Argument too short");
            System.exit(0);
        }
        
        String[] wordStrings = argument.split(" ");
        String newString = "";
        String copySubString = "";
        for (int i = 0; i < wordStrings.length; i++) {
            if (i + 2 < wordStrings.length && ("Ctrl".equals(wordStrings[i]) || "CTRL".equals(wordStrings[i])) && "+".equals(wordStrings[i+1]) && "C".equals(wordStrings[i+2])) {
                copySubString = newString;
                i = i+2;
                continue;
            }
            if (i + 2 < wordStrings.length && ("Ctrl".equals(wordStrings[i]) || "CTRL".equals(wordStrings[i])) && "+".equals(wordStrings[i+1]) && "V".equals(wordStrings[i+2])) {
                newString += copySubString + " ";
                i = i+2;
                continue;
            }
            newString += wordStrings[i] + " ";
        }
        newString = newString.replace("  ", " ");
        System.out.println(newString);
    }
}
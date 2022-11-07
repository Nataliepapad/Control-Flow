package Switch;

public class Switch {
    public static String switchCase(int intValue) {
        switch (intValue) {
            case 1:
                return "Value was 1";
            case 2:
                return "Value was 2";
            case 3: case 4: case 5: case 6: case 7:
                return "Value was " + intValue;
            default:
                return "Value not found";
        }
    }

    public static String switchCase(char charValue) {
        switch (charValue) {
            case 'A':
                return "Char was A";
            case 'B':
                return "Char was B";
            case 'C': case 'D': case 'E': case 'F': case 'G':
                return "Char was " + charValue;
            default:
                return "Char not found";
        }
    }

    public static int switchCase(String monthValue) {
        switch (monthValue.toLowerCase()) {
            case "january":
                return 1;
            case "february":
                return 2;
            case "march":
                return 3;
            default:
                return -1;
        }
    }
}

package Controler;

public class StringOperations {

    public boolean andCheck(String input) {

        if ((input.contains("and")) || (input.contains("AND") == true)) {

            return true;
        }
        return false;
    }
    
    public boolean orCheck(String input) {

        if (input.contains("or") || input.contains("OR") == true) {

            return true;
        }
        return false;
    }

    public String[] splitInput(String input) {

        String[] inputarr = input.split(" ");
        return inputarr;
    }

    public String replaceAnd(String input) {
    
        String regex="\\s*\\band\\b\\s*";
        input=input.replaceAll(regex," ");
        return input;
    }
    
    public String replaceOr(String input) {
    
        String regex="\\s*\\bor\\b\\s*";
        input=input.replaceAll(regex," ");
        return input;
    }

}

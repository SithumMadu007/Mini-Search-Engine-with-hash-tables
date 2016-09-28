package Moduler;

public class Link {

    private String value;
    public Link next;

    public Link(String key) {

        value = key;
        next = null;
    }

    public String getString() {

        return value;
    }

    public void displayLink() {
    
        System.out.print(value+",");
    }

}

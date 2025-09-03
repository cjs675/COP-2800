package examples;

public class CharDemo {
    public static void main(String[] args) {
        char initial = 'A';
        System.out.println(initial);
        System.out.print("\t\"abc\\def\bghi\n\njkl"); // def followed by backspace escape sequence
                                                      // f overriden by ghi
                                                      // two newline escape sequences provide double-spaced effect \n\n
    }
}

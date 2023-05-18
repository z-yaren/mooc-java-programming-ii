
import java.awt.print.Book;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    //prints all the values in the hashmap given as a parameter using the toString method of the Book objects.
    public static void printValues(HashMap<String, Book> hashMap){
        for(Book value: hashmap.values()){
            System.out.println(value);
        }
    }

    //prints only the Books in the given hashmap which name contains the given string. You can find out the name of a Book with the method getName.
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book value : hashmap.values()) {
            if (value.getName().contains(text)) {
                System.out.println(value);
            }
        }
    }

}

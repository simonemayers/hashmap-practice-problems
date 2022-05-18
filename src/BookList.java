import java.util.ArrayList;

public class BookList {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
        books.add(senseAndSensibility);
        books.add(prideAndPrejudice);

        Book match = null;
        for(Book book: books){
            if(book.getName().equals("Sense and Sensibility")) {
                match = book;
                break;
            }
        }
        System.out.println(match);
        System.out.println();

        match = null;
        for(Book book: books){
            if(book.getName().equals("Persuasion")){
                match = book;
                break;
            }
        }
        System.out.println(match);

        System.out.println(get(books, "Sense and Sensibility"));
        System.out.println();
        System.out.println(get(books, "Persuasion"));

        long start = System.nanoTime();
        System.out.println(get(books, "Sense and Sensibility"));
        System.out.println();
        System.out.println(get(books, "Persuasion"));
        long end = System.nanoTime();
        double durationInMilliseconds = 1.0 * (end - start) / 1000000;

        System.out.println("The book search took " + durationInMilliseconds + " milliseconds.");
    }
    public static Book get(ArrayList<Book> books, String name){
        for(Book book: books){
            if(book.getName().equals(name)){
                return book;
            }
        }
        return null;
    }
}

package SP2;

public class LibraryRoyalityCalculator {
    public static void main(String[] args) {

        Author author = new Author("J.K. Rowling");
        Author author2 = new Author("Homer");

        Title title1 = new PrintedBook("Harry Potter and the Philosopher's Stone", "SKØN", 15, 223);
        Title title2 = new AudioBook("Harry Potter and the Chamber of Secrets", "SKØN", 5, 300);

        Title title3 = new PrintedBook("Odysse", "BI", 35, 500);

        author.addTitle(title1);  // Add PrintedBook title
        author.addTitle(title2);  // Add AudioBook title
        author2.addTitle(title3);

        System.out.println("Total payment for " + author.getName() + ": " + author.calculateTotalPay()+"Dkkr");
        System.out.println("Total payment for " + author2.getName() + ": " + author2.calculateTotalPay()+"Dkkr");
    }
}

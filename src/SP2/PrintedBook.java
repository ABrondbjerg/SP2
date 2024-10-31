package SP2;

public class PrintedBook extends Title {
    private int pages;

    public PrintedBook(String title, String LiteratureType, int copies, int pages) {
        super(title, LiteratureType, copies);
        this.pages = pages;

    }

    @Override
    protected double calculatePoints() {
        return pages * calculateLiteraturePoints() * copies;
    }

    //
    @Override
    protected double calculateLiteraturePoints() {
        switch (literatureType) {
            case "BI":
                return 3;
            case "TE":
                return 3;
            case "LYRIK":
                return 6;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1;
            default:
                return 0;

        }
    }
}

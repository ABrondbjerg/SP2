package SP2;

public abstract class Title {
    private String title;
    String literatureType;
    protected int copies;
    protected double rate = 0.06757;

    public Title(String title, String literatureType, int copies){
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public double calculateRoyalty(){
        return rate*calculatePoints();
    }
    protected abstract double calculatePoints();
    protected abstract double calculateLiteraturePoints();
}

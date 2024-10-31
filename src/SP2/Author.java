package SP2;

import java.util.ArrayList;

public class Author {
    private String name;

    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public ArrayList<Title> getTitles() {
        return titles;
    } // Kunne bruges hvis titel man skulle bruge titlen - bruges ikke.

    public float calculateTotalPay() {
        float totalPay = 0;
        for (Title title : titles) {
            totalPay += title.calculateRoyalty();
        }
        return totalPay;
}

    }


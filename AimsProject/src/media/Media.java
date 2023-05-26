package media;

import java.util.Comparator;

public class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorCostTitle();

    public Media() {
        
    }

    public Media(String title) {
        this.title = title;
    }

    public Media(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

    public float getCost() {
        return this.cost;
    }

    public boolean equals(Object c) {
        if(c == this) return true;
        if(!(c instanceof Media media)) return false;
        return media.getTitle() == this.getTitle();
    }
}


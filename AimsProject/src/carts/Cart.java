package carts;

import java.util.ArrayList;

import media.*;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public Cart() {

    }

    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public void addMedia(Media t) {
        if(itemsOrdered.contains(t)) {
            System.out.println("The item is already in cart");
            return;
        }
        itemsOrdered.add(t);
    }

    public void removeMedia(Media t) {
        if(!itemsOrdered.contains(t)) {
            System.out.println("The item is not in cart");
            return;
        }
        itemsOrdered.remove(t);
    }


    public float totalCost() {
        float total = 0f;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }

        return total;
    }


    public void print() {
        System.out.println("***********************CART***********************\nOrdered Items:");

        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }

        System.out.println("Total cost: " + this.totalCost());
        System.out.println("***************************************************");
    }

    //search
    public void search_id(int id) {
        boolean isMatch = false;

        for (Media media : itemsOrdered) {
            if(id == media.getId()) {
                System.out.println(media.toString());
                isMatch = true;
            }
        }

        if(!isMatch) System.out.println("No match is found");
    }

    public void search_title(String title) {
        boolean isMatch = false;

        for (Media media : itemsOrdered) {
            if(title == media.getTitle()) {
                System.out.println(media.toString());
                isMatch = true;
            }
        }

        if(!isMatch) System.out.println("No match is found");
    }
}

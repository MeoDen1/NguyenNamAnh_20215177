package store;

import media.*;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemInStore = new ArrayList<Media>();

    public void addMedia(Media disc) {
        itemInStore.add(disc);
        System.out.println("Item has been added");
    }

    public void removeMedia(Media disc) {
        for (int i = 0; i < itemInStore.size(); i++) {
            if (itemInStore.get(i).equals(disc)) {
                itemInStore.remove(i);
                System.out.println("Item has been removed");
                return;
            }
        }
        System.out.println("Item not available");
    }

    public Media search(String title) {
        for (Media media : itemInStore) {
            if(media.getTitle() == title) {
                media.toString();
                return media;
            }
        }
        return null;
    }

    public void printStore() {
        if (itemInStore.size() > 0) {
            System.out.println("STORE\n----------------------------------------------------------------------------------------------");
            for (Media m : itemInStore) {
                System.out.println(m.toString());
            }
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println("Total number of items in store: " + itemInStore.size());
        } else System.out.println("No item in store");
    }
}
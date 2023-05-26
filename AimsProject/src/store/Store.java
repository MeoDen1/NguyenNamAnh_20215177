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
}
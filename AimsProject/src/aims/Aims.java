package aims;

import media.*;
import carts.Cart;
import store.Store;

import java.util.Collection;
import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Cart anOrder = new Cart();
        Store store = new Store();
        
        while(true) {
            showMenu();
            int t = myObj.nextInt();

            if(t == 1) {
                storeMenu();
                int t1 = myObj.nextInt();

                if(t1 == 1) {
                    System.out.print("Input title: ");
                    String _title = myObj.nextLine();
                    
                    Media target = store.search(_title);

                    if(target == null) {
                        System.out.println("No media with input title");
                        continue;
                    }

                    mediaDetailsMenu();

                    int t2 = myObj.nextInt();
                    
                    if(t2 == 1) {
                        anOrder.addMedia(target);
                    }
                    else if(t2 == 2) {
                        if(target instanceof DigitalVideoDisc dvd) {
                            dvd.play();
                        }
                        else if(target instanceof CompactDisc cd) {
                            cd.play();
                        }
                        else {
                            System.out.println("Can not play this media");
                        }
                    }

                }
                else if(t1 == 4) {
                    cartMenu();
                    int t2 = myObj.nextInt();
                    if(t2 == 1) {

                    }
                    else if(t2 == 2) {
                        int t3 = myObj.nextInt();
                        System.out.print("1. Sort by title \n 2. Sort by cost \n : ");
                        if (t3 == 1) {
                            java.util.Collection.sort(anOrder, Media.COMPARE_BY_TITLE_COST);
                        }
                        else if(t3 == 2) {
                            java.util.Collection.sort(anOrder, Media.COMPARE_BY_COST_TITLE);

                        }
                        else continue;
                    }
                    else if(t2 == 5) {
                        System.out.println("An order is created");
                    }
                }
            }
            else if(t == 2) {
                updateStore();
                int t1 = myObj.nextInt();

                System.out.print("Input title: ");
                String _title = myObj.nextLine();
                Media media = new Media(_title);

                if(t1 == 1) store.addMedia(media);
                else if(t1 == 2) store.removeMedia(media);
                else continue;
            }
            else if(t == 3) {
                anOrder.print();
            }
            else if(t == 0) {
                break;
            }
        }
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
        
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void updateStore() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add medias in cart");
        System.out.println("2. Remove medias in cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
}

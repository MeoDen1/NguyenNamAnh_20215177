public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = 
        new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private int qtyOrdered;

    public Cart() {
        this.qtyOrdered = 0;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public float totalCost() {
        float total = 0f;
        for(int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }

        return total;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }

        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered += 1;

        System.out.println("The disc has been added");
    }

    public addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        for(Object disc: dvdList) {
            addDigitalVideoDisc(disc)
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered == 0) {
            System.out.println("The cart is empty, unable to remove");
            return;
        }
        
        boolean remove = false;
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i] == disc) {
                remove = true;
            }

            if(remove && i != MAX_NUMBERS_ORDERED - 1) {
                itemsOrdered[i] = itemsOrdered[i+1];
            }
        }

        if(remove) {
            itemsOrdered[--qtyOrdered] = null;
            System.out.println("The disc has been removed");
        }
        else {
            System.out.println("The disc not in the cart");
        }
    }
}

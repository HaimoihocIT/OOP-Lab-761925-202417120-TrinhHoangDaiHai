package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.media.Media;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("The media " + media.getTitle() + " has been added");
        } else {
            System.out.println("The media is already in the cart");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The media " + media.getTitle() + " has been removed");
        } else {
            System.out.println("The media is not in the cart");
        }
    }

    public float totalCost() {
        float sum = 0;
        for (Media media : itemsOrdered) {
            sum += media.getCost();
        }
        return sum;
    }

    // Nạp chồng phương thức addMedia cho danh sách
    public void addMedia(Media[] mediaList) {
        for (Media media : mediaList) {
            addMedia(media);
        }
    }

    // Nạp chồng phương thức addMedia cho 2 đối tượng
    public void addMedia(Media media1, Media media2) {
        addMedia(media1);
        addMedia(media2);
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("**************************************************");
    }

    public void searchByID(int id) {
        boolean isfound = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Found: " + media.toString());
                isfound = true;
                break;
            }
        }
        if (!isfound) System.out.println("No match found for ID: " + id);
    }

    public void searchByTitle(String title) {
        boolean isfound = false;
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + media.toString());
                isfound = true;
            }
        }
        if (!isfound) System.out.println("No match found for Title: " + title);
    }
}

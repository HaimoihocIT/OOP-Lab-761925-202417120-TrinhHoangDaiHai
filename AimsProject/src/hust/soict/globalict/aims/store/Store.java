package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) itemsInStore.add(media);
        System.out.println("The disc has been added to store!");
    }

    public void removeMedia(Media media) {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is already empty!");
            return;
        }

        if(!itemsInStore.contains(media)){
            System.out.println("The media was not found in the store!");
            return;
        }
        itemsInStore.remove(media);
        System.out.println("The media has been removed from store!");
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}
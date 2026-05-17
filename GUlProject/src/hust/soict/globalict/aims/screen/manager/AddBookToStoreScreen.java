package hust.soict.globalict.aims.screen.manager;

import hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.aims.media.Book;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookToStoreScreen extends AddItemToStoreScreen {

    public AddBookToStoreScreen(Store store) {
        super(store);
        setTitle("Add Book");
    }

    @Override
    protected JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(4, 2, 5, 5));
        
        JLabel titleLabel = new JLabel("Title: ");
        JTextField titleField = new JTextField();
        
        JLabel categoryLabel = new JLabel("Category: ");
        JTextField categoryField = new JTextField();
        
        JLabel costLabel = new JLabel("Cost: ");
        JTextField costField = new JTextField();
        
        JButton addButton = new JButton("Add Book");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String title = titleField.getText();
                    String category = categoryField.getText();
                    float cost = Float.parseFloat(costField.getText());
                    
                    Book book = new Book();
                    book.setTitle(title);
                    book.setCategory(category);
                    book.setCost(cost);
                    
                    store.addMedia(book);
                    JOptionPane.showMessageDialog(null, "Book added successfully!");
                    titleField.setText("");
                    categoryField.setText("");
                    costField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid cost!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        center.add(titleLabel);
        center.add(titleField);
        center.add(categoryLabel);
        center.add(categoryField);
        center.add(costLabel);
        center.add(costField);
        center.add(new JLabel()); // empty cell
        center.add(addButton);
        
        JPanel wrapper = new JPanel();
        wrapper.setLayout(new FlowLayout(FlowLayout.CENTER));
        center.setPreferredSize(new Dimension(400, 150));
        wrapper.add(center);
        
        return wrapper;
    }
}

package hust.soict.globalict.swing;

import hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {

    public AddDigitalVideoDiscToStoreScreen(Store store) {
        super(store);
        setTitle("Add DVD");
    }

    @Override
    protected JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(6, 2, 5, 5));
        
        JLabel titleLabel = new JLabel("Title: ");
        JTextField titleField = new JTextField();
        
        JLabel categoryLabel = new JLabel("Category: ");
        JTextField categoryField = new JTextField();
        
        JLabel directorLabel = new JLabel("Director: ");
        JTextField directorField = new JTextField();
        
        JLabel lengthLabel = new JLabel("Length: ");
        JTextField lengthField = new JTextField();
        
        JLabel costLabel = new JLabel("Cost: ");
        JTextField costField = new JTextField();
        
        JButton addButton = new JButton("Add DVD");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String title = titleField.getText();
                    String category = categoryField.getText();
                    String director = directorField.getText();
                    int length = Integer.parseInt(lengthField.getText());
                    float cost = Float.parseFloat(costField.getText());
                    
                    DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
                    
                    store.addMedia(dvd);
                    JOptionPane.showMessageDialog(null, "DVD added successfully!");
                    titleField.setText("");
                    categoryField.setText("");
                    directorField.setText("");
                    lengthField.setText("");
                    costField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid length or cost!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        center.add(titleLabel);
        center.add(titleField);
        center.add(categoryLabel);
        center.add(categoryField);
        center.add(directorLabel);
        center.add(directorField);
        center.add(lengthLabel);
        center.add(lengthField);
        center.add(costLabel);
        center.add(costField);
        center.add(new JLabel()); // empty cell
        center.add(addButton);
        
        JPanel wrapper = new JPanel();
        wrapper.setLayout(new FlowLayout(FlowLayout.CENTER));
        center.setPreferredSize(new Dimension(400, 200));
        wrapper.add(center);
        
        return wrapper;
    }
}

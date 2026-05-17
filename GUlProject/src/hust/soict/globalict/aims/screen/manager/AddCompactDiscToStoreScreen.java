package hust.soict.globalict.aims.screen.manager;

import hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.aims.media.CompactDisc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {

    public AddCompactDiscToStoreScreen(Store store) {
        super(store);
        setTitle("Add CD");
    }

    @Override
    protected JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(6, 2, 5, 5));
        
        JLabel titleLabel = new JLabel("Title: ");
        JTextField titleField = new JTextField();
        
        JLabel categoryLabel = new JLabel("Category: ");
        JTextField categoryField = new JTextField();
        
        JLabel costLabel = new JLabel("Cost: ");
        JTextField costField = new JTextField();
        
        JLabel directorLabel = new JLabel("Director: ");
        JTextField directorField = new JTextField();
        
        JLabel artistLabel = new JLabel("Artist: ");
        JTextField artistField = new JTextField();
        
        JButton addButton = new JButton("Add CD");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String title = titleField.getText();
                    String category = categoryField.getText();
                    float cost = Float.parseFloat(costField.getText());
                    String director = directorField.getText();
                    String artist = artistField.getText();
                    
                    CompactDisc cd = new CompactDisc(0, title, category, cost, director, artist);
                    
                    store.addMedia(cd);
                    JOptionPane.showMessageDialog(null, "CD added successfully!");
                    titleField.setText("");
                    categoryField.setText("");
                    costField.setText("");
                    directorField.setText("");
                    artistField.setText("");
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
        center.add(directorLabel);
        center.add(directorField);
        center.add(artistLabel);
        center.add(artistField);
        center.add(new JLabel()); // empty cell
        center.add(addButton);
        
        JPanel wrapper = new JPanel();
        wrapper.setLayout(new FlowLayout(FlowLayout.CENTER));
        center.setPreferredSize(new Dimension(400, 200));
        wrapper.add(center);
        
        return wrapper;
    }
}

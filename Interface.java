import javax.swing.*;
import javax.swing.border.Border;

import helper_classes.CustomFontLoader;
import helper_classes.OnClickEventHelper;
import helper_classes.OnFocusEventHelper;
import helper_classes.RoundedBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.*;


public class Interface extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextArea outputArea;
    private JButton goBackButton;
    private Pet currentPet;
    private JLabel ageLabel;
    private JButton petButton;
    private JButton feedButton;
    private JLabel petName;
    private JLabel petBreed;
    private JLabel hungerLabel;
    private JLabel imageLabel;
    private ImageIcon imageIcon;

    public Interface(Pet p) {

     JFrame frame = new JFrame("My Talking Hong");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(504, 271);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#edd5ad"));

     petButton = new JButton("PET");
     petButton.setBounds(370, 190, 106, 29);
     petButton.setBackground(Color.decode("#bca8e4"));
     petButton.setForeground(Color.decode("#000"));
     petButton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     petButton.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     petButton.setFocusPainted(false);
     petButton.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            imageLabel.setIcon(new ImageIcon("Assets/petMattHappy.gif"));
        }
    
        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {
            imageLabel.setIcon(getScaledIcon("Assets/MattHapp.png", 100, 100));
        }
    });
     OnClickEventHelper.setOnClickColor(petButton, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(petButton);
     petButton.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        imageLabel.setIcon(new ImageIcon("Assets/petMattHappy.gif"));
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        imageLabel.setIcon(getScaledIcon("Assets/MattHapp.png", 100, 100));
    }
});

     feedButton = new JButton("FEED");
     feedButton.setBounds(256, 190, 106, 29);
     feedButton.setBackground(Color.decode("#bca8e4"));
     feedButton.setForeground(Color.decode("#000"));
     feedButton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     feedButton.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     feedButton.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(feedButton, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(feedButton);

     petName = new JLabel("");
     petName.setBounds(11, 12, 100, 33);
     petName.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     petName.setBackground(Color.decode("#ffe7bf"));
     petName.setForeground(Color.decode("#73664e"));
     petName.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     panel.add(petName);

     petBreed = new JLabel("");
     petBreed.setBounds(11, 54, 100, 33);
     petBreed.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     petBreed.setBackground(Color.decode("#ffe7bf"));
     petBreed.setForeground(Color.decode("#73664e"));
     petBreed.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     panel.add(petBreed);

     goBackButton = new JButton("BACK");
     goBackButton.setBounds(5, 204, 102, 27);
     goBackButton.setBackground(Color.decode("#bca8e4"));
     goBackButton.setForeground(Color.decode("#000"));
     goBackButton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     goBackButton.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     goBackButton.setFocusPainted(false);
     goBackButton.addActionListener(this);
     OnClickEventHelper.setOnClickColor(goBackButton, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(goBackButton);

     outputArea = new JTextArea("");
     outputArea.setBounds(12, 115, 202, 79);
     outputArea.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     outputArea.setBackground(Color.decode("#ffe7bf"));
     outputArea.setForeground(Color.decode("#73664e"));
     outputArea.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     outputArea.setEditable(false);
     OnFocusEventHelper.setOnFocusText(outputArea, "", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(outputArea);

     ageLabel = new JLabel("");
     ageLabel.setBounds(121, 12, 100, 33);
     ageLabel.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     ageLabel.setBackground(Color.decode("#ffe7bf"));
     ageLabel.setForeground(Color.decode("#73664e"));
     ageLabel.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     panel.add(ageLabel);

     hungerLabel = new JLabel("");
     hungerLabel.setBounds(120, 54, 100, 33);
     hungerLabel.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     hungerLabel.setBackground(Color.decode("#ffe7bf"));
     hungerLabel.setForeground(Color.decode("#73664e"));
     hungerLabel.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     panel.add(hungerLabel);

     
     imageIcon = getScaledIcon("Assets/MattHapp.png", 100, 100);
     imageLabel = new JLabel(imageIcon);
     imageLabel.setBounds(260,-20,200,200);
     panel.add(imageLabel);

     frame.add(panel);
     frame.setVisible(true);
     
     currentPet = new MattHong();
    }

    public static ImageIcon getScaledIcon(String imagePath, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(imagePath);
        Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == goBackButton) {
            outputArea.append(currentPet.feed());
            System.out.println("Process");
        }
        if(e.getSource() == petButton) {
            imageLabel.setIcon(new ImageIcon("Assets/petMattHappy.gif"));
            
        }
    }
}

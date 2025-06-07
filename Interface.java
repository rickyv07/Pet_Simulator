import javax.swing.*;
import javax.swing.border.Border;

import Characters.MattHong;
import Characters.Pet;

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
    private JButton pickHong;
    private JButton pickDog;
    private JButton pickCat;
    private JPanel petPanel;
    private JPanel startPanel;

    public Interface(Pet p) {

     JFrame frame = new JFrame("My Talking Hong");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(504, 271);
     petPanel = new JPanel();
     petPanel.setLayout(null);
     petPanel.setBackground(Color.decode("#edd5ad"));

     startPanel = new JPanel();
     startPanel.setLayout(null);
     startPanel.setBackground(Color.decode("#1e1e1e"));

     JLabel welcomeText = new JLabel("Welcome to PET SIMULATOR!");
     welcomeText.setBounds(49, 35, 440, 86);
     welcomeText.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
     welcomeText.setForeground(Color.decode("#D9D9D9"));
     startPanel.add(welcomeText);

     pickHong = new JButton("Matt Hong");
     pickHong.setBounds(52, 139, 106, 28);
     pickHong.setBackground(Color.decode("#2e2e2e"));
     pickHong.setForeground(Color.decode("#D9D9D9"));
     pickHong.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     pickHong.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     pickHong.setFocusPainted(false);
     pickHong.addActionListener(this);
     OnClickEventHelper.setOnClickColor(pickHong, Color.decode("#232323"), Color.decode("#2e2e2e"));
     startPanel.add(pickHong);

     pickCat = new JButton("Cat");
     pickCat.setBounds(200, 139, 106, 28);
     pickCat.setBackground(Color.decode("#2e2e2e"));
     pickCat.setForeground(Color.decode("#D9D9D9"));
     pickCat.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     pickCat.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     pickCat.setFocusPainted(false);
     pickCat.addActionListener(this);
     OnClickEventHelper.setOnClickColor(pickCat, Color.decode("#232323"), Color.decode("#2e2e2e"));
     startPanel.add(pickCat);

     pickDog = new JButton("Doge");
     pickDog.setBounds(347, 139, 106, 28);
     pickDog.setBackground(Color.decode("#2e2e2e"));
     pickDog.setForeground(Color.decode("#D9D9D9"));
     pickDog.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     pickDog.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     pickDog.setFocusPainted(false);
     pickDog.addActionListener(this);
     OnClickEventHelper.setOnClickColor(pickDog, Color.decode("#232323"), Color.decode("#2e2e2e"));
     startPanel.add(pickDog);

     frame.add(startPanel);
     frame.setVisible(true);

     // Pet Button
     petButton = new JButton("PET");
     petButton.setBounds(370, 190, 106, 29);
     petButton.setBackground(Color.decode("#bca8e4"));
     petButton.setForeground(Color.decode("#000"));
     petButton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     petButton.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     petButton.setFocusPainted(false);
     // Click events
     petButton.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            String mood = ((MattHong) currentPet).getState();
            imageLabel.setIcon(new ImageIcon("Assets/pet"+mood+".gif"));
        }
    
        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {
            String mood = ((MattHong) currentPet).getState();
            imageLabel.setIcon(getScaledIcon("Assets/"+mood+".png", 100, 100));
        }
    });
     OnClickEventHelper.setOnClickColor(petButton, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     petPanel.add(petButton);
     petButton.addMouseListener(new java.awt.event.MouseAdapter() {
     });
     // Feed Button
     feedButton = new JButton("FEED");
     feedButton.setBounds(256, 190, 106, 29);
     feedButton.setBackground(Color.decode("#bca8e4"));
     feedButton.setForeground(Color.decode("#000"));
     feedButton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     feedButton.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     feedButton.setFocusPainted(false);
     feedButton.addActionListener(this);
     OnClickEventHelper.setOnClickColor(feedButton, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     petPanel.add(feedButton);
     
     // Pet Name Label
     petName = new JLabel("");
     petName.setBounds(11, 12, 100, 33);
     petName.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     petName.setBackground(Color.decode("#ffe7bf"));
     petName.setForeground(Color.decode("#73664e"));
     petName.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     petPanel.add(petName);
     
     // Pet Breed Label
     petBreed = new JLabel("");
     petBreed.setBounds(11, 54, 100, 33);
     petBreed.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     petBreed.setBackground(Color.decode("#ffe7bf"));
     petBreed.setForeground(Color.decode("#73664e"));
     petBreed.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     petPanel.add(petBreed);

     // Back to Menu Button
     goBackButton = new JButton("BACK");
     goBackButton.setBounds(5, 204, 102, 27);
     goBackButton.setBackground(Color.decode("#bca8e4"));
     goBackButton.setForeground(Color.decode("#000"));
     goBackButton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     goBackButton.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     goBackButton.setFocusPainted(false);
     goBackButton.addActionListener(this);
     OnClickEventHelper.setOnClickColor(goBackButton, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     petPanel.add(goBackButton);

     // Output Area
     outputArea = new JTextArea("");
     outputArea.setBounds(12, 115, 202, 79);
     outputArea.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     outputArea.setBackground(Color.decode("#ffe7bf"));
     outputArea.setForeground(Color.decode("#73664e"));
     outputArea.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     outputArea.setEditable(false);
     OnFocusEventHelper.setOnFocusText(outputArea, "", Color.decode("#000"),   Color.decode("#73664e"));
     petPanel.add(outputArea);

     // Pet Age Label
     ageLabel = new JLabel("");
     ageLabel.setBounds(121, 12, 100, 33);
     ageLabel.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     ageLabel.setBackground(Color.decode("#ffe7bf"));
     ageLabel.setForeground(Color.decode("#73664e"));
     ageLabel.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     petPanel.add(ageLabel);
     
     // Pet Hunger Label
     hungerLabel = new JLabel("");
     hungerLabel.setBounds(120, 54, 100, 33);
     hungerLabel.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     hungerLabel.setBackground(Color.decode("#ffe7bf"));
     hungerLabel.setForeground(Color.decode("#73664e"));
     hungerLabel.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     petPanel.add(hungerLabel);

     // Pet Image
     imageIcon = getScaledIcon("Assets/pet"+currentPet, 100, 100);
     imageLabel = new JLabel(imageIcon);
     imageLabel.setBounds(260,-20,200,200);
     petPanel.add(imageLabel);

     frame.add(petPanel);
     petPanel.setVisible(false);
     
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

        if(e.getSource() == pickHong){
            currentPet = new MattHong();
            imageLabel.setIcon(getScaledIcon("Assets/MattHappy.png", 100, 100));
            petPanel.setVisible(true);
            startPanel.setVisible(false);
        }
    }
}

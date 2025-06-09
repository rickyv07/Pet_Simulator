
import GUIBuilder.helper_classes.CustomFontLoader;
import GUIBuilder.helper_classes.OnClickEventHelper;
import GUIBuilder.helper_classes.OnFocusEventHelper;
import GUIBuilder.helper_classes.RoundedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Interface extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextArea outputArea;
    private JButton goBackButton;
    private Pet currentPet;
    private JLabel happinessLabel;
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
    private Cat cat;
    private Dog dog;
    private MattHong mattHong;

    public Interface() {

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
            String mood = currentPet.getState();
            imageLabel.setIcon(new ImageIcon("Assets/pet"+mood+".gif"));
        }
    
        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {
            String mood = currentPet.getState();
            if(currentPet.getClass() == Cat.class) {
                System.out.println("Cat mood: " + mood);
                imageLabel.setIcon(getScaledIcon("Assets/"+mood+".gif", 100, 100));
            }
            else {
                imageLabel.setIcon(getScaledIcon("Assets/"+mood+".png", 100, 100));
            }
            
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
     petName = new JLabel("Name: ");
     petName.setBounds(11, 12, 100, 33);
     petName.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     petName.setBackground(Color.decode("#ffe7bf"));
     petName.setForeground(Color.decode("#73664e"));
     petName.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     petPanel.add(petName);
     
     // Pet Breed Label
     petBreed = new JLabel("Breed: ");
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
    outputArea.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
    outputArea.setBackground(Color.decode("#ffe7bf"));
    outputArea.setForeground(Color.decode("#73664e"));
    outputArea.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
    outputArea.setEditable(false);
    OnFocusEventHelper.setOnFocusText(outputArea, "", Color.decode("#000"), Color.decode("#73664e"));

    JScrollPane scrollPane = new JScrollPane(outputArea);
    scrollPane.setBounds(12, 115, 202, 79);
    scrollPane.setBorder(null); // optional: removes default border
    petPanel.add(scrollPane);

     // Happiness Label
     happinessLabel = new JLabel("Happiness: 100");
     happinessLabel.setBounds(121, 12, 100, 33);
     happinessLabel.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     happinessLabel.setBackground(Color.decode("#ffe7bf"));
     happinessLabel.setForeground(Color.decode("#73664e"));
     happinessLabel.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     petPanel.add(happinessLabel);
     
     // Pet Hunger Label
     hungerLabel = new JLabel("Hunger: 0");
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
     
    }

    public void updatePetInfo() {
        if (currentPet != null) {
            petName.setText("Name: " + currentPet.getName());
            petBreed.setText("Breed: " + currentPet.getClass().getSimpleName());
            happinessLabel.setText("Happiness: " + currentPet.getHappiness());
            hungerLabel.setText("Hunger: " + currentPet.getHunger());
            
        }
    }

    public static ImageIcon getScaledIcon(String imagePath, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(imagePath);
        Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == feedButton) {
            outputArea.append(currentPet.feed());
        }
        if(e.getSource() == petButton) {
            imageLabel.setIcon(new ImageIcon("Assets/pet"+currentPet.getMood()+".gif"));
            
        }
        if (e.getSource() == goBackButton) {
            petPanel.setVisible(false);
            startPanel.setVisible(true);
        }
        if(e.getSource() == pickHong){
            System.out.println("You picked Matt Hong!");
            mattHong = new MattHong();
            currentPet = mattHong;
            currentPet.setInterface(this);
            imageLabel.setIcon(getScaledIcon("Assets/MattHappy.png", 100, 100));
            petPanel.setVisible(true);
            startPanel.setVisible(false);
        }
        if(e.getSource() == pickCat){

            cat = new Cat();
            currentPet = cat;
            currentPet.setInterface(this);
            imageLabel.setIcon(new ImageIcon("Assets/CatHappy.gif"));
            petPanel.setVisible(true);
            startPanel.setVisible(false);
        }
      
    }
}

import javax.swing.*;
import java.awt.Color;
import helper_classes.*;

public class WindowBuilder {
  public static void main(String[] args) {

     JFrame frame = new JFrame("My Awesome Window");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(502, 272);
     JLabel startPanel = new JLabel();
     startPanel.setLayout(null);
     startPanel.setBackground(Color.decode("#1e1e1e"));

     JLabel welcomeText = new JLabel("Welcome to PET SIMULATOR!");
     welcomeText.setBounds(49, 35, 440, 86);
     welcomeText.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
     welcomeText.setForeground(Color.decode("#D9D9D9"));
     startPanel.add(welcomeText);

     JButton pickHong = new JButton("Matt Hong");
     pickHong.setBounds(52, 139, 106, 28);
     pickHong.setBackground(Color.decode("#2e2e2e"));
     pickHong.setForeground(Color.decode("#D9D9D9"));
     pickHong.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     pickHong.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     pickHong.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(pickHong, Color.decode("#232323"), Color.decode("#2e2e2e"));
     startPanel.add(pickHong);

     JButton pickCat = new JButton("Cat");
     pickCat.setBounds(200, 139, 106, 28);
     pickCat.setBackground(Color.decode("#2e2e2e"));
     pickCat.setForeground(Color.decode("#D9D9D9"));
     pickCat.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     pickCat.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     pickCat.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(pickCat, Color.decode("#232323"), Color.decode("#2e2e2e"));
     startPanel.add(pickCat);

     JButton pickDog = new JButton("Doge");
     pickDog.setBounds(347, 139, 106, 28);
     pickDog.setBackground(Color.decode("#2e2e2e"));
     pickDog.setForeground(Color.decode("#D9D9D9"));
     pickDog.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     pickDog.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     pickDog.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(pickDog, Color.decode("#232323"), Color.decode("#2e2e2e"));
     startPanel.add(pickDog);

     frame.add(startPanel);
     frame.setVisible(true);

  }
}
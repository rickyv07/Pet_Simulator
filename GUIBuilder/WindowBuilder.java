import javax.swing.*;
import java.awt.Color;

public class WindowBuilder {
  public static void main(String[] args) {

     JFrame frame = new JFrame("My Awesome Window");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(504, 271);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#f4c064"));

     JButton petButton = new JButton("PET");
     petButton.setBounds(370, 192, 106, 28);
     petButton.setBackground(Color.decode("#bca8e4"));
     petButton.setForeground(Color.decode("#000"));
     petButton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     petButton.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     petButton.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(petButton, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(petButton);

     JButton feedButton = new JButton("FEED");
     feedButton.setBounds(256, 190, 106, 29);
     feedButton.setBackground(Color.decode("#bca8e4"));
     feedButton.setForeground(Color.decode("#000"));
     feedButton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     feedButton.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     feedButton.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(feedButton, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(feedButton);

     JTextArea petName = new JTextArea("");
     petName.setBounds(11, 12, 100, 33);
     petName.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     petName.setBackground(Color.decode("#ffe7bf"));
     petName.setForeground(Color.decode("#73664e"));
     petName.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(petName, "Your long Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(petName);

     JTextArea petBreed = new JTextArea("");
     petBreed.setBounds(11, 59, 100, 33);
     petBreed.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     petBreed.setBackground(Color.decode("#ffe7bf"));
     petBreed.setForeground(Color.decode("#73664e"));
     petBreed.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(petBreed, "Your long Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(petBreed);

     JButton goBackButton = new JButton("BACK");
     goBackButton.setBounds(5, 204, 102, 27);
     goBackButton.setBackground(Color.decode("#bca8e4"));
     goBackButton.setForeground(Color.decode("#000"));
     goBackButton.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     goBackButton.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     goBackButton.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(goBackButton, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     panel.add(goBackButton);

     JTextArea outputArea = new JTextArea("");
     outputArea.setBounds(12, 115, 202, 79);
     outputArea.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     outputArea.setBackground(Color.decode("#ffe7bf"));
     outputArea.setForeground(Color.decode("#73664e"));
     outputArea.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(outputArea, "Your long Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(outputArea);

     JTextArea element7 = new JTextArea("");
     element7.setBounds(121, 12, 100, 33);
     element7.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element7.setBackground(Color.decode("#ffe7bf"));
     element7.setForeground(Color.decode("#73664e"));
     element7.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element7, "Your long Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element7);

     JTextArea element8 = new JTextArea("");
     element8.setBounds(120, 54, 100, 33);
     element8.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     element8.setBackground(Color.decode("#ffe7bf"));
     element8.setForeground(Color.decode("#73664e"));
     element8.setBorder(new RoundedBorder(2, Color.decode("#000"), 1));
     OnFocusEventHelper.setOnFocusText(element8, "Your long Input!", Color.decode("#000"),   Color.decode("#73664e"));
     panel.add(element8);

     frame.add(panel);
     frame.setVisible(true);

  }
}
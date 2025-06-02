import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.*;


public class Interface extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextArea outputArea;
    private JButton processButton;
    private Pet currentPet;


    public Interface(Pet p) {
        setTitle("Pet Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());
        currentPet = p;

        



        // Output Panel
        outputArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        outputArea.setEditable(false);
        
        JPanel gifPanel = new JPanel();
        ImageIcon icon = new ImageIcon("cat.jpg");
        JLabel gifLabel = new JLabel();
        gifLabel.setIcon(icon);
        gifPanel.add(gifLabel);
        
        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        processButton = new JButton("Feed");
        processButton.addActionListener(this);
        buttonPanel.add(processButton);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        
        centerPanel.add(gifLabel);
        centerPanel.add(scrollPane);
        
        // Add panels to frame
        add(buttonPanel, BorderLayout.SOUTH);
        add(centerPanel);
        setVisible(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == processButton) {
            outputArea.append(currentPet.feed());
        }
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.*;

public class Interface extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextArea outputArea;
    private JButton processButton;

    public Interface() {
        setTitle("Pet Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        // Input Panel
        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel inputLabel = new JLabel("Enter text:");
        inputField = new JTextField(20);
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);

        

        // Output Panel
        outputArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        outputArea.setEditable(false);
        
        JPanel gifPanel = new JPanel(new FlowLayout());
        ImageIcon icon = new ImageIcon("OriginalNyan.gif"); 
        JLabel imageLabel = new JLabel(icon);
        gifPanel.add(imageLabel, BorderLayout.CENTER);
        
        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        processButton = new JButton("Feed");
        processButton.addActionListener(this);
        buttonPanel.add(processButton);

        // Add panels to frame
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == processButton) {
            String inputText = inputField.getText();
            outputArea.append(inputText + "\n");
            inputField.setText(""); // Clear input field after processing
        }
    }
}

package week3;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    
    public class lab3B extends JFrame {
        private JTextField carField;
        private JTextField colorField;
        private JTextField ownerField;
        private JTextField amountField;
    
        public lab3B() {
            setTitle("Car Details Form");
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(5, 2));
    
            JLabel carLabel = new JLabel("Car:");
            panel.add(carLabel);
            carField = new JTextField();
            panel.add(carField);
    
            JLabel colorLabel = new JLabel("Color:");
            panel.add(colorLabel);
            colorField = new JTextField();
            panel.add(colorField);
    
            JLabel ownerLabel = new JLabel("Owner:");
            panel.add(ownerLabel);
            ownerField = new JTextField();
            panel.add(ownerField);
    
            JLabel amountLabel = new JLabel("Amount:");
            panel.add(amountLabel);
            amountField = new JTextField();
            panel.add(amountField);
    
            JButton enterButton = new JButton("Enter");
            enterButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String car = carField.getText();
                    
    
                    String message = "Car: " + car;
                    JOptionPane.showMessageDialog(lab3B.this, message);
                }
            });
            panel.add(enterButton);
    
            JButton exitButton = new JButton("Exit");
            exitButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });
            panel.add(exitButton);
    
            add(panel);
    
            setVisible(true);
        }
    
        public static void main(String[] args) {
            new lab3B();
        }
    }
    

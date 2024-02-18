package week3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab3A extends JFrame{
  
        private JTextField studentNumberField;
        private JTextField markField;
    
        public lab3A() {
            setTitle("Student Form");
            setSize(300, 150);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3, 2));
    
            JLabel studentNumberLabel = new JLabel("Student Number:");
            panel.add(studentNumberLabel);
    
            studentNumberField = new JTextField();
            panel.add(studentNumberField);
    
            JLabel markLabel = new JLabel("Mark:");
            panel.add(markLabel);
    
            markField = new JTextField();
            panel.add(markField);
    
            JButton okButton = new JButton("OK");
            okButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String studentNumber = studentNumberField.getText();
                    String mark = markField.getText();
                    JOptionPane.showMessageDialog(lab3A.this, "Student Number: " + studentNumber + "\nMark: " + mark);
                }
            });
            panel.add(okButton);
    
            JButton cancelButton = new JButton("Cancel");
            cancelButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });
            panel.add(cancelButton);
    
            add(panel);
    
            setVisible(true);
        }
    
        public static void main(String[] args) {
            new lab3A();
        }
    
}

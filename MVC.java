package mvc;
import java.awt.*;
import javax.swing.*;

public class MVC extends JFrame{
    public void MVC(){
        JLabel labelFirst, labelLast, labelMatric, labelPhone, labelDepart, labelLevel, labelGender;
        JTextField fieldFirst, fieldLast, fieldMatric = null, fieldPhone = null, fieldDepart = null, fieldLevel = null, fieldGender;
        JButton registerButton, exitButton;       
        JRadioButton male = null, female = null;
        
        setTitle("REGISTRATION FORM");
        JPanel JP = new JPanel();
        JP.setLayout(new GridLayout(0,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        setVisible(true);
        setSize(700,500);
        labelFirst = new JLabel("First Name");
        labelFirst.setBounds(30,50,60,30);
        
        labelLast = new JLabel("Last Name");
        labelLast.setBounds(30,50,60,30);
        
        labelMatric = new JLabel("Matric Number");
        labelMatric.setBounds(30,50,60,30);
        
        labelLevel = new JLabel("Level");
        labelLevel.setBounds(30,50,60,30);
        
        labelDepart = new JLabel("Department");
        labelDepart.setBounds(30,50,60,30);
        
        labelGender = new JLabel("Gender");
        labelGender.setBounds(30,50,60,30);
        
        labelPhone = new JLabel("Phone Number");
        labelPhone.setBounds(30,50,60,30);
        
        fieldFirst = new JTextField();
        fieldFirst.setBounds(95, 60, 100, 30);
        
        fieldLast = new JTextField();
        fieldLast.setBounds(95, 50, 100, 30);
        
        male = new JRadioButton("Male");
        male.setBounds(95, 120, 60, 30);
        
        female = new JRadioButton("Female");
        female.setBounds(155, 120, 70, 30);
        
        exitButton = new JButton("Exit"); 
        exitButton.setBounds(25, 230, 80, 30);

        registerButton = new JButton("Register");
        registerButton.setBounds(110, 230, 100, 30);
        
        
        JP.add(labelFirst); JP.add(labelLast); JP.add(labelMatric); JP.add(labelLevel); 
        JP.add(labelDepart); JP.add(labelGender); JP.add(labelPhone);
        
        JP.add(fieldFirst); JP.add(fieldLast); JP.add(labelMatric); JP.add(fieldLevel); JP.add(fieldDepart); 
        JP.add(male); JP.add(female); JP.add(fieldPhone);  JP.add(exitButton); JP.add(registerButton);
        
        JP.setBounds(250,10, 400, 300);
        add(JP);
        
        
        
    }
    public static void main(String[] args) {
        MVC mvc = new MVC();
        mvc.MVC();
                
        
    }

    
}

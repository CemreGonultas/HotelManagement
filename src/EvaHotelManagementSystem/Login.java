
package EvaHotelManagementSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import java.sql.ResultSet;

/**
 *
 * @author asus
 */
public class Login extends JFrame implements ActionListener{
    
    JTextField textField1;
    JPasswordField passwordField1;
    JButton b1,b2;
    
    
    Login(){
        JLabel label1 = new JLabel("Username");
        label1.setBounds(40,50,100,30);
        label1.setFont(new Font("Tahoma",Font.BOLD,16));
        label1.setForeground(Color.BLACK);
        add(label1);

        JLabel label2 = new JLabel("Password");
        label2.setBounds(40,100,100,30);
        label2.setFont(new Font("Tahoma",Font.BOLD,16));
        label2.setForeground(Color.BLACK);
        add(label2);

        textField1 = new JTextField();
        textField1.setBounds(150,50,150,30);
        textField1.setForeground(Color.WHITE);
        textField1.setFont(new Font("Tahoma", Font.PLAIN,15));
        textField1.setBackground(new Color(100,133,147,255));
        add(textField1);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(150,100,150,30);
        passwordField1.setForeground(Color.WHITE);
        passwordField1.setBackground(new Color(100,133,147,255));
        add(passwordField1);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(255,300,Image.SCALE_DEFAULT);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(318,-20,255,300);
        add(label);

        b1 = new JButton("Login");
        b1.setBounds(40,160,120,30);
        b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180,160,120,30);
        b2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);


        getContentPane().setBackground(new Color(100,133,147,255));
        setLayout(null);
        setLocation(510,270);
        setSize(600,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            try{
                Database c = new Database();
                String user = textField1.getText();
                String pass = new String(passwordField1.getPassword());
                
                String q = "select * from login where username = '"+user+"'and password = '"+pass+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if(resultSet.next()){
                    new Dashboard();
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid");
                }
            }catch(Exception E){
                E.printStackTrace();
            }
        }else{
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
    
}

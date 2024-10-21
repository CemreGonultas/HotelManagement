
package EvaHotelManagementSystem;

import java.awt.*;
import java.awt.event.*;
import java.beans.Customizer;
import javax.swing.*;

public class Reception extends JFrame {
    Reception(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1238,820);
        panel.setBackground(new Color(100,133,147,255));
        add(panel);
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,820);
        panel1.setBackground(new Color(100,133,147,255));
        add(panel1);
        
        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/CT.gif"));
        Image i22 = i111.getImage().getScaledInstance(1152,648, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon111);
        label11.setBounds(100,5,1152,648);
        panel.add(label11);
        
        JButton btnNCF = new JButton("New Customer Form");
        btnNCF.setLayout(null);
        btnNCF.setBounds(30,30,200,30);
        btnNCF.setBackground(Color.BLACK);
        btnNCF.setForeground(Color.WHITE);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    new NewCustomer();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnRoom = new JButton("Room");
        btnRoom.setLayout(null);
        btnRoom.setBounds(30,70,200,30);
        btnRoom.setBackground(Color.BLACK);
        btnRoom.setForeground(Color.WHITE);
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    new Room();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnDepartment = new JButton("Department");
        btnDepartment.setLayout(null);
        btnDepartment.setBounds(30,110,200,30);
        btnDepartment.setBackground(Color.BLACK);
        btnDepartment.setForeground(Color.WHITE);
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    new Department();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setLayout(null);
        btnAEI.setBounds(30,150,200,30);
        btnAEI.setBackground(Color.BLACK);
        btnAEI.setForeground(Color.WHITE);
        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    new Employee();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnCI = new JButton("Customer Info");
        btnCI.setLayout(null);
        btnCI.setBounds(30,190,200,30);
        btnCI.setBackground(Color.BLACK);
        btnCI.setForeground(Color.WHITE);
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    new CustomerInfo();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnMI = new JButton("Manager Info");
        btnMI.setLayout(null);
        btnMI.setBounds(30,230,200,30);
        btnMI.setBackground(Color.BLACK);
        btnMI.setForeground(Color.WHITE);
        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    new ManagerInfo();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnCO = new JButton("Check Out");
        btnCO.setLayout(null);
        btnCO.setBounds(30,270,200,30);
        btnCO.setBackground(Color.BLACK);
        btnCO.setForeground(Color.WHITE);
        panel1.add(btnCO);
        btnCO.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    new CheckOut();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnUC = new JButton("Update Check-In Details");
        btnUC.setLayout(null);
        btnUC.setBounds(30,310,200,30);
        btnUC.setBackground(Color.BLACK);
        btnUC.setForeground(Color.WHITE);
        panel1.add(btnUC);
        btnUC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    new UpdateCheck();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnURS = new JButton("Update Room Status");
        btnURS.setLayout(null);
        btnURS.setBounds(30,350,200,30);
        btnURS.setBackground(Color.BLACK);
        btnURS.setForeground(Color.WHITE);
        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    new UpdateRoom();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnPUS = new JButton("Pick Up Service");
        btnPUS.setLayout(null);
        btnPUS.setBounds(30,390,200,30);
        btnPUS.setBackground(Color.BLACK);
        btnPUS.setForeground(Color.WHITE);
        panel1.add(btnPUS);
        btnPUS.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    new PickUp();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        
        JButton btnSR = new JButton("Search Room");
        btnSR.setLayout(null);
        btnSR.setBounds(30,430,200,30);
        btnSR.setBackground(Color.BLACK);
        btnSR.setForeground(Color.WHITE);
        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    new SearchRoom();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        
        JButton logout = new JButton("Logout");
        logout.setBounds(30,470,95,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        panel1.add(logout);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                  System.exit(0);
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(140,470,95,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                   setVisible(false);
                   new Dashboard();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        
        
    
        
      
        
        
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }
    public static void main(String[] args){
            new Reception();
    }
}

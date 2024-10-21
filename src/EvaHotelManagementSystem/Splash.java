
package EvaHotelManagementSystem;

import javax.swing.*;


public class Splash extends JFrame{
    
     Splash(){
         ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/evaOtel.gif"));
         JLabel label = new JLabel(imageIcon);
         label.setBounds(0,0,1152,648);
         add(label);
         
        
        setLayout(null);
        setLocation(200,80);
        setSize(1152,648);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
         try{
             
             Thread.sleep(5000);
             new Login();
             setVisible(false);
         }catch(Exception e){
             e.printStackTrace();
         }
    }
    
    public static void main(String[] args){
        
        new Splash();
        
    }
    
}

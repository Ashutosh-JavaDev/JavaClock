import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
// import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
public class Clock extends JFrame implements ActionListener {

    Font font=new Font("Roboto",Font.BOLD,18);
    JPanel panel;
    public Clock(){
        setTitle("Digital Clock");
        setLayout(null);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(250,200);
        ClockFunction();
        setVisible(true);
    }
    public void ClockFunction() {
        panel=new JPanel();
        panel.setBounds(10,10,480,480);
        panel.setBackground(Color.red);
        add(panel);
    }
    public static void main(String[] args) throws Exception {
        new Clock();        
    }
    @Override
    public void actionPerformed(ActionEvent ae){

    }
}

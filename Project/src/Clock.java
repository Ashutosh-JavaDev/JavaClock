import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.Font;
public class Clock extends JFrame implements ActionListener {
    public Clock(){
        setTitle("Digital Clock");
        setLayout(null);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(250,200);
        ClockFunction();
        setVisible(true);
    }
    public void ClockFunction(){

    }
    public static void main(String[] args) throws Exception {
        new Clock();        
    }
    @Override
    public void actionPerformed(ActionEvent ae){

    }
}

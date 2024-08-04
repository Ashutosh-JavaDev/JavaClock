import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
public class Clock extends JFrame implements ActionListener {
    JLabel[]label=new JLabel[12];
    Font font=new Font("Roboto",Font.BOLD,18);
    JPanel panel;
    public Clock(){
        setTitle("Digital Clock");
        setLayout(null);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(250,200);
        createPanel();
        setVisible(true);
    }
    public void createPanel() {
        panel=new JPanel();
        panel.setBounds(10,10,480,480);
        panel.setBackground(Color.red);
        add(panel);
        for(int i=0;i<12;i++){
            label[i]=new JLabel(String.valueOf(i));
            label[i].setFont(font);
        }
    }
    public static void main(String[] args) throws Exception {
        new Clock();        
    }
    @Override
    public void actionPerformed(ActionEvent ae){

    }
}

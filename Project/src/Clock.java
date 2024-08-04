import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
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
        panel.setLayout(new GridLayout(5,3,50,50));
        add(panel);
     
        for (int i = 0; i < 12; i++) {
            label[i] = new JLabel(String.valueOf(i));
            label[i].setFont(font);
            label[i].setForeground(Color.white);
            label[i].setFocusable(false);
        }

        // Adding labels to the panel in a specific order to represent a clock face
        panel.add(label[11]);
        panel.add(new JLabel("")); // Empty space
        panel.add(label[1]);
        panel.add(label[10]);
        panel.add(new JLabel("")); // Empty space
        panel.add(label[2]);
        panel.add(label[9]);
        panel.add(new JLabel("")); // Empty space
        panel.add(label[3]);
        panel.add(label[8]);
        panel.add(new JLabel(""));
        panel.add(label[4]);
        panel.add(label[7]);
        panel.add(label[6]); // Empty space
        panel.add(label[5]);
    }
    public static void main(String[] args) throws Exception {
        new Clock();        
    }
    @Override
    public void actionPerformed(ActionEvent ae){

    }
}

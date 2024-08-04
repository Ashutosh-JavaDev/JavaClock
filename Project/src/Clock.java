// import javax.swing.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.GridLayout;
// import java.awt.Font;
// public class Clock extends JFrame implements ActionListener {
//     public Clock(){

//     }
//     public static void main(String[] args) throws Exception {
//         new Clock();        
//     }
//     @Override
//     public void actionPerformed(ActionEvent ae){

//     }
// }
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;

public class Clock extends JFrame {
    
    public Clock() {
        setTitle("Draw a Circle");
        setSize(400, 400); // Set the size of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add the custom drawing panel to the frame
        add(new CirclePanel());
        
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new Clock();
    }
}

class CirclePanel extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Get the width and height of the panel
        int width = getWidth();
        int height = getHeight();
        
        // Calculate the diameter of the circle
        int diameter = Math.min(width, height) - 50; // 50 is the padding
        
        // Calculate the top-left corner of the circle
        int x = (width - diameter) / 2;
        int y = (height - diameter) / 2;
        
        // Draw the circle
        g.drawOval(x, y, diameter, diameter);
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }
}


package day10_gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Day10_GUI {

    
    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable(){
                @Override
                public void run(){
                    JFrame frame = new JFrame();
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.getContentPane().add(new Panelis());
                    frame.pack();
                    frame.setVisible(true);
                }
            });
    }
    
}

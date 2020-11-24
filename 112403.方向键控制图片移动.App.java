import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_background = new JLabel();
    JLabel label_img = new JLabel();
    JFrame frame = new JFrame("TestGUI");

    int x=100,y=100;

    //构造方法
    public App() {
        myPanel.setLayout(null);
        label_img.setBounds(x,y,200,200);
        label_img.setIcon(new ImageIcon("src/plane0.png"));
        myPanel.add(label_img);
        label_background.setBounds(0,0,512,720);
        label_background.setIcon(new ImageIcon("src/background.png"));
        myPanel.add(label_background);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                myPanel.setLayout(null);
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    y=y-20;
                    label_img.setBounds(x,y,128,128);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    y=y+20;
                    label_img.setBounds(x,y,128,128);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    x=x+20;
                    label_img.setBounds(x,y,128,128);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    x=x-20;
                    label_img.setBounds(x,y,128,128);
                }

            }
        });
    }
    //显示窗体方法
    void go(){
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}

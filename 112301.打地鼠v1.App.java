package pac;

import com.sun.glass.ui.Size;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
public class App {
    private JPanel myPanel=new JPanel();
    private JLabel label_img=new JLabel();
    private JLabel label_background=new JLabel();
    private JLabel label_score=new JLabel();
    private Random random = new Random();
    int i = 0;


    public App() {
        label_img.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//              label_img.setBounds(100,100,79,77);固定位置
                //label_img.setBounds((int)(Math.random()*10%10*50),(int)(Math.random()*10%10*50),60,60);
                int ran = random.nextInt(9);//随机生成一个0~9（不包括9）的随机数
                //ImageIcon imageMouse = new ImageIcon( "mouse1.gif");//保证每次随机生成的地鼠图片都是为没被打时的图片
                //label_img.setIcon(imageMouse);
                switch (ran) {
                    case 0:
                        label_img.setBounds(205, 40,60,60);
                        break;
                    case 1:
                        label_img.setBounds(360, 40,60,60);
                        break;
                    case 2:
                        label_img.setBounds(520, 40,60,60);
                        break;
                    case 3:
                        label_img.setBounds(170, 165,60,60);
                        break;
                    case 4:
                        label_img.setBounds(360, 165,60,60);
                        break;
                    case 5:
                        label_img.setBounds(550, 165,60,60);
                        break;
                    case 6:
                        label_img.setBounds(150, 280,60,60);
                        break;
                    case 7:
                        label_img.setBounds(340, 280,60,60);
                        break;
                    case 8:
                        label_img.setBounds(570, 280,60,60);
                        break;
                }
                i++;
                label_score.setText("SCORE:"+String.valueOf(i));
            }

        });
    }


    void go(){
        /*背景*/
        /*label_background.setIcon(new ImageIcon("images/background.jpg"));*/
        //打包引用资源图片
        java.net.URL imgURL1 = App.class.getResource("background1.png");
        label_background.setIcon(new ImageIcon(imgURL1));
        //引用结束
        label_background.setBounds(0,0,798,439);

        /*地鼠图片*/
        //label_img.setIcon(new ImageIcon("mouse1.gif"));
        java.net.URL imgURL2 = App.class.getResource("mouse1.gif");
        label_img.setIcon(new ImageIcon(imgURL2));
        //label_img.setBounds(100,100,60,60);
        label_img.setBounds(205, 40,60,60);

        /*分数*/
        label_score.setForeground(Color.black);
        label_score.setFont(new Font("Arial",Font.PLAIN,25));
        label_score.setText("SCORE:0");
        label_score.setBounds(0,0,200,200);

        /*布局层次*/
        myPanel.add(label_img);
        myPanel.add(label_score);
        myPanel.add(label_background);

        /*初始化，布局为空*/
        myPanel.setLayout(null);

        JFrame frame = new JFrame("打地鼠");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,798,439);
        //frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        /*App app = new App();
        app.go();*/
        new App().go();
    }
}

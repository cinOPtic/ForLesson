import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Main {
    static double d=0;
    static double n=1;
    static double h=10;
    static double k=1;
    static double s=0.1;
    static double y=0;
    static double[] i = {0};

    static JFrame jFrame=new JFrame();
    static JPanel jPanel=new JPanel();

    public static void main(String[] args) {
JComponent jComponent=new MyComponent();

        jFrame=getFrame();
        jFrame.add(jComponent);
        JButton jButton=new JButton("Усилить нажатие ");
        jButton.setFont(new Font("Arial", Font.BOLD,50));
        jButton.setPreferredSize(new Dimension(700,200));
        jPanel.setBorder(BorderFactory.createEmptyBorder(200,0,0,0));



        jFrame.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
d+=n;
        i[0]=d;

if(i[0]>=Math.pow(h,k)) {
    jFrame.add(jPanel);
    k++;
    jPanel.add(jButton);
}
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                n+=s;

d-=Math.pow(h,k-1)/10;

                jPanel.revalidate();
                jPanel.remove(jButton);
                jFrame.setVisible(true);

            }
        });
        jPanel.revalidate();
jComponent.repaint();
        jFrame.setVisible(true);
    }
});


        jFrame.setVisible(true);
    }
    static class MyComponent extends JComponent{


        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Arial", Font.BOLD, 20);
            Graphics2D g2 = (Graphics2D)g;
            g2.setFont(font);
                i[0]=d;
            g2.drawString("Число кликов " + i[0]++,50,50);


        }
    }
    static JFrame getFrame(){
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1920,1080);
        jFrame.setLocation(-10,0);
        return jFrame;


    }

}

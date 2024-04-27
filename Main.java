import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ATM");
        Dimension frameSize = new Dimension(1000,1000);
        frame.setSize(frameSize);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0,350,1000,1000);

        JButton b1,b2;
        b1=new JButton("English");
        b1.setBounds(0,350,300,80);
        panel1.add(b1);

        JLabel l1;
        l1=new JLabel(" Choose Language زبان خود را انتخاب کنید ");
        l1.setBounds(400,400, 400,50);
        panel1.add(l1);

        b2=new JButton("فارسی");
        b2.setBounds(0,350,300,80);
        panel1.add(b2);
        frame.add(panel1);

        JPanel panel2=new JPanel();
        panel2.setBounds(0,350,1000,1000);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel1);
                frame.add(panel2);
                frame.revalidate();
                frame.repaint();
            }
        });


        JLabel l2;
        l2=new JLabel(" : رمز خود را وارد کنید");
        l2.setBounds(400,300, 400,50);
        panel2.add(l2);

        final JTextField tf1=new JTextField();
        tf1.setPreferredSize(new Dimension(200,30));
        JButton b3=new JButton("ثبت");
        b3.setBounds(350,550,95,30);
        JPanel panel3= new JPanel();
        panel3.setBounds(0,350,1000,1000);
        panel2.add(tf1);
        panel2.add(b3);

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("              ");
                frame.remove(panel2);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();
            }
        });
        JButton b4,b5,b6,b7,b13;
        b4 = new JButton("برداشت وجه");
        b4.setBounds(0,350,300,80);
        b5 = new JButton("کارت به کارت");
        b5.setBounds(0,350,300,80);
        b6 = new JButton("تغییر رمز");
        b6.setBounds(500,350,300,80);
        b7 = new JButton("اعلام موجودی");
        b7.setBounds(500,350,300,80);
        b13 = new JButton("لغو");
        b13.setBounds(500,350,300,80);
        panel3.add(b4);
        panel3.add(b5);
        panel3.add(b6);
        panel3.add(b7);
        panel3.add(b13);

        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                frame.add(panel1);
                frame.revalidate();
                frame.repaint();
            }
        });

        JPanel panel4 = new JPanel();
        panel4.setBounds(0,350,1000,1000);

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                frame.add(panel4);
                frame.revalidate();
                frame.repaint();
            }
        });
        JLabel l3;
        l3=new JLabel(" : مبلغ مورد نظر خود را وارد کنید ");
        l3.setBounds(400,300, 400,50);
        panel4.add(l3);

        final JTextField tf2=new JTextField();
        tf2.setPreferredSize(new Dimension(200,30));
        JButton b8=new JButton("تایید");
        b8.setBounds(350,550,95,30);
        JButton b14=new JButton("برگشت");
        b14.setBounds(350,550,95,30);
        JPanel panel5= new JPanel();
        panel5.setBounds(0,350,1000,1000);
        panel4.add(tf2);
        panel4.add(b8);
        panel4.add(b14);

        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("              ");
                frame.remove(panel4);
                frame.add(panel5);
                frame.revalidate();
                frame.repaint();
            }
        });
        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("              ");
                frame.remove(panel4);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();
            }
        });
        JLabel l4;
        l4=new JLabel("   عملیات با موفقیت انجام شد!");
        l4.setBounds(400,300, 400,50);
        panel5.add(l4);
        JButton b9=new JButton("برگشت");
        b9.setBounds(350,550,95,30);
        panel5.add(b9);

        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel5);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();
            }
        });
        JPanel panel6 = new JPanel();
        panel6.setBounds(0,350,1000,1000);

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                frame.add(panel6);
                frame.revalidate();
                frame.repaint();
            }
        });
        JLabel l5;
        l5=new JLabel(" : مبلغ مورد نظر را وارد کنید ");
        l5.setBounds(400,300, 400,50);
        panel6.add(l5);
        final JTextField tf3=new JTextField();
        tf3.setPreferredSize(new Dimension(200,30));
        panel6.add(tf3);

        JLabel l6;
        l6=new JLabel(" : شماره کارت مقصد را وارد کنید    ");
        l6.setBounds(400,300, 400,50);
        panel6.add(l6);
        final JTextField tf4=new JTextField();
        tf4.setPreferredSize(new Dimension(200,30));
        panel6.add(tf4);

        JButton b10=new JButton("ثبت");
        b10.setBounds(350,550,95,30);
        panel6.add(b10);
        JButton b15=new JButton("برگشت");
        b15.setBounds(350,550,95,30);
        panel6.add(b15);

        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf3.setText("              ");
                tf4.setText("              ");
                frame.remove(panel6);
                frame.add(panel5);
                frame.revalidate();
                frame.repaint();
            }
        });
        b15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel6);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();
            }
        });
        JPanel panel7 = new JPanel();
        panel7.setBounds(0,350,1000,1000);

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                frame.add(panel7);
                frame.revalidate();
                frame.repaint();
            }
        });
        JLabel l7;
        l7=new JLabel(" : رمز جدید را وارد کنید");
        l7.setBounds(400,300, 400,50);
        panel7.add(l7);

        final JTextField tf5=new JTextField();
        tf5.setPreferredSize(new Dimension(200,30));
        JButton b11=new JButton("تایید");
        b11.setBounds(350,550,95,30);
        JButton b16=new JButton("برگشت");
        b16.setBounds(350,550,95,30);
        panel7.add(tf5);
        panel7.add(b11);
        panel7.add(b16);

        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf5.setText("              ");
                frame.remove(panel7);
                frame.add(panel5);
                frame.revalidate();
                frame.repaint();
            }
        });
        b16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel7);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();
            }
        });
        JPanel panel8 = new JPanel();
        panel8.setBounds(0,350,1000,1000);

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                frame.add(panel8);
                frame.revalidate();
                frame.repaint();
            }
        });
        JLabel l8;
        l8=new JLabel("  موجودی حساب شما: 55671000000000 ریال");
        l8.setBounds(400,300, 400,50);
        panel8.add(l8);
        JButton b12=new JButton("برگشت");
        b12.setBounds(350,550,95,30);
        panel8.add(b12);

        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel8);
                frame.add(panel3);
                frame.revalidate();
                frame.repaint();
            }
        });

        frame.setVisible(true);
    }
}

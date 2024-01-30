import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setSize(400,330);

        JPanel panel1 = new JPanel(new BorderLayout());
        JPanel panel2 = new JPanel(new BorderLayout());
        JPanel panel3 = new JPanel(new BorderLayout());

        JLabel label0 = new JLabel("MAX CALCULATOR 2");
        JLabel label1 = new JLabel("Insert your PR:");
        JTextField tf1 = new JTextField(5);
        JLabel label2 = new JLabel("How many reps? (Must be <= 3)");
        JTextField tf2 = new JTextField(5);
        JButton button = new JButton("Submit");
        ImageIcon icon = new ImageIcon("Images/widegym.jpg");
        icon.setImage(icon.getImage().getScaledInstance(520,170,Image.SCALE_DEFAULT));
        JLabel picLabel = new JLabel(icon);

        final double[] pr = new double[1];
        final double[] reps = new double[1];
        final double[] mult = new double[1];
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tf1Data = tf1.getText();

                while(true){

                    try {
                        pr[0] = Integer.parseInt(tf1Data);
                        System.out.println(pr[0]);
                        break;
                    } catch (Exception error) {
                        JOptionPane.showMessageDialog(null, "Insert an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }

                String tf2Data = tf2.getText();

                while(true){

                    try {
                        reps[0] = Integer.parseInt(tf2Data);
                        System.out.println(reps[0]);
                        if(reps[0] == 2.0){
                            mult[0] = 1.05;
                        } else if(reps[0] == 3.0){
                            mult[0] = 1.1;
                        } else {
                            System.out.println("NO MAN");
                            mult[0] = 1.0;
                        }
                        break;
                    } catch (Exception error) {
                        JOptionPane.showMessageDialog(null, "Insert an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }

                JOptionPane.showMessageDialog(null, "Your max is " + (mult[0] * pr[0]));

            }
        });

        panel1.add(label0, BorderLayout.NORTH);
        panel1.add(label1, BorderLayout.CENTER);
        panel1.add(tf1, BorderLayout.SOUTH);
        panel2.add(label2, BorderLayout.NORTH);
        panel2.add(tf2, BorderLayout.CENTER);
        panel2.add(picLabel, BorderLayout.SOUTH);
        panel3.add(button, BorderLayout.CENTER);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.SOUTH);

        frame.setVisible(true);

    }

}

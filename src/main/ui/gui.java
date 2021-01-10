package ui;
import javax.swing.*;
import java.awt.*;

public class gui extends JFrame{
    // JPanel
    JPanel floors= new floor_indicator();
    // Buttons
    JPanel control_panel = new control_panel();

    public gui() {

        // JPanel bounds
        floors.setLayout(null);
        floors.setBounds(0, 0, 1000, 200);
        floors.repaint();

        control_panel.setLayout(null);
        for (int i = 1; i <= 10; i++) {
            JButton floor = new JButton(String.valueOf(i));
            floor.setBounds(40,   220+60 * i, 200, 50);
            control_panel.add(floor);
        }
        for (int i = 1; i <= 10; i++) {
            JButton floor = new JButton(String.valueOf(i));
            floor.setBounds(280,220+60*i,200,50);
            control_panel.add(floor);
        }

        for (int i = 1; i <= 10; i++) {
            JButton floor = new JButton(String.valueOf(i));
            floor.setBounds(520,220+60*i,200,50);
            control_panel.add(floor);
        }
        for (int i = 1; i <= 10; i++) {
            JButton floor = new JButton(String.valueOf(i));
            floor.setBounds(760,220+60*i,200,50);
            control_panel.add(floor);
        }
        control_panel.repaint();



        // Adding to JFrame
        getContentPane().add(floors);
        getContentPane().add(control_panel);

        // JFrame properties
        setSize(1000, 1000);
        setBackground(Color.BLACK);
        setTitle("Elevator control");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new gui();
    }

    //screen showing where the elevator is at
    private class floor_indicator extends JPanel{
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Font font = new Font ("Arial",Font.BOLD,70);
            g.setFont(font);
            g.drawString("6", 300, 100);
            g.drawString("6",600,100);
            setVisible(true);
        }

    }

    // requests to go up or down at each floor
    private class control_panel extends JPanel{

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Font font = new Font ("Arial",Font.BOLD,30);
            g.setFont(font);
            g.drawString("UP", 120, 250);
            g.drawString("DOWN",330,250);
            g.drawString("elevator_1", 540, 250);
            g.drawString("elevator_2",780,250);
        }
    }



    private class elevator_button extends JButton{

        public elevator_button() {
            super();
        }

    }
}

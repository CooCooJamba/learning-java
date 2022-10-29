import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    int number = new Random().nextInt(20) + 1;
    int temps = 1;
    private JButton button = new JButton("Угадать");
    private JTextField input = new JTextField(1);
    private JLabel label = new JLabel();
    public SimpleGUI() {
        super("Угадай число от 0 до 20");
        this.setBounds(100, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 1, 2, 2));
        container.add(label);
        container.add(input);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
    class ButtonEventListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            if (temps < 3) {
                if (Integer.parseInt(input.getText()) < number) {
                    label.setText("Загаданное число БОЛЬШЕ введенного");
                    temps++;
                }
                else if (Integer.parseInt(input.getText()) > number) {
                    label.setText("Загаданное число МЕНЬШЕ введенного");
                    temps++;
                }
                else {
                    label.setText("Вы угадали! Это было число " + number);
                    return;
                }
            } else {
                label.setText("Вы не угадали... Это было число " + number);
                return;
            }
        }
    }
}

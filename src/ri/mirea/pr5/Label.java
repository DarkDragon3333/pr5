package ri.mirea.pr5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Label implements ActionListener {

    JLabel label; //Текст с выводом результата
    Ex3 ex3; Ex4 ex4; Ex5 ex5; //исполнители задания
    JTextField str1; //Ввод числа

    Label() {
        JFrame obj = new JFrame("what");
        obj.setSize(650, 300);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        obj.setLayout(new FlowLayout()); //Компоновщик

        JButton button3 = new JButton("Exercise 3");
        JButton button4 = new JButton("Exercise 4");
        JButton button5 = new JButton("Exercise 5");
        str1 = new JTextField(10);
        label = new JLabel("Result: ");

        button3.setSize(200, 20);
        button4.setSize(200, 20);
        button5.setSize(200, 20);
        label.setSize(200, 40);
        ex3 = new Ex3();
        ex4 = new Ex4();
        ex5 = new Ex5();

        obj.add(str1);
        obj.add(button3);
        obj.add(button4);
        obj.add(button5);
        obj.add(label);

        obj.setVisible(true);

        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);

    }

    public void actionPerformed(ActionEvent click) {
        int x = Integer.parseInt(str1.getText().trim());

        if (click.getActionCommand().equals("Exercise 3")) {
            label.setText("Result: " + ex3.Count(x));

        } else if (click.getActionCommand().equals("Exercise 4")) {
            label.setText("Result: " + ex4.Simple(x));

        } else if (click.getActionCommand().equals("Exercise 5")) {
            label.setText("Result: " + ex5.CreateMassive(x));
        }

    }

}

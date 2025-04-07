import java.awt.*;

import javax.swing.*;

public class Menu extends JPanel {
  public Menu(int x, int y, int width, int height) {
    this.setBounds(x, y, width, height); // inherited from JPanel
    this.setBackground(Color.BLUE);

    GridLayout gridLayout = new GridLayout(2, 2); // לחלוקת הפאנל
    this.setLayout(gridLayout); // הגדרת הלייאאוט של כל הפאנל לפי הרשת#

    JButton button1 = new JButton("button 1");
    this.add(button1);

    JButton button2 = new JButton("button 2");
    this.add(button2);

    JButton button3 = new JButton("button 3");
    this.add(button3);

    JButton button4 = new JButton("button 4");
    this.add(button4);
  }
}

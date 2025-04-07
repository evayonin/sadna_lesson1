import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MainContent extends JPanel {
  private int x;
  private int y;
  private Player player1;

  public MainContent(int x, int y, int width, int height) {
    this.setBounds(x, y, width, height);
    this.setBackground(Color.RED);
    this.setLayout(null); // רוצים פיקסלים לציור
    this.x = 100;
    this.y = 100;
    this.player1 = new Player(100, 100);

    this.moveRight();
    ;

  }

  public void moveRight() { // בכל שנייה תגדיל את איקס ב1
    new Thread(() -> {
      while (true) {
        this.player1.moveRight();
        this.player1.moveDown();
        try {
          Thread.sleep(100);
          repaint(); // מצייר את המלבן מחדש כל פעם שזז
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    }).start();
  }

  public void paintComponent(Graphics g) { // מאפשרת לצייר על הפאנל דברים נוספים
    super.paintComponent(g);
    g.setColor(Color.GREEN);
    this.player1.paint(g); // מציירים את השחקן

    // g.fillRect(this.x, this.y, 100, 50);
    // g.setColor(Color.BLUE);
    // g.fillRect(200, 100, 100, 100); // עוד אחד צמוד לו

  }
}

import java.awt.Color;
import java.awt.Graphics;

public class Player {
  private int x;
  private int y;

  public Player(int startX, int startY) {
    this.x = startX;
    this.y = startY;
  }

  public void moveRight() {
    this.x++;
  }

  public void moveLeft() {
    this.x--;
  }

  public void moveDown() {
    this.y++;
  }

  public void moveUp() {
    this.y--;
  }

  public void paint(Graphics g) {
    g.setColor(Color.YELLOW);
    g.fillRect(this.x, this.y, 100, 100);

  }

}

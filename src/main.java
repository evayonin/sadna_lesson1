import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class main {
  public static final int WINDOW_WIDTH = 900;
  public static final int WINDOW_HEIGHT = 700;

  public static void main(String[] args) {
    JFrame window = new JFrame("My first GUI");
    window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    window.setLocationRelativeTo(null); // in the middle
    window.setResizable(false); // לא ניתו לשנות גודל מסך
    window.setLayout(null); // כדי שיהיה אפשר לשלוט בפיקסלים במסך
    // יצירת פאנל ראשון:
    Menu menue = new Menu(0, 0, WINDOW_WIDTH / 4, WINDOW_HEIGHT); // אובייקט מהמחלקה שיצרנו
    window.add(menue); // הוספה לחלון
    // יצירת פאנל שני:
    MainContent mainContent = new MainContent(WINDOW_WIDTH / 4, 0, WINDOW_WIDTH - WINDOW_WIDTH / 4, WINDOW_HEIGHT);
    window.add(mainContent); // הוספה לחלון

    window.setVisible(true);
  }
}

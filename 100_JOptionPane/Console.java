import javax.swing.JOptionPane;

public class Console {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Welcome\nHello\nWorld");
    String userName = JOptionPane.showInputDialog("What is your name?");
    String response = String.format("Welcome, %s!", userName);
    JOptionPane.showMessageDialog(null, response);
  }
}

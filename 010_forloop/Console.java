import java.util.Arrays;

public class Console {
  public static void main(String[] args) {
    DotGame myGame = new DotGame(7);
    System.out.println("Draw Left-Up");
    myGame.drawLeftUp();
    System.out.println();
    System.out.println("Draw Right-Up");
    myGame.drawRightUp();
    System.out.println();
    System.out.println("Draw Left-Down");
    myGame.drawLeftDown();
    System.out.println();
    System.out.println("Draw Right-Down");
    myGame.drawRightDown();
    System.out.println();
    System.out.println("Draw Diamond");
    myGame.drawDiamond();
    System.out.println();
  }
}

class DotGame {
  private int level;
  public DotGame(int level) {
    this.level = level;
  }

  protected void drawLeftUp() {
    for (int i=0; i<level; i++) {
      for (int j=0; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  protected void drawRightUp() {
    for (int i=0; i<level; i++) {
      for (int j=level-1; j>=0; j--) {
        if (j <= i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  protected void drawLeftDown() {
    for (int i=0; i<level; i++) {
      for (int j=level-1; j>=i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  protected void drawRightDown() {
    for (int i=0; i<level; i++) {
      for (int j=0; j<level; j++) {
        if (j >= i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  protected void drawDiamond() {
    drawDiamond_upside(level);
    drawDiamond(level);
    drawDiamond_downside(level);
  }

  private void drawDiamond(int level) {
    String content = "*";
    String[] contents = new String[level];
    for (int i=0; i<contents.length; i++) {
      contents[i] = content;
    }
    System.out.println(String.join("",contents));
  }

  private void drawDiamond_upside(int level) {
    for (int i=0; i<level/2; i++) {
      for (int j=0; j<level; j++) {
        if (j >= level/2-i && j <= level/2+i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  private void drawDiamond_downside(int level) {
    for (int i=level/2-1; i>=0; i--) {
      for (int j=0; j<level; j++) {
        if (j>=level/2-i && j <=level/2+i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

}


public class Stack {
  private int data[];
  private int offset;

  public Stack(int size) {
    data = new int[size];
    offset = -1; // starting from 0
  }

  public int pop() {
    if (-1 == offset) {
      return 0;
    } else {
      offset -= 1;
      return data[offset+1];
    }
  }

  public boolean push(int user_input) {
    if (offset >= (data.length - 1)) {
      return false;
    } else {
      offset += 1;
      data[offset] = user_input;
      return true;
    }
  }

}

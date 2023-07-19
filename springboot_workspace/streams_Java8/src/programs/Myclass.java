package programs;

public class Myclass {
private static int x = 10;
static {
      x++;
}
static {
      ++x;
}
{
      x--;
}
public static void main(String[] args) {
    Myclass obj = new Myclass();
    Myclass obj2 = new Myclass();
    Myclass obj3 = new Myclass();
    System.out.println(x);
  }
}

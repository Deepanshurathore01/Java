public class first {
  public static void main(String[] args) {
      System.out.println("Hello world");
      try {
          int a = 30 / 0;
          System.out.println(a);
      } catch (Exception e) {
          System.out.println("exception");
      }
  }
}


public class sum {
  public static void main(String[] args) {
    int n =124;
    int sum =0;
    while(n>0)
    {
        int dig =n%10;
        sum += dig;
        n /=10;
    }
    System.out.println(sum);
  }
}

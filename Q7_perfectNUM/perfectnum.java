

public class perfectnum {

  static boolean proot(int n)
  {
    int sum = 0;
    for(int i=1;i<n;i++)
    {
      if(n%i == 0)
      sum +=i;
    }
    System.out.println(sum);

  if(sum == n){
    return true;
  }
System.out.println(sum);
  return false;
  }
  public static void main(String[] args) {
    int n=28;
    System.out.println(proot(n));
  }
}

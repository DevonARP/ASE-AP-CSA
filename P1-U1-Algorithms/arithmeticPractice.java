public class Main {
  public static void main(String args[]) {
    
    System.out.println(7/2); //Fractional part was dropped
    System.out.println(7 % 2); //Modulo
    
    //Checking
    System.out.println(14 % 2 == 0); //Equal to
    System.out.println(14 % 2 != 0); //Not equal to
    
    //Integer Overflow
    int big = Integer.MAX_VALUE;
    System.out.println(big); ////-2147483648 
    System.out.println(big + 1); //-2147483648 
    
    //Cast
    System.out.println((int) 3.7 );
    System.out.println((double) 7);
    
    //Compound
    int x = 1;
    x++;
    System.out.println(x);
    
  }
}

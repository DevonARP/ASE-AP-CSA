public class Main {
  public static void main(String args[]) {
      Toast x = new Toast();
      x.makeToast();
  }
}


class Toast {
    public static void makeToast() {
        
        System.out.println("Hello"); //Error 1
        
        int x = 5; //Error 2
        
        int average = (x + x + x) / 3; //Error 3
        System.out.println(average);
        
        System.out.println(average/x); //Error 4
        
    } //Error 5
}

class ifelsenesting {
    public static void main(String args[]) {
      int a = 1000, b = 712, c = 478;
      System.out.print("largest value is : ");
      if (a > b) {
        if (a > c) {
          System.out.println(a);
        } else {
          System.out.println(c);
        }
  
      } else {
        if (c > b) {
          System.out.println(c);
        } else {
          System.out.println(b);
        }
      }
    }
  }
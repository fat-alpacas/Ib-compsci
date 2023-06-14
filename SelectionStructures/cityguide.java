class cityguide {
    public static void main(String args[]) {
      char choice;
      System.out.println("select ur choice");
      System.out.println(" M -> madras");
      System.out.println(" B -> bombay");
      System.out.println(" C -> calcutta");
      System.out.println("choice - - - ->");
      System.out.flush();
      try {
        switch (choice = (char) System.in.read()) {
        case 'M':
        case 'm':
          System.out.println("madras : booklet 5");
          break;
        case 'B':
        case 'b':
          System.out.println("bombay : booklet 9");
          break;
        case 'C':
        case 'c':
          System.out.println("calcutta : booklet 15");
          break;
        default:
          System.out.println(" Invalid Choice (IC)");
        }
      } catch (Exception e) {
        System.out.println(" I/O Error");
      }
    }
  }
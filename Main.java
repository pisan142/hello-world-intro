// Your First Program
class Main {
  
  // You should not change this method
  public static void main(String[] args) {
    printHello();
    printStarPiramid();
    printFace();
  }
  
  /**
   * This method should print
   * "Hello, CSS 142 Student!"
   */
  public static void printHello() {
    //TODO
    System.out.println("Hello, XXX");
  }
  
  /**
   This method print out a piramid of stars:
   "    *
       ***
      *****
     *******
    *********"
    Note: You need to print out the String between 2 quotation marks (").
          There should be a new line printed at the end of each line.
          To print a new line, you can use '\n' or println.
          There should be no space after the stars.
  */
  public static void printStarPiramid() {
      //TODO
  }
    
  // This method print out a face:
  //    +"""""+           
  //   [| o o |]          
  //    |  ^  |
  //    | '-' |
  //    +-----+
  /*
    Note: You need to print out the String between 2 quotation marks (").
          There should be a new line printed at the end of each line.
          To print a new line, you can use '\n' or println.
          There should be no space after the String at each line.
  */
  public static void printFace() {
      //TODO
  }
  
  /** 
   This method violates from CheckStyle rules.
   Fix all code lines that cause a checkstyle warming
  */
  public static void printLongSentence() 
  {
        System.out.println("This is a very long sentence that contains over 100 characters, and it should cause a warming in checkstyle!");
    
          int NUM1=0; double NUM2=2.5; String STRING1 = "Hello World!";
      System.out.println(NUM1); System.out.println(NUM2); System.out.println(STRING1);
  }
}

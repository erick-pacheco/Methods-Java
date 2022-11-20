class Main {
  public static void main(String[] args) {

    /* Instantiate Duck class and assign to a reference variable named donald. */
    Duck donald = new Duck();
    String waddling = donald.waddle();
    log(waddling);

    /* Behavior: make donald quack using quack method */
    String quacking = donald.quack();
    log(quacking);

  }

  public static void log(Object message) {
    System.out.println(message);
  }
}
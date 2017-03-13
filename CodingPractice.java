public class CodingPractice {
  public static void main(String[] args) {


    String[] myCodingPractice = { "How many hours today?", "How many hours yesterday", "How many hours two days ago?"};

    Integer totalHours = 0;
    for ( String question : myCodingPractice) {
      System.out.println(question);
      String hours = System.console().readLine();
      Integer intHours = Integer.parseInt(hours);
      totalHours = totalHours + intHours;
    }
    String total = totalHours.toString();
    System.out.println("Your total hours spent coding are " + total + " hours.");
    if (totalHours <= 10) {
      System.out.println("You should practice more!");
    } else if ( totalHours < 20) {
      System.out.println("You are practicing well, but practice makes perfect!");
    } else if ( totalHours >= 20) {
      System.out.println("You are well on your way to becoming a great programmer!");
    }
  }
}

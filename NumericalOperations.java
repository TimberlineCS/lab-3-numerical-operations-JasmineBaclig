public class NumericalOperations {
  public static void main(String[] args) {

    //Challenge 1
    double d1 = 37.9, d2 = 1004;
    int i1 = 12, i2 = 18;

    System.out.println(57.2 * (i1 / i2) + 1); //Problem 1: Correct
    System.out.println(57.2 * ((double)i1 / i2) + 1); //Problem 2: Wrong (Calculated as if cast was outside of parenthesis)
    System.out.println(15 - i1 * (d1 * 3) + 4); //Problem 3: Correct
    System.out.println(15 - i1 * ((int)d1 * 3) + 4); //Problem 4: Wrong (Calculated as if cast was outside of parenthesis)
    System.out.println(15 - i1 * (int)(d1 * 3) + 4); //Problem 5: Correct
  }
}
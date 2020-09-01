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

    //Challenge 2
    int num = 1234;

    int ones = num % 10; //4
    int tens = num % 100; //34
    int hundreds = num % 1000; //234
    int thousands = num; //1234

    int firstDigit = (thousands - hundreds) / 1000; //1
    int secondDigit = (hundreds - tens) / 100; //2
    int thirdDigit = (tens - ones) / 10; //3
    int fourthDigit = ones; //4

    System.out.println(fourthDigit + "" + thirdDigit + "" + secondDigit + "" + firstDigit);
  }
}
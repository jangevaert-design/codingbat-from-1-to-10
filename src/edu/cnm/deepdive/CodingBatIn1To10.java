package edu.cnm.deepdive;

/*
Given a number n, return true if n is in the range 1..10, inclusive.
Unless outsideMode is true, in which case return true if the number is less or equal to 1,
or greater or equal to 10.

in1To10(5, false) → true
in1To10(11, false) → false
in1To10(11, true) → true
 */

public class CodingBatIn1To10 {

  public static void main(String[] args) {

    System.out.printf("if outsideMode is %s and the number is %s, then the outcome is "
        + in1To10(5, false) + "\n", "false", "5");
    System.out.printf("if outsideMode is %s and the number is %s, then the outcome is "
        + in1To10(11, false) + "\n", "false", "11");
    System.out.printf("if outsideMode is %s and the number is %s, then the outcome is "
        + in1To10(11, true) + "\n", "true", "11");

  }

  public static boolean in1To10(int n, boolean outsideMode) {
    return ((!outsideMode && (n > 0 && n < 11)) ||
        (outsideMode && (n <= 1 || n >= 10)));
  }
}

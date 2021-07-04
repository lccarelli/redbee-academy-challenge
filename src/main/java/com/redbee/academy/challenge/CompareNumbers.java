package com.redbee.academy.challenge;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {
    Integer result = null;

    if( a!=null && b!=null && c!=null){
      if( a >= b && a >= c){
        result = a;
      } else if (b >= a && b >= c){
        result = b;
      } else {
        result = c;
      }
    } else if (a!=null && b==null && c==null){
      result = a;
    } else if (a==null && b!=null && c==null){
      result = b;
    }else{
      result = c;
    }

    return result;
  }
}

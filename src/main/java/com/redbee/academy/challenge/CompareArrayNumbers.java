package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    Integer lenght = null, i;
    Integer elementA, elementB;
    List<Integer> result = new ArrayList<>();

    if(a.size()>=b.size()){
      lenght = a.size();
    }
    if(a.size()<b.size()){
      lenght = b.size();
    }

    System.out.println("lenght usado: " + lenght);
    for(i=0; i<lenght;i++){

      if(i>=a.size()){
        elementA = 0;
      } else {
        elementA = a.get(i);
      }
      if(i>=b.size()){
        elementB = 0;
      } else {
        elementB = b.get(i);
      }

      if(elementA!=null && elementB!=null){
        if ( elementA >= elementB){
          result.add(elementA);
        } else {
          result.add(elementB);
        }
      }
    }

    return result;
  }
}

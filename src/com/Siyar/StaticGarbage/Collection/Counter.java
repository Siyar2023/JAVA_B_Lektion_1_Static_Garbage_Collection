package com.Siyar.StaticGarbage.Collection;

public class Counter {
  static int value = 0;  //static int blir om du har


    static public void count() {  //om man har static så kan man inte ha vanliga variabler
        System.out.println("Before " + value);
        value++;
        System.out.println("After " + value);


    }
}


/* TODO - About Static
* static methods must have static variables
* regular methods, Can have static variables
*
* What does static method do?
  - Added new feature
   - No necessary instantiation for method calling



* * What does static variable do?
- Unchanged memory position (Saknar förändring)
 - Only ONE memory position is allocated.
  - One reference only

*
*
 */

package hooks.riddle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contains any char.
Examples input/output:
XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
*/

public class XO {

  public static boolean getXO(String str) {
    int numOfX  = (int) str.chars().mapToObj(c -> (char) c).filter(chr -> Character.toLowerCase(chr) == 'x').count();
    int numOfO  = (int) str.chars().mapToObj(c -> (char) c).filter(chr -> Character.toLowerCase(chr) == 'o').count();
    return numOfX == numOfO;
  };

}

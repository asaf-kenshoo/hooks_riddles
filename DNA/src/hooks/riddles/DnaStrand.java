package hooks.riddles;

import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.
 * <p>
 * If you want to know more http://en.wikipedia.org/wiki/DNA
 * <p>
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
 * You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side.
 * DNA strand is never empty or there is no DNA at all (again, except for Haskell).
 */

public class DnaStrand {
    public static String makeComplement(String dna) {



//      SOLUTION 1
    /*
    return dna.replace("A","B")
            .replace("C","D")
            .replace("T","A")
            .replace("G","C")
            .replace("B","T")
            .replace("D","G");
    */


      /*
      SOLUTION 2
     */
        HashMap<Character, Character> map = new HashMap<>(4);
        map.put('A', 'T');
        map.put('T', 'A');
        map.put('C', 'G');
        map.put('G', 'C');
        return dna.chars().mapToObj(c -> String.valueOf(map.get((char) c))).collect(Collectors.joining());
    }
}
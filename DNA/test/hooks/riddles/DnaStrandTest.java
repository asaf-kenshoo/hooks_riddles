package hooks.riddles;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DnaStrandTest {
  @Test
  public void test01() {
    Assert.assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
  }
  @Test
  public void test02() {
    assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
  }
  @Test
  public void test03() {
    assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
  }
}
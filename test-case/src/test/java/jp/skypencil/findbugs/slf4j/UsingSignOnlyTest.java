package jp.skypencil.findbugs.slf4j;

import java.util.Collections;
import java.util.Map;

import org.junit.Test;

public class UsingSignOnlyTest {
  @Test
  public void test() {
    Map<String, Integer> expected = Collections.singletonMap("SLF4J_SIGN_ONLY_FORMAT", 1);
    new XmlParser().expect(pkg.UsingSignOnly.class, expected);
  }
}
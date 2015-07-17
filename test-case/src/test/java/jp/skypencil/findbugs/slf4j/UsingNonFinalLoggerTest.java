package jp.skypencil.findbugs.slf4j;

import java.util.Collections;
import java.util.Map;

import org.junit.Test;

public class UsingNonFinalLoggerTest {
  @Test
  public void test() {
    Map<String, Integer> expected = Collections.singletonMap("SLF4J_LOGGER_SHOULD_BE_FINAL", 1);
    new XmlParser().expect(pkg.UsingNonFinalLogger.class, expected);
  }
}

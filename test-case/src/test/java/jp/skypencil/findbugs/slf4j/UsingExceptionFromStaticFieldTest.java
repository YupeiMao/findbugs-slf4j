package jp.skypencil.findbugs.slf4j;

import java.util.Collections;

import org.junit.Test;

public class UsingExceptionFromStaticFieldTest {
  @Test
  public void test() {
    new XmlParser().expect(pkg.UsingExceptionFromStaticField.class, Collections.emptyMap());
  }
}

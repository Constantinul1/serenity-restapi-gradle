package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.SomeSteps;

@RunWith(SerenityRunner.class)
public class SomeTest {

  @Steps SomeSteps someSteps;

  @Test
  public void someTest() {
    someSteps.makeCall();
    someSteps.verifyCall();
  }

}

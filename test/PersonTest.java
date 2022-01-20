

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {

  private Person john;

  /**
   * create the person class
   */
  @Before
  public void setUp() {

    john = new Person("John", "Doe", 1945);
  }

  /**
   * test the function getFirstName
   */

  @Test
  public void testFirst() {
    assertEquals("John", john.getFirstName());
  }

  /**
   * test the function getLastName
   */

  @Test
  public void testSecond() {
    assertEquals("Doe", john.getLastName());
  }

  /**
   * test the function getYearOfBirth
   */

  @Test
  public void testYearOfBirth() {
    assertEquals(1945, john.getYearOfBirth());
  }
}

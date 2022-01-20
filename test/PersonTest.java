

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {

  private Person john;

  /**
   * Create the person class.
   */
  @Before
  public void setUp() {

    john = new Person("John", "Doe", 1945);
  }

  /**
   * Test the function getFirstName.
   */

  @Test
  public void testFirst() {
    assertEquals("John", john.getFirstName());
  }

  /**
   * Test the function getLastName.
   */

  @Test
  public void testSecond() {
    assertEquals("Doe", john.getLastName());
  }

  /**
   * Test the function getYearOfBirth.
   */

  @Test
  public void testYearOfBirth() {
    assertEquals(1945, john.getYearOfBirth());
  }
}

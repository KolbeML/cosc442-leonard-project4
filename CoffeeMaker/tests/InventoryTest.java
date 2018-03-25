

import edu.towson.cis.cosc442.project4.coffeemaker.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 3/24/18, 6:04 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	/**
	 * Run the Inventory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {

		Inventory result = new Inventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getSugar());
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testEnoughIngredients_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test, not enough coffee.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testEnoughIngredients_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();
		r.setAmtCoffee(49);

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(false, result);
	}
	
	/**
	 * Run the boolean enoughIngredients(Recipe) method test, just enough coffee.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testEnoughIngredients_2a()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();
		r.setAmtCoffee(49);
		fixture.setCoffee(49);

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}
	
	/**
	 * Run the boolean enoughIngredients(Recipe) method test, not enough milk.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testEnoughIngredients_3()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();
		r.setAmtMilk(49);

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(false, result);
	}
	
	/**
	 * Run the boolean enoughIngredients(Recipe) method test, just enough milk.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testEnoughIngredients_3a()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();
		r.setAmtMilk(49);
		fixture.setMilk(49);
		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}
	
	/**
	 * Run the boolean enoughIngredients(Recipe) method test, 
	 * not enough chocolate.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testEnoughIngredients_4()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();
		r.setAmtChocolate(49);

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(false, result);
	}
	/**
	 * Run the boolean enoughIngredients(Recipe) method test, 
	 * just enough chocolate.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testEnoughIngredients_4a()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();
		r.setAmtChocolate(49);
		fixture.setChocolate(49);
		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}
	
	/**
	 * Run the boolean enoughIngredients(Recipe) method test, not enough sugar.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testEnoughIngredients_5()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();
		r.setAmtSugar(49);

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(false, result);
	}
	
	/**
	 * Run the boolean enoughIngredients(Recipe) method test, just enough sugar.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testEnoughIngredients_5a()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();
		r.setAmtSugar(49);
		fixture.setSugar(49);
		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int getChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testGetChocolate_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getChocolate();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testGetCoffee_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getCoffee();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testGetMilk_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getMilk();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testGetSugar_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		int result = fixture.getSugar();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testSetChocolate_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int chocolate = -1;

		fixture.setChocolate(chocolate);
		assertEquals(0, fixture.getChocolate());
		// add additional test code here
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testSetChocolate_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int chocolate = 1;

		fixture.setChocolate(chocolate);
		assertEquals(chocolate, fixture.getChocolate());
		// add additional test code here
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testSetCoffee_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int coffee = -1;

		fixture.setCoffee(coffee);
		assertEquals(0, fixture.getCoffee());
		// add additional test code here
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testSetCoffee_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int coffee = 1;

		fixture.setCoffee(coffee);
		assertEquals(coffee, fixture.getCoffee());
		// add additional test code here
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testSetMilk_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int milk = -1;

		fixture.setMilk(milk);
		assertEquals(0, fixture.getMilk());
		// add additional test code here
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testSetMilk_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int milk = 1;

		fixture.setMilk(milk);
		assertEquals(milk, fixture.getMilk());
		// add additional test code here
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testSetSugar_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int sugar = -1;

		fixture.setSugar(sugar);
		assertEquals(0, fixture.getSugar());
		// add additional test code here
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testSetSugar_2()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();
		int sugar = 1;

		fixture.setSugar(sugar);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Inventory fixture = InventoryFactory.createInventory();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/24/18, 6:04 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
	}
}
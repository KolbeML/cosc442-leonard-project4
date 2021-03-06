
import edu.towson.cis.cosc442.project4.coffeemaker.*;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.Console;

/**
 * The class <code>CoffeeMakerTest</code> contains tests for the class <code>{@link CoffeeMaker}</code>.
 *
 * @generatedBy CodePro at 3/24/18, 5:40 PM
 * @author Kolbe
 * @version $Revision: 1.0 $
 */
public class CoffeeMakerTest {
	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testCoffeeMaker_1()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testCoffeeMaker_2()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testAddInventory_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 0;
		int amtChocolate = -1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testAddInventory_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 0;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testAddInventory_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = -1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testAddInventory_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = -1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testAddInventory_5()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(true, result);
	}
	
	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testAddInventory_6()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 0;
		int amtMilk = 0;
		int amtSugar = 0;
		int amtChocolate = 0;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(true, result);
	}
	
	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testAddInventory_7()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		CoffeeMaker fixture1 = CoffeeMakerFactory.createCoffeeMaker();		
		int amtCoffee = 5;
		int amtMilk = 5;
		int amtSugar = 5;
		int amtChocolate = 5;

		
		fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);
		
		// add additional test code here
		assertNotEquals(fixture1.checkInventory(), fixture.checkInventory());
	}
	
	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testAddInventory_8()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		CoffeeMaker fixture1 = CoffeeMakerFactory.createCoffeeMaker();		
		int addIt = 5,
				newAmt = 20;
		int amtCoffee = addIt;
		int amtMilk = addIt;
		int amtSugar = addIt;
		int amtChocolate = addIt;

		
		fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);
		Inventory i = fixture.checkInventory();
		// add additional test code here
		assertEquals(newAmt, i.getCoffee());
		assertEquals(newAmt, i.getChocolate());
		assertEquals(newAmt, i.getMilk());
		assertEquals(newAmt, i.getSugar());
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testAddRecipe_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testAddRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}
	
	/**
	 * Run the boolean addRecipe(Recipe) method test when we already have 4 recipes
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testAddRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		Recipe r1 = RecipeFactory.createRecipe();
		Recipe r2 = RecipeFactory.createRecipe();
		Recipe r3 = RecipeFactory.createRecipe();
		Recipe r4 = RecipeFactory.createRecipe();

		fixture.addRecipe(r1);
		fixture.addRecipe(r2);
		fixture.addRecipe(r3);
		fixture.addRecipe(r4);
		
		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}
	
	/**
	 * Run the boolean addRecipe(Recipe) method test when we already have 4 recipes
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testAddRecipe_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		Recipe r1 = RecipeFactory.createRecipe();
		Recipe r2 = RecipeFactory.createRecipe();
		Recipe r3 = RecipeFactory.createRecipe();

		fixture.addRecipe(r1);
		fixture.addRecipe(r2);
		fixture.addRecipe(r3);
		fixture.addRecipe(r);
		
		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Inventory checkInventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testCheckInventory_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();

		Inventory result = fixture.checkInventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getChocolate());
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test, recipe not added
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testDeleteRecipe_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testDeleteRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		Recipe r1 = RecipeFactory.createRecipe();
		fixture.addRecipe(r);
		r.setName("koko");
		r1.setName("okok");
		fixture.addRecipe(r1);
		
		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testDeleteRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testDeleteRecipe_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = null;

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test with two null recipes.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testEditRecipe_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test, with valid params.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testEditRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();
		
		oldRecipe.setName("test");
		newRecipe.setName("test");
		fixture.addRecipe(oldRecipe);
		
		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test, with invalid but non-null params.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testEditRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();
		Recipe badRecipe = RecipeFactory.createRecipe();

		oldRecipe.setName("test1");
		newRecipe.setName("test2");
		badRecipe.setName("test3");
		fixture.addRecipe(badRecipe);
		
		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testEditRecipe_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testEditRecipe_5()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test, no recipes added.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testGetRecipeForName_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtMilk());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test, wrong recipe added.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testGetRecipeForName_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		r.setName("testy1");
		String name = "testy2";
		fixture.addRecipe(r);
		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotEquals(result.getName(), r.getName());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test, successful run.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testGetRecipeForName_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		String name = "test";
		Recipe r = RecipeFactory.createRecipe();
		r.setName(name);
		r.setAmtCoffee(1);
		r.setAmtMilk(2);
		r.setAmtSugar(3);
		r.setAmtChocolate(4);
		r.setPrice(5);
		
		fixture.addRecipe(r);
		
		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertNotNull(result.toString());
		assertEquals(name, result.getName());
		assertEquals(3, result.getAmtSugar());
		assertEquals(4, result.getAmtChocolate());
		assertEquals(1, result.getAmtCoffee());
		assertEquals(5, result.getPrice());
		assertEquals(2, result.getAmtMilk());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testGetRecipeForName_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtMilk());
	}

	/**
	 * Run the Recipe[] getRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testGetRecipes_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();

		Recipe[] result = fixture.getRecipes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].toString());
		assertEquals(null, result[0].getName());
		assertEquals(0, result[0].getAmtSugar());
		assertEquals(0, result[0].getAmtChocolate());
		assertEquals(0, result[0].getAmtCoffee());
		assertEquals(0, result[0].getPrice());
		assertEquals(0, result[0].getAmtMilk());
		assertNotNull(result[1]);
		assertEquals(null, result[1].toString());
		assertEquals(null, result[1].getName());
		assertEquals(0, result[1].getAmtSugar());
		assertEquals(0, result[1].getAmtChocolate());
		assertEquals(0, result[1].getAmtCoffee());
		assertEquals(0, result[1].getPrice());
		assertEquals(0, result[1].getAmtMilk());
		assertNotNull(result[2]);
		assertEquals(null, result[2].toString());
		assertEquals(null, result[2].getName());
		assertEquals(0, result[2].getAmtSugar());
		assertEquals(0, result[2].getAmtChocolate());
		assertEquals(0, result[2].getAmtCoffee());
		assertEquals(0, result[2].getPrice());
		assertEquals(0, result[2].getAmtMilk());
		assertNotNull(result[3]);
		assertEquals(null, result[3].toString());
		assertEquals(null, result[3].getName());
		assertEquals(0, result[3].getAmtSugar());
		assertEquals(0, result[3].getAmtChocolate());
		assertEquals(0, result[3].getAmtCoffee());
		assertEquals(0, result[3].getPrice());
		assertEquals(0, result[3].getAmtMilk());
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testMakeCoffee_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testMakeCoffee_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(1, result);
	}
	
	/**
	 * Run the int makeCoffee(Recipe,int) method test, just enough money
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testMakeCoffee_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		r.setPrice(1);
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);
		assertEquals(0, result);
		// add additional test code here
	}
	
	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 * Ensure inventory being updated accurately.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testMakeCoffee_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Inventory i = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();
		
		i.setChocolate(20);
		i.setCoffee(20);
		i.setMilk(20);
		i.setSugar(20);
		
		r.setPrice(1);
		r.setAmtChocolate(10);
		r.setAmtCoffee(10);
		r.setAmtMilk(10);
		r.setAmtSugar(10);
		
		int amtPaid = 1;

		fixture.makeCoffee(r, amtPaid);
		assertNotEquals(i, fixture.checkInventory());
		// add additional test code here
	}
	
	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 * Ensure inventory being updated accurately.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testMakeCoffee_5()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Inventory i = InventoryFactory.createInventory();
		Recipe r = RecipeFactory.createRecipe();
		
		i.setChocolate(5);
		i.setCoffee(5);
		i.setMilk(5);
		i.setSugar(5);
		
		r.setPrice(1);
		r.setAmtChocolate(10);
		r.setAmtCoffee(10);
		r.setAmtMilk(10);
		r.setAmtSugar(10);
		
		int amtPaid = 1;

		fixture.makeCoffee(r, amtPaid);
		Inventory i2 = fixture.checkInventory();
		
		assertEquals(i.getChocolate(), i2.getChocolate());
		assertEquals(i.getCoffee(), i2.getCoffee());
		assertEquals(i.getSugar(), i2.getSugar());
		assertEquals(i.getMilk(), i2.getMilk());
		// add additional test code here
	}
	
	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 * Ensure inventory being updated accurately.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testMakeCoffee_6()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		
		r.setPrice(1);
		r.setAmtChocolate(10);
		
		int amtPaid = 10;

		fixture.makeCoffee(r, amtPaid);
		Inventory i2 = fixture.checkInventory();
		assertNotEquals(25, i2.getChocolate());
		assertNotEquals(15, i2.getChocolate());
		// add additional test code here
	}
	
	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 * Ensure inventory being updated accurately.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testMakeCoffee_7()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		
		r.setPrice(1);
		r.setAmtCoffee(10);
		
		int amtPaid = 10;

		fixture.makeCoffee(r, amtPaid);
		Inventory i2 = fixture.checkInventory();
		assertNotEquals(25, i2.getCoffee());
		assertNotEquals(15, i2.getCoffee());
		// add additional test code here
	}
	
	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 * Ensure inventory being updated accurately.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testMakeCoffee_8()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		
		r.setPrice(1);
		r.setAmtMilk(10);
		
		int amtPaid = 10;

		fixture.makeCoffee(r, amtPaid);
		Inventory i2 = fixture.checkInventory();
		assertNotEquals(25, i2.getMilk());
		assertNotEquals(15, i2.getMilk());
		// add additional test code here
	}
	
	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 * Ensure inventory being updated accurately.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	@Test
	public void testMakeCoffee_9()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		
		r.setPrice(1);
		r.setAmtSugar(10);
		
		int amtPaid = 10;

		fixture.makeCoffee(r, amtPaid);
		Inventory i2 = fixture.checkInventory();
		assertNotEquals(25, i2.getSugar());
		assertNotEquals(15, i2.getSugar());
		// add additional test code here
	}


	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
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
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
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
	 * @generatedBy CodePro at 3/24/18, 5:40 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CoffeeMakerTest.class);
	}
}
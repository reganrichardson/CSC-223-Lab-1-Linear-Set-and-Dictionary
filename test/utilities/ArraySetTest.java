package utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ArraySetTest

{
	//Create ArraySet
	ArraySet<Integer> ArraySet = new ArraySet<Integer>();
	ArraySet<Integer> testSet = new ArraySet<Integer>();
	
	
	/**
	 * Adds several elements to an array
	 * @param list
	 */
	private void addSeveral(ArraySet<Integer> list) {
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(9);
	}
	
	/**
	 * Clears newList and adds a single element to it
	 * @param newList
	 * @param num
	 */
	private void clearAdd(ArraySet<Integer> newList, int num) {
		newList.clear();
		newList.add(num);
	}
	
	@Test
	void testArraySetCollectionOfE()
	{
		
	}

	@Test
	void testAddE()
	{
		//Clear set
		ArraySet.clear();
		assertEquals(0 , ArraySet.size());
		
		//Test 1: Adding an element that is not in the array
		//int 3 should not be in the array
		assertFalse(ArraySet.contains(3));
		//add 3
		ArraySet.add(3);
		//check element has been added
		assertTrue(ArraySet.contains(3));
		//check that the size of the array is now 1
		assertEquals(1,ArraySet.size());
		
		//Test 2: Attempting to add an element that is in the array
		//Cannot add 3
		assertFalse(ArraySet.add(3));
	}

	@Test
	void testAddAllCollectionOfQextendsE()
	{
		
	}

	@Test
	void testRetainAll()
	{
		//Clear set
		ArraySet.clear();
		assertEquals(0 , ArraySet.size());
		
		//Test 1: retain when set is empty- should be false
		assertFalse(ArraySet.retainAll(ArraySet));
		
		//Test 2: retain all- should be false
		//call add some method
		addSeveral(ArraySet);
		assertFalse(ArraySet.retainAll(ArraySet));
		//check that ArraySet size is now 0
		assertEquals(4, ArraySet.size());
		
		//Test 3: retain some elements - should be true
		//build second collection with some elements from ArraySet
		testSet.add(3);
		//only some elements should remain- should be true
		assertTrue(ArraySet.retainAll(testSet));
		//check that there is only one element in the set
		assertEquals(1, ArraySet.size());
		
		//Test 4: retain none when testSet is nonempty- should be true
		//call clear and add method with 5 as param
		clearAdd(testSet, 5);
		//call add several on ArraySet
		addSeveral(ArraySet);
		//test that nothing is retained
		assertTrue(ArraySet.retainAll(testSet));
		//check that ArraySet size is now 0
		assertEquals(0, ArraySet.size());
		
		//Test 5: retain non when testSet is empty- should be true
		//clear test set
		testSet.clear();
		//call add Several
		addSeveral(ArraySet);
		//test that none are retained
		assertTrue(ArraySet.retainAll(testSet));
		//check that ArraySet size is now 0
		assertEquals(0, ArraySet.size());
		
	}

	@Test
	void testRemoveAll()
	{
		//Clear set
		ArraySet.clear();
		assertEquals(0 , ArraySet.size());
		
		//Test 1: Remove on an empty set- should be false
		assertFalse(ArraySet.removeAll(ArraySet));
		
		//Test 2: Remove all elements- should be true
		//call add several on test Set
		addSeveral(testSet);
		//call add several on ArraySet
		addSeveral(ArraySet);
		//should return true
		assertTrue(ArraySet.removeAll(testSet));
		//check that ArraySet size is now 0
		assertEquals(0, ArraySet.size());
		
		//Test 3: Remove some elements- should be true
		//call clear and add on test set, param 3
		clearAdd(testSet, 3);
		//call add several on ArraySet
		addSeveral(ArraySet);
		//Remove testSet from ArraySet
		assertTrue(ArraySet.removeAll(testSet));
		//check that ArraySet size is now 3
		assertEquals(3, ArraySet.size());
		
		//Test 4: Remove no elements when test Set is nonempty- should be false
		//call clear and add on test set, param 5
		clearAdd(testSet, 5);
		//call add several on ArraySet
		addSeveral(ArraySet);
		//Remove test set from arraySet
		assertFalse(ArraySet.removeAll(testSet));
		
		//Test 5: Remove no elements when test Set is empty- should be false
		//Clear test Set
		testSet.clear();
		//call add several on ArraySet
		addSeveral(ArraySet);
		//Remove test set from arraySet
		assertFalse(ArraySet.removeAll(testSet));
		
	}

	@Test
	void testAddAllIntCollectionOfQextendsE()
	{
		
	}
}

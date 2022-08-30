package utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;

class ArraySetTest

{
	//Create newSet
	ArraySet<Integer> newSet = new ArraySet<Integer>();
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
	
	public ArraySet<Integer> getPopulated(){
		
		ArrayList<Integer> lst = new ArrayList<Integer>(Arrays.asList(1,7,12));
		
		ArraySet<Integer> s = new ArraySet<Integer>(lst);
		return s;
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
	void testnewSetCollectionOfE()
	{
		
		
		//Test 1: Collection of nonrepeated integers - should be true
		addSeveral(testSet);
		//test set should contain 4 elements
		assertEquals(4, testSet.size());
		
		//Test 2: Creating an arrayset by adding repeats - should be false
		testSet.add(3);
		assertEquals(4, testSet.size());
	}

	@Test
	void testAddE()
	{
		//Clear set
		newSet.clear();
		assertEquals(0 , newSet.size());
		
		//Test 1: Adding an element that is not in the array
		//int 3 should not be in the array
		assertFalse(newSet.contains(3));
		//add 3
		assertTrue(newSet.add(3));
		//check that the size of the array is now 1
		assertEquals(1,newSet.size());
		
		//Test 2: Attempting to add an element that is in the array
		//Cannot add 3
		assertFalse(newSet.add(3));
	}

	@Test
	void testAddAllCollectionOfQextendsE()
	{
		//Clear set
		newSet.clear();
		assertEquals(0 , newSet.size());
		
		//Test 1: Add to an empty set- should be true
		//call add several on test set
		addSeveral(testSet);
		//add all to newset
		assertTrue(newSet.addAll(testSet));
		//check that everything was added to newset
		assertEquals(4, newSet.size());
		
		
		//Test 2: Add when test set contains no new elements- should be false
		//try adding test set again
		assertFalse(newSet.addAll(testSet));
		
		//Test 3: Add when test set contains some new elements- should be true
		//clear and add new set, 3
		clearAdd(newSet, 3);
		//add test set
		assertTrue(newSet.addAll(testSet));
		//check that there are 4 things in new set
		assertEquals(4, newSet.size());		
	}

	@Test
	void testRetainAll()
	{
		//Clear set
		newSet.clear();
		assertEquals(0 , newSet.size());
		
		//Test 1: retain when set is empty- should be false
		assertFalse(newSet.retainAll(newSet));
		
		//Test 2: retain all- should be false
		//call add some method
		addSeveral(newSet);
		assertFalse(newSet.retainAll(newSet));
		//check that newSet size is now 0
		assertEquals(4, newSet.size());
		
		//Test 3: retain some elements - should be true
		//build second collection with some elements from newSet
		testSet.add(3);
		testSet.add(4);
		//only some elements should remain- should be true
		assertTrue(newSet.retainAll(testSet));
		//check that there are 2 elements in the set
		assertEquals(2, newSet.size());
		
		//Test 4: retain none when testSet is nonempty- should be true
		//call clear and add method with 5 as param
		clearAdd(testSet, 5);
		//call add several on newSet
		addSeveral(newSet);
		//test that nothing is retained
		assertTrue(newSet.retainAll(testSet));
		//check that newSet size is now 0
		assertEquals(0, newSet.size());
		
		//Test 5: retain non when testSet is empty- should be true
		//clear test set
		testSet.clear();
		//call add Several
		addSeveral(newSet);
		//test that none are retained
		assertTrue(newSet.retainAll(testSet));
		//check that newSet size is now 0
		assertEquals(0, newSet.size());
		
	}

	@Test
	void testRemoveAll()
	{
		//Clear set
		newSet.clear();
		assertEquals(0 , newSet.size());
		
		//Test 1: Remove on an empty set- should be false
		assertFalse(newSet.removeAll(newSet));
		
		//Test 2: Remove all elements- should be true
		//call add several on test Set
		addSeveral(testSet);
		//call add several on newSet
		addSeveral(newSet);
		//should return true
		assertTrue(newSet.removeAll(testSet));
		//check that newSet size is now 0
		assertEquals(0, newSet.size());
		
		//Test 3: Remove some elements- should be true
		//call clear and add on test set, param 3
		clearAdd(testSet, 3);
		//call add several on newSet
		addSeveral(newSet);
		//Remove testSet from newSet
		assertTrue(newSet.removeAll(testSet));
		//check that newSet size is now 3
		assertEquals(3, newSet.size());
		
		//Test 4: Remove no elements when test Set is nonempty- should be false
		//call clear and add on test set, param 5
		clearAdd(testSet, 5);
		//call add several on newSet
		addSeveral(newSet);
		//Remove test set from arraySet
		assertFalse(newSet.removeAll(testSet));
		//check that newSet size is now 4
		assertEquals(4, newSet.size());
		
		//Test 5: Remove no elements when test Set is empty- should be false
		//Clear test Set
		testSet.clear();
		//call add several on newSet
		addSeveral(newSet);
		//Remove test set from newSet
		assertFalse(newSet.removeAll(testSet));
		//check that newSet size is now 4
		assertEquals(4, newSet.size());
		
	}

	@Test
	void testAddAllIntCollectionOfQextendsE()
	{
		//Clear set
		newSet.clear();
		assertEquals(0 , newSet.size());
	
		//Test 1: Add collection to nonempty set at index 0
		//Add 1 to array set
		newSet.add(0, 1);
		//Add 4,5 to testSet
		addSeveral(testSet);
		//add collection at index 0
		assertTrue(newSet.addAll(0, testSet));
		//check that 3 is at index 0
		assertEquals(3, newSet.get(0));
		
		//Test 2: Add collection to set at end of list
		//clear set
		newSet.clear();
		newSet.add(0, 1);
		//add collection at end of the list
		assertTrue(newSet.addAll(newSet.size(), testSet));
		//check that 3 is at index 
		assertEquals(9, newSet.get(newSet.size()-1));
		
		//Test 3: Add collection to set in the middle of list
		//clear set
		newSet.clear();
		//add more elements to array
		newSet.add(0, 1);
		newSet.add(1,2);
		newSet.add(2,3);
		//add collection at end of the list
		assertTrue(newSet.addAll(1, testSet));
		//check that 3 is at index 
		assertEquals(3, newSet.get(1));
				
	}
}

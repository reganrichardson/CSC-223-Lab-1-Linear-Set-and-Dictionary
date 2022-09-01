package utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Test ArraySet Class
 * @author ReganRichardson
 *
 */
class ArraySetTest

{
	/**
	 * Helper method, populates new arraySet
	 * @return
	 */
	public ArraySet<Integer> getPopulated(){
		//Create array list with elements 1,2,3,4
		List<Integer> lst = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		//create array set using list as a collection
		ArraySet<Integer> s = new ArraySet<Integer>(lst);
		//return Array set
		return s;
	}
	
	/**
	 * Tests newSet from ArraySet class
	 */
	@Test
	void testnewSetCollectionOfE()
	{
		//Test 1: Initialize with a collection with no repeated values
		//Create ArraySet and call getPopulated
		ArraySet<Integer> colSet = getPopulated();
		//Check that there are 4 elements in set
		assertEquals(4, colSet.size());
		
		//Test 2: Initialize with a collection containing repeated values
		//Create a list with repeated values
		List<Integer> lst = new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2));
		//Create an arrayset with list values
		ArraySet<Integer> s = new ArraySet<Integer>(lst);
		//check that only 4 elements are in set
		assertEquals(4, s.size());
	}

	/**
	 * Tests Add method
	 */
	@Test
	void testAddE()
	{
		//create new arrayset, and call getpopulated
		ArraySet<Integer> newSet = getPopulated();
		
		//Test 1: Adding an element that is not in the array- should be true
		//add an element not in mewSet, should be true
		assertTrue(newSet.add(5));
		//check that the size of the array is now 5
		assertEquals(5,newSet.size());
		
		//Test 2: Attempting to add an element that is in the array- should be false
		//Try adding 5
		assertFalse(newSet.add(5));
	}

	/**
	 * Test addAll method
	 */
	@Test
	void testAddAllCollectionOfQextendsE()
	{
		//create new arraySet, and call getPopulated
		ArraySet<Integer> newSet = getPopulated();
		//Create newLst with elements not in newSet
		List<Integer> newLst = new ArrayList<Integer>(Arrays.asList(5,6));
		
		//Test 1: Add when test set contains some new elements- should be true
		//add newLst
		assertTrue(newSet.addAll(newLst));
		//check that there are 6 things in new set
		assertEquals(6, newSet.size());
		
		//Test 2: Add when collection contains no new elements- should be false
		//try adding newLst again
		assertFalse(newSet.addAll(newLst));
		//there should still be 6 things in new set
		assertEquals(6, newSet.size());
		
		
	}
	/**
	 * Test retain all method
	 */
	@Test
	void testRetainAll()
	{
		ArraySet<Integer> newSet = getPopulated();
		
		//Test 1: retain all- should be false
		List<Integer> newLst = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		assertFalse(newSet.retainAll(newLst));
		//check that newSet size is now 4
		assertEquals(4, newSet.size());
		
		//Test 2: retain some elements - should be true
		//build second collection with some elements from newSet
		List<Integer> twoLst = new ArrayList<Integer>(Arrays.asList(1,2));
		
		//only some elements should remain- should be true
		assertTrue(newSet.retainAll(twoLst));
		//check that there are 2 elements in the set
		assertEquals(2, newSet.size());
		
		//Test 4: retain none when testSet- should be true
		ArraySet<Integer> testSet = getPopulated();
		List<Integer> threeLst = new ArrayList<Integer>(Arrays.asList(5,6));
		//test that nothing is retained
		assertTrue(testSet.retainAll(threeLst));
		//check that newSet size is now 0
		assertEquals(0, testSet.size());
		
	}
	/**
	 * Test removeAll method
	 */
	@Test
	void testRemoveAll()
	{
		ArraySet<Integer> newSet = new ArraySet<Integer>();;
		
		//Test 1: Remove on an empty set- should be false
		assertFalse(newSet.removeAll(newSet));
		
		//Test 2: Remove no elements- should be false
		newSet = getPopulated();
		List<Integer> newLst = new ArrayList<Integer>(Arrays.asList(5,6));
		//Remove Lst from arraySet
		assertFalse(newSet.removeAll(newLst));
		//check that newSet size is now 4
		assertEquals(4, newSet.size());
				
		//Test 3: Remove some elements- should be true
		List<Integer> twoLst = new ArrayList<Integer>(Arrays.asList(1,2));
		//Remove testSet from newSet
		assertTrue(newSet.removeAll(twoLst));
		//check that newSet size is now 3
		assertEquals(2, newSet.size());
		
		//Test 4: Remove all elements- should be true
		 List<Integer> threeLst = new ArrayList<Integer>(Arrays.asList(3,4));
		//should return true
		assertTrue(newSet.removeAll(threeLst));
		//check that newSet size is now 0
		assertEquals(0, newSet.size());
		
		
		
		
	}
	/**
	 * Test AllAll with given index
	 */
	@Test
	void testAddAllIntCollectionOfQextendsE()
	{
		//Create list containing elements not in getPopulate
		List<Integer> newLst = new ArrayList<Integer>(Arrays.asList(5,6));
		
		//Test 1: Add collection at index 0
		//create new set
		ArraySet<Integer> newSet = getPopulated();
		//add newLst at index 0
		assertTrue(newSet.addAll(0, newLst));
		//check that 5 is at index 0
		assertEquals(5, newSet.get(0));
		
		//Test 2: Add collection to set at end of list
		//create new set
		ArraySet<Integer> twoSet = getPopulated();
		//add collection at end of the list
		assertTrue(twoSet.addAll(twoSet.size(), newLst));
		//check that 6 is at last index 
		assertEquals(6, twoSet.get(twoSet.size()-1));
		
		//Test 3: Add collection to set in the middle of list
		//create new set
		ArraySet<Integer> threeSet = getPopulated();
		//add collection at index 1
		assertTrue(threeSet.addAll(1, newLst));
		//check that 5 is at index 1
		assertEquals(5, threeSet.get(1));
				
	}
}

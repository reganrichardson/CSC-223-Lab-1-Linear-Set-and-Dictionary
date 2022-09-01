package utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class ParallelArrayDictionaryTest
{

	
	
	@Test
	void testParallelArrayDictionary( )
	{
		
		
	}
	

	
	@Test
	void testGet()
	{
		//create a test dictionary
		
		ParallelArrayDictionary<Integer, String> _dictionaryTest = new ParallelArrayDictionary<Integer, String>();
		
		
		//put elements in the dictionary
		_dictionaryTest.put( 1 , "A");
		
		//check the return from the get method to the known first element
		assertEquals ( "A", _dictionaryTest.get(1));

		//test with a set of one element
		_dictionaryTest.put( 2 , "B");
		
		assertEquals ( "B", _dictionaryTest.get(2));
		
		//test with a set of three elements
		assertEquals ( null, _dictionaryTest.get(3));
		
	}

	@Test
	void testPut()
	{
		//create a test dictionary
				
		ParallelArrayDictionary<Integer, String> _dictionaryTest = new ParallelArrayDictionary<Integer, String>();
				
		//test with one element
		_dictionaryTest.put(1, "A");
		
		//test the size after adding an element
		assertEquals(1 , _dictionaryTest.size());
		
		//test with a key that already exists
		_dictionaryTest.put(1 , "B");
		assertEquals(2 , _dictionaryTest.size());
		
		//test with a value that already exists
		_dictionaryTest.put(3, "A");
		assertEquals(2, _dictionaryTest.size());
	}

	
	
	@Test
	void testRemove()
	{
		//create a test dictionary

				
		ParallelArrayDictionary<Integer, String> _dictionaryTest = new ParallelArrayDictionary<Integer, String>();
				
		//test with an empty set
		assertSame ( null ,_dictionaryTest.remove(1));
		
		//add an element to the dictionary
		_dictionaryTest.put(1, "A");
		
		assertEquals("A" , _dictionaryTest.remove(1));
		
		
		
	}

	@Test
	void testPutAll()
	{
		
		
	}

	
	@Test
	void testClear()
	{

		
		ParallelArrayDictionary<Integer, String> _dictionaryTest = new ParallelArrayDictionary<Integer, String>();
		//test on an already empty set
		
		//_dictionaryTest.put(1, "A");
		
		assertEquals(0 , _dictionaryTest.size());

		
		//add some elements
		
		//then clear again and check the size of the set
		
	}
}

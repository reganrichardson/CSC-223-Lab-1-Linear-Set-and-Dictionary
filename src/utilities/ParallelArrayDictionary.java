package utilities;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ParallelArrayDictionary<Key , Value> implements Map<Key, Value>
{
	
	
	//Parallel array-based implementation
	
	protected ArraySet<Key> _keys;
	protected ArrayList<Value> _values;
	
	

	public ParallelArrayDictionary()
	{
		// TODO Auto-generated constructor stub this is silly
	}



	@Override
	public int size() {
		// TODO Auto-generated method stub
		//find the size of the key and returning 
		return _keys.size();
	}



	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		//see if keys is empty and returning
		return _keys.isEmpty();
	}



	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		//see if the input key is in the _keys set and returning a boolean
		return _keys.contains(key);
	}



	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		//checks to see if the value is in list and returns a boolean
		//
		return _values.contains(value);
	}


	//THIS NEEDS HELP
	@Override
	public Value get(Object key) {
		// TODO Auto-generated method stub
		//check if the key is in the dictionary
		//if(_values.contains(key)){
			//find the index at the keys list
			
			//find the value at in the values list at the index and return
			
			
		//}
		//if not return null
		//else{
		return null;
		//}
	}



	@Override
	public Value put(Key key, Value value) {
		// TODO Auto-generated method stub
		
		return null;
	}



	@Override
	public Value remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void putAll(Map<? extends Key, ? extends Value> m) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void clear() {
		// TODO Auto-generated method stub
		//clear both keys and values
		_keys.clear();
		_values.clear();
		
	}



	@Override
	public Set<Key> keySet() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Collection<Value> values() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Set<Entry<Key, Value>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}

package utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ArraySet<E> implements Set<E>
{

	protected ArrayList<E> _List;
	public ArraySet()
	{
		_List = new ArrayList<E>();
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return _List.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return _List.isEmpty();
	}
	
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return _List.contains(o);
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return _List.iterator();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return _List.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return _List.toArray(a);
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		if (_List.contains(e)) {
			return false;
		}
		else {
			return _List.add(e);
		}	
	}	

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return _List.remove(o);
	}
	///////////

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		//loop through elements in collection
		//for element in collection
		//if not contained in list return false
		//if all are contained in list return true
		
		
		return _List.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		//loop through elements in collection
		//if element is in list add nothing
		//if element is not in list add element
		//if anything has been added return true
		//if nothing has been added return false
		
		
		return false;
		// TODO Auto-generated method stub
		
		}
	

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		//loop through elements in collect
		//if an element in the list is not in the collection, remove it
		//return true
		//if no elements are deleted
		//return false
		return _List.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		//loop through collection
		//if an element in the list is in the collection remove it
		//return true
		//if nothing is removed return false
		return _List.removeAll(c);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		_List.clear();
	}

		
	

}

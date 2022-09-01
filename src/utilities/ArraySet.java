package utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Spliterator;

/**
 * creates ArrauSet methods
 * @author ReganRichardson
 *
 * @param <E>
 */
public class ArraySet<E> implements List<E>, Set<E>
{
	protected ArrayList<E> _List;
	
	/**
	 * Initializes list
	 */
	public ArraySet() {
		//create new arrayList of type E
	_List = new ArrayList<E>(); 
	}
	/**
	 * Initializes set with given collection
	 * @param c
	 */
	public ArraySet(Collection<? extends E> c) {
		//call ArraySet constructor
		this();
		//loop through elements in c
		for (E item : c) {		
			//if element is already in the arraySet do nothing
			if (_List.contains(item)){
			}
			//if the element is not in the set, add it
			else {
				_List.add(item);
			}
		}
	}
	
	/**
	 * implements addAll for List<E>
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		//return addAll from arrayList
		return _List.addAll(index, c);
	}

	/**
	 * returns element at index
	 */
	@Override
	public E get(int index) {
		//return get from arrayList
		return _List.get(index);
	}
	
	/**
	 * sets index to given elements
	 */
	@Override
	public E set(int index, E element) {
		// return set from arrayList
		return _List.set(index, element);
	}
	/**
	 * adds given element at index
	 */
	@Override
	public void add(int index, E element) {
		//call add from arrayList and return
		_List.add(index, element);
	}
	/**
	 * removes element at index
	 */
	@Override
	public E remove(int index) {
		// call remove from arrayList and return
		return _List.remove(index);
	}
	/**
	 * return index of a specific object in array the first time it occurs
	 */
	@Override
	public int indexOf(Object o) {
		// call index of from arrayList and return
		return _List.indexOf(o);
	}

	/**
	 * return index of a specific element in array the last time it occurs
	 */
	@Override
	public int lastIndexOf(Object o) {
		// call lastIndex of from arrayList and return
		return _List.lastIndexOf(o);
	}
	/**
	 * returns iterator over list
	 */
	@Override
	public ListIterator<E> listIterator() {
		// call list iterator
		return _List.listIterator();
	}

	/**
	 * returns iterator over the list in proper order starting at index
	 */
	@Override
	public ListIterator<E> listIterator(int index) {
		// call listIterator with index
		return _List.listIterator(index);
	}

	/**
	 * returns a sublist of a list between two indices
	 */
	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// call subList
		return _List.subList(fromIndex, toIndex);
	}
	
	/**
	 * returns the size of the set
	 */
	@Override
	public int size() {
		// call size and return
		return _List.size();
	}
	/**
	 * checks if array is empty
	 */
	@Override
	public boolean isEmpty() {
		// call isEmpty and return
		return _List.isEmpty();
	}
	
	/**
	 * checks if o is in the set
	 */
	@Override
	public boolean contains(Object o) {
		// call contains and return
		return _List.contains(o);
	}
	/**
	 * returns iterator over elements in list in proper order
	 */
	@Override
	public Iterator<E> iterator() {
		// call and return iterator
		return _List.iterator();
	}

	/**
	 * returns an array contains all elements in the list in proper sequence
	 */
	@Override
	public Object[] toArray() {
		//call toArray
		return _List.toArray();
	}
	/**
	 * Returns an array containing all of the elements in this list in proper sequence in array a
	 */
	@Override
	public <T> T[] toArray(T[] a) {
		// call toArray with param a
		return _List.toArray(a);
	}
	/**
	 * Adds element to set if not already there
	 */
	@Override
	public boolean add(E e) {
		//if set contains e return false
		if (_List.contains(e)) {
			return false;
		}
		//if set does not contain e, add it and return
		else {
			return _List.add(e);
		}	
	}	

	/**
	 * removes item from set
	 */
	@Override
	public boolean remove(Object o) {
		// call remove
		return _List.remove(o);
	}
	
	/**
	 * Returns true if the set contains all items in c
	 */
	@Override
	public boolean containsAll(Collection<?> c) {
		//call containsAll
		return _List.containsAll(c);
		
		
	}
	/**
	 * add all elements in a collection that do not already exist in the arraySet
	 */
	@Override
	public boolean addAll(Collection<? extends E> c) {
		//create boolean temp variable
		//Integer size = size();
		boolean change = false;	

		for (E item : c) {		
		//if element is in list add nothing
			if (_List.contains(item)){
			}
			else {
				_List.add(item);
				change = true;
			}
		}
			return change;
	}
	
	/**
	 * retain all elements in our set that are contained in c
	 */
	@Override
	public boolean retainAll(Collection<?> c) {
		// call retainAll and return
		return _List.retainAll(c);
	}
	/**
	 * remove all elements from a collection in a set
	 */
	@Override
	public boolean removeAll(Collection<?> c) {
		// call removeAll
		return _List.removeAll(c);
	}
	/**
	 * Clear arrayset
	 */
	@Override
	public void clear() {
		// clear set
		_List.clear();
	}
	/**
	 * creates a spliterator over the elements of a list
	 */
	@Override
	public Spliterator<E> spliterator() {
		// call spliterator from arraylist and return
		return List.super.spliterator();
	}	
	

}

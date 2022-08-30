package utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Spliterator;

public class ArraySet<E> implements List<E>, Set<E>
{
	protected ArrayList<E> _List;
	
	public ArraySet() {
	_List = new ArrayList<E>(); 
	}
	
	public ArraySet(Collection<? extends E> c) {
		for (E item : c) {
			if (_List.contains(item)) {
				}
			else {
				_List.add(item);
			}
		}
	}
	
	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return _List.addAll(index, c);
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return _List.get(index);
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return _List.set(index, element);
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		_List.add(index, element);
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return _List.remove(index);
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return _List.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return _List.lastIndexOf(o);
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return _List.listIterator();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return _List.listIterator(index);
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return _List.subList(fromIndex, toIndex);
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
		return _List.containsAll(c);
		
		
	}

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
	

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return _List.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return _List.removeAll(c);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		_List.clear();
	}

	@Override
	public Spliterator<E> spliterator() {
		// TODO Auto-generated method stub
		return List.super.spliterator();
	}	
	

}

package nireLinkedList;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import nireLinkedList.NireLinkedList.NireIteradorea;



public class NireLinkedList<E> implements List<E>, Deque<E> {
	private NodoBikoitz lehena;
	private NodoBikoitz azkena;
	private int tamaina;


	private class NodoBikoitz {
		E datua; 
		NodoBikoitz aurrekoa;
		NodoBikoitz hurrengoa;

		public NodoBikoitz(E e) {
			this.datua = e;
			this.aurrekoa = null;
			this.hurrengoa = null;
		}
	}

	public class NireIteradorea implements Iterator<E> {
		private NodoBikoitz unekoa;

		public NireIteradorea(NireLinkedList<E> lista) {
			unekoa = lista.lehena;
		}

		public boolean hasNext() {
			return (unekoa != null);
		}

		public E next() {
			E lag = unekoa.datua;
			unekoa = unekoa.hurrengoa;
			return lag;
		}
	}

	public NireLinkedList() {
		this.lehena = null;
		this.azkena = null;
		this.tamaina = 0;
	}
	
	@Override
	public void addFirst(E arg0) {
		NodoBikoitz berria = new NodoBikoitz(arg0);
		if(this.lehena!=null) {
			berria.hurrengoa=lehena;
			lehena.aurrekoa=berria;
			this.azkena = berria;
			
		}else {
			this.lehena=berria;
			this.azkena = berria;
		}
	
	}

	@Override
	public void addLast(E arg0) {
		NodoBikoitz berria2 = new NodoBikoitz(arg0);
		
		if(this.lehena!=null) {
			berria2.aurrekoa=this.azkena;
			this.azkena.hurrengoa=berria2;
			this.azkena=berria2;
			
		}else {
			this.lehena=berria2;
			this.azkena=berria2;
		}
		
		
		
	}	
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return tamaina;
	}


	@Override
	public int lastIndexOf(Object arg0) {
		
		int index=0;
		NodoBikoitz lag = lehena;
		while(lag!=null) {
			if(lag.datua==arg0) {
				return index;	
			}
			index++;
			lag=lag.hurrengoa;
		}
		return -1;
	
		
		
		
		
		
	}

	public void inprimatu() {
		System.out.print("< ");
//		NodoBikoitz unekoa = this.lehena;
//		while (unekoa != null) {
//			System.out.print(unekoa.datua + " ");
//			unekoa = unekoa.hurrengoa;
//		}
		for (E e : this) {
			System.out.print(e + " ");
		}
		System.out.println(" >");
	}

	@Override
	public Iterator<E> iterator() {
		return new NireIteradorea(this);
	}

	@Override
	public Iterator<E> descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean offer(E arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offerFirst(E arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offerLast(E arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peekLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pollLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(E arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeFirstOccurrence(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeLastOccurrence(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(E arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int arg0, E arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends E> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E set(int arg0, E arg1) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<E> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}

package ood.lewisu.iterator.pattern.collection.impl;

import ood.lewisu.iterator.pattern.collection.Collection;
import ood.lewisu.iterator.pattern.iterator.Iterator;

public class CollectionImpl implements Collection {
	
	
	String inputArr[] = {"Rayon","Synthetic","Cashmere","Linen"};
	@Override
	public Iterator getIterator() {
		return new Itr();
		
	}
	
	private class Itr implements Iterator{
		
		int index =0;

		@Override
		public boolean hasNext() {
			if(index < inputArr.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext())
				return inputArr[index++];
			return null;
		}
		
	}

}

package ood.lewisu.iterator.pattern.client;

import ood.lewisu.iterator.pattern.collection.impl.CollectionImpl;
import ood.lewisu.iterator.pattern.iterator.Iterator;

public class IteratorClientTest {

	public static void main(String[] args) {
		
		CollectionImpl collectionImpl = new CollectionImpl();
		Iterator iterator = collectionImpl.getIterator();
		
		while (iterator.hasNext()) {
			Object object = iterator.next();
			String name =(String)object;
			System.out.println("Fabrics that are available other than Cotton, Wool, Polyester, Fabric Name:: "+name);
		}
		
		
	}

}

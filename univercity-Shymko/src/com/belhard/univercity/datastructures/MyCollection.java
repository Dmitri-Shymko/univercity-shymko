package com.belhard.univercity.datastructures;

public interface MyCollection {
	int size();

	boolean add(Object obj);

	boolean remove(Object obj);

	boolean contains(Object obj);

	Object get(int index);

	Object[] toArray();
}

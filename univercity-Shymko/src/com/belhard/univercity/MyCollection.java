package com.belhard.univercity;

public interface MyCollection {
	int size();

	boolean add(Object obj);

	boolean remove(Object obj);

	boolean contains(Object obj);

	Object get(int index);

	Object[] toArray();
}

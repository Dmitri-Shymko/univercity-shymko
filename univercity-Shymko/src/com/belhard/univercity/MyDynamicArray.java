package com.belhard.univercity;

import java.util.Arrays;
import java.util.Objects;

public class MyDynamicArray implements MyCollection {
	private Object[] array = new Object[8];
	private int size;

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean add(Object obj) {
		if (size >= array.length) {
			array = Arrays.copyOf(array, array.length * 2);
		}
		array[size++] = obj;
		return true;

	}

	@Override
	public boolean remove(Object obj) {
		boolean isDelited = false;
		int initialNumber = size;
		for (int i = 0; i < initialNumber; i++) {
			if (!isDelited && array[i].equals(obj)) {
				array[i] = null;
				size--;
				isDelited = true;
			}
			if (isDelited && i < array.length - 1) {
				array[i] = array[i + 1];
			}
			if (isDelited && i == array.length - 1) {
				array[i] = null;
			}

		}
		return false;
	}

	@Override
	public boolean contains(Object obj) {
		for (int i = 1; i < size; i++) {
			if (array[i].equals(obj)) {
				return true;
			}
		}
		return false;

	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(array);
		result = prime * result + Objects.hash(size);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDynamicArray other = (MyDynamicArray) obj;
		return Arrays.deepEquals(array, other.array) && size == other.size;
	}
	
}

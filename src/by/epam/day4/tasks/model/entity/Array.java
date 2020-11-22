package by.epam.day4.tasks.model.entity;

import java.util.Arrays;

public class Array {
    private int[] arr;

    public Array(int size) {
        arr = new int[size];
    }

    public Array(int... arr) {
        setArr(arr);
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getElement(int index) {
        if (index >= arr.length) {
            throw new IndexOutOfBoundsException("invalid index");
        }
        return arr[index];
    }

    public void setElement(int index, int value) {
        if (index >= arr.length) {
            throw new IndexOutOfBoundsException("invalid index");
        }
        arr[index] = value;
    }

    public boolean contains(int element) {
        for (int i = 0; i < size(); i++) {
            if (element == getElement(i)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return arr.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return Arrays.equals(getArr(), array.getArr());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getArr());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Array{");
        sb.append(Arrays.toString(arr));
        sb.append('}');
        return sb.toString();
    }
}

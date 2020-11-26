package by.epam.day4.model.entity;

import java.util.Arrays;

public class IntegerArray {
    private int[] arr;

    public IntegerArray(int size) {
        arr = new int[size];
    }

    public IntegerArray(int... arr) {
        setArr(arr);
    }

    public int[] getArr(){
        return arr.clone();
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getElement(int index) {
        if (index >= arr.length || index < 0) {
            throw new IndexOutOfBoundsException("invalid index");
        }
        return arr[index];
    }

    public void setElement(int index, int value) {
        if (index >= arr.length || index < 0) {
            throw new IndexOutOfBoundsException("invalid index");
        }
        arr[index] = value;
    }

    public int size() {
        return arr.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerArray integerArray = (IntegerArray) o;
        if (size() != integerArray.size() || hashCode() != integerArray.hashCode()){
            return false;
        }
        for (int i = 0; i < size(); i++) {
            if (getElement(i) != integerArray.getElement(i)){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Array{");
        sb.append(Arrays.toString(arr));
        sb.append('}');
        return sb.toString();
    }
}

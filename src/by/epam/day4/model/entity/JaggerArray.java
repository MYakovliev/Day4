package by.epam.day4.model.entity;

import java.util.Arrays;

public class JaggerArray {
    Array[] jaggerArray;

    public JaggerArray(int rows){
        jaggerArray = new Array[rows];
    }

    public JaggerArray(int rows, int cols){
        jaggerArray = new Array[rows];
        for (int i = 0; i < rows; i++) {
            jaggerArray[i] = new Array(cols);
        }
    }

    public int size(){
        return jaggerArray.length;
    }

    public Array[] getJaggerArray() {
        return jaggerArray;
    }

    public void setJaggerArray(Array[] jaggerArray) {
        this.jaggerArray = jaggerArray;
    }

    public Array getElement(int row){
        return jaggerArray[row];
    }

    public int getElement(int row, int col){
        return jaggerArray[row].getElement(col);
    }

    public void setElement(int row, Array array){
        if (row >= jaggerArray.length || row < 0) {
            throw new IndexOutOfBoundsException("invalid row index");
        }
        jaggerArray[row] = array;
    }

    public void setElement(int row, int col, int value){
        if (row >= jaggerArray.length || row < 0) {
            throw new IndexOutOfBoundsException("invalid row index");
        }
        jaggerArray[row].setElement(col, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JaggerArray that = (JaggerArray) o;
        return Arrays.equals(getJaggerArray(), that.getJaggerArray());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getJaggerArray());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JaggerArray{").append("\n");
        for (Array array: jaggerArray){
            sb.append(array).append("\n");
        }
        sb.append('}');
        return sb.toString();
    }

}

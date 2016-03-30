package com.cognitree.exercise.model;

public class Row {
    private String name;
    private ColumnIterator iterator;

    public Row(String name, ColumnIterator iterator) {
        this.name = name;
        this.iterator = iterator;
    }

    public ColumnIterator iterator() {
        return iterator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Row row = (Row) o;

        return !(name != null ? !name.equals(row.name) : row.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Row{" +
                "name='" + name + '\'' +
                '}';
    }
}

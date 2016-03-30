package com.cognitree.exercise.model;

public class Column {
    private String key;
    private String value;

    public Column(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key.trim();
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getStringValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getIntValue() throws NumberFormatException{
        return Integer.parseInt(value);
    }

    public float getFloatValue() throws NumberFormatException{
        return Float.parseFloat(value);
    }

    public double getDoubleValue() throws NumberFormatException{
        return Double.parseDouble(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Column column = (Column) o;

        if (key != null ? !key.equals(column.key) : column.key != null) return false;
        return !(value != null ? !value.equals(column.value) : column.value != null);

    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Column{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

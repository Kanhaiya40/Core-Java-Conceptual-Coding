package com.cognitree.samples.resourcedelegator.lib;


import java.lang.reflect.Method;
import java.util.HashMap;

class Node {
    private String str;
    private HashMap<String, Node> childNodes = new HashMap<String, Node>();
    private Object object;

    public Node() {
    }

    public Node(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public HashMap<String, Node> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(HashMap<String, Node> childNodes) {
        this.childNodes = childNodes;
    }
}
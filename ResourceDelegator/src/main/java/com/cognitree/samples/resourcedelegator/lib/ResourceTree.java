package com.cognitree.samples.resourcedelegator.lib;

import java.util.HashMap;

public class ResourceTree {
    private Node root = new Node();

    public void insert(String path, Object object) {
        if (path.isEmpty()) {
            return;
        }
        String[] parts = path.split("/");
        HashMap<String, Node> childNodes = root.getChildNodes();
        Node node = null;
        for (String part : parts) {
            if (part.startsWith("{") && part.endsWith("}")) {
                part = "*";
            }
            if (childNodes.containsKey(part)) {
                node = childNodes.get(part);
            } else {
                node = new Node(part);
                childNodes.put(part, node);
            }
            childNodes = node.getChildNodes();
        }
        if (node != null) {
            node.setObject(object);
        }
    }

    public Object search(String path) {
        if (path.isEmpty()) {
            return null;
        }
        String[] parts = path.split("/");
        HashMap<String, Node> childNodes = root.getChildNodes();
        Node node = null;
        Object obj = null;
        for (String part : parts) {
            if (childNodes.containsKey(part)) {
                node = childNodes.get(part);
                childNodes = node.getChildNodes();
                if (node.getObject() != null)
                    obj = node.getObject();
            } else if (childNodes.containsKey("*")) {
                node = childNodes.get("*");
                childNodes = node.getChildNodes();
                if (node.getObject() != null)
                    obj = node.getObject();
            } else if (node != null && node.getObject() != null) {
                return node.getObject();
            } else {
                return null;
            }
        }
        if (node != null && node.getObject() != null) {
            obj = node.getObject();
        }
        return obj;
    }
}
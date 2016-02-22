package com.cognitree.samples.resourcedelegator.core;

import com.cognitree.samples.resourcedelegator.lib.ResourceTree;
import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;

public class ResourceDelegator extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(ResourceDelegator.class);
    private final ResourceTree getResourceTree = new ResourceTree();
    private final ResourceTree postResourceTree = new ResourceTree();
    private final ResourceTree putResourceTree = new ResourceTree();
    private final ResourceTree deleteResourceTree = new ResourceTree();

    @Override
    public void init() throws ServletException {
        String packageName = this.getServletContext().getInitParameter("resource.package.name");
        logger.info("Package Name : {}", packageName);
        Reflections reflections = new Reflections(new ConfigurationBuilder().setUrls(
                ClasspathHelper.forPackage(packageName)).setScanners(
                new MethodAnnotationsScanner()));
        Set<Method> methodSet = reflections.getMethodsAnnotatedWith(GET.class);
        initializeResourceTree(methodSet, getResourceTree);
        methodSet = reflections.getMethodsAnnotatedWith(PUT.class);
        initializeResourceTree(methodSet, putResourceTree);
        methodSet = reflections.getMethodsAnnotatedWith(POST.class);
        initializeResourceTree(methodSet, postResourceTree);
        methodSet = reflections.getMethodsAnnotatedWith(DELETE.class);
        initializeResourceTree(methodSet, deleteResourceTree);
    }

    private void initializeResourceTree(Set<Method> methodSet, ResourceTree tree) {
        for (Method method : methodSet) {
            String value = getAnnotationValue(method);
            if (value != null)
                tree.insert(value, method);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        Method method = (Method) getResourceTree.search(path);
        if (method == null) {
            resp.sendError(404, "Resource Not Found");
        }
        resp.getWriter().print(method);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        Method method = (Method) postResourceTree.search(path);
        if (method == null) {
            resp.sendError(404, "Resource Not Found");
        }
        resp.getWriter().print(method);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        Method method = (Method) putResourceTree.search(path);
        if (method == null) {
            resp.sendError(404, "Resource Not Found");
        }
        resp.getWriter().print(method);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        Method method = (Method) deleteResourceTree.search(path);
        if (method == null) {
            resp.sendError(404, "Resource Not Found");
        }
        resp.getWriter().print(method);
    }

    private String getAnnotationValue(Method method) {
        Annotation[] annotations = method.getDeclaredAnnotations();
        String value = null;
        for (Annotation annotation : annotations) {
            if (annotation instanceof Path) {
                value = ((Path) annotation).value();
            } else if (annotation instanceof GET) {
                value = ((GET) annotation).value();
            } else if (annotation instanceof PUT) {
                value = ((PUT) annotation).value();
            } else if (annotation instanceof POST) {
                value = ((POST) annotation).value();
            } else if (annotation instanceof DELETE) {
                value = ((DELETE) annotation).value();
            }
        }
        return value;
    }

//    public static void main(String[] args) {
//        String input = "/a/{val}/b/{val1}";
//        Pattern p = Pattern.compile("\\{(.*?)\\}");
//        Matcher m = p.matcher(input);
//        while(m.find())
//        {
//            System.out.println(m.group());
//        }
//
//    }
}

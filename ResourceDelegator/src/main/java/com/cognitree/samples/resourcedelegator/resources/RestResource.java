package com.cognitree.samples.resourcedelegator.resources;

import com.cognitree.samples.resourcedelegator.core.GET;
import com.cognitree.samples.resourcedelegator.core.POST;
import com.cognitree.samples.resourcedelegator.core.PathParam;

public class RestResource {

    @GET("/a")
    private void a() {

    }

    @GET("/a/b")
    private void ab() {

    }

    @GET("/a/b/c")
    private void abc() {

    }

    @POST("/b/d")
    private void bd() {

    }

    @POST("/b/d/{value}")
    private void bdValue(@PathParam("value") String val) {

    }
}

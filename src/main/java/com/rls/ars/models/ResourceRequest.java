package com.rls.ars.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

public class ResourceRequest {

    @JsonProperty("query")
    private ResourceMetadataRequest resourceMetadataRequest;

    @JsonProperty("distance")
    @Valid
    private ResourceLocationRequest resourceLocationRequest;


    public ResourceLocationRequest getResourceLocationRequest() {
        return resourceLocationRequest;
    }

    public void setResourceLocationRequest(ResourceLocationRequest resourceLocationRequest) {
        this.resourceLocationRequest = resourceLocationRequest;
    }

    public ResourceMetadataRequest getResourceMetadataRequest() {
        return resourceMetadataRequest;
    }

    public void setResourceMetadataRequest(ResourceMetadataRequest resourceMetadataRequest) {
        this.resourceMetadataRequest = resourceMetadataRequest;
    }

    @Override
    public String toString() {
        return "ResourceRequest{" +
                "resourceMetadataRequest=" + resourceMetadataRequest +
                ", resourceLocationRequest=" + resourceLocationRequest +
                '}';
    }
}

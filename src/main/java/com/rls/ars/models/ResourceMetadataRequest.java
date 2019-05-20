package com.rls.ars.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class ResourceMetadataRequest {
    @JsonProperty("match")
    private JsonNode match;
    @JsonProperty("except")
    private JsonNode except;
    @JsonProperty("range")
    private JsonNode range;

    public JsonNode getMatch() {
        return match;
    }

    public void setMatch(JsonNode match) {
        this.match = match;
    }

    public JsonNode getExcept() {
        return except;
    }

    public void setExcept(JsonNode except) {
        this.except = except;
    }

    public JsonNode getRange() {
        return range;
    }

    public void setRange(JsonNode range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "ResourceMetadataRequest{" +
                "match=" + match +
                ", except=" + except +
                ", range=" + range +
                '}';
    }
}

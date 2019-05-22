package com.rls.ars.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ResourceLocationRequest {

    private static final String unitRegexp = "^(m|km|ft|mi)";

    @JsonProperty("latitude")
    @NotNull(message = "No distance.latitude provided.")
    private Double lat;

    @JsonProperty("longitude")
    @NotNull(message = "No distance.longitude provided.")
    private Double lon;

    @JsonProperty("radius")
    @NotNull(message = "No distance.radius provided.")
    private Double radius;

    @JsonProperty("unit")
    @NotBlank(message = "No distance.unit provide.")
    @Pattern(regexp = unitRegexp, message = "Invalid unit provided.")
    private String unit;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "ResourceLocationRequest{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", radius=" + radius +
                ", unit='" + unit + '\'' +
                '}';
    }
}

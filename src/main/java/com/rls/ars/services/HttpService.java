package com.rls.ars.services;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.rls.ars.models.ResourceLocationRequest;
import com.rls.ars.models.ResourceMetadataRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HttpService {

    private static final Logger logger = LoggerFactory
            .getLogger(HttpService.class);

    public HttpResponse<JsonNode> getLocationResponse(ResourceLocationRequest aResourceLocationRequest , String aUrl, String aDomain) throws UnirestException {
        return Unirest.get(aUrl)
                .header("RLS-Referrer", aDomain)
                .queryString("lat", aResourceLocationRequest.getLat())
                .queryString("lon", aResourceLocationRequest.getLon())
                .queryString("radius", aResourceLocationRequest.getRadius())
                .queryString("unit", aResourceLocationRequest.getUnit())
                .asJson();
    }

    public HttpResponse<JsonNode> getMetadataResponse(ResourceMetadataRequest aResourceMetadataRequest, String aUrl, String aDomain) throws UnirestException {
        System.out.println(aResourceMetadataRequest.toString());
        return Unirest.post(aUrl)
                .header("RLS-Referrer", aDomain)
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(aResourceMetadataRequest.toString())
                .asJson();
    }

}

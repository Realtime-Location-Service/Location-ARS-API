package com.rls.ars.controllers;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.rls.ars.configs.AppConfig;
import com.rls.ars.exceptions.MissingHeaderException;
import com.rls.ars.models.ResourceLocationRequest;
import com.rls.ars.models.ResourceMetadataRequest;
import com.rls.ars.models.ResourceRequest;
import com.rls.ars.services.HttpService;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class ResourceController {

    private static final Logger logger = LoggerFactory
            .getLogger(ResourceController.class);

    @Autowired
    AppConfig appConfig;

    @Autowired
    HttpService httpService;

    @PostMapping("/available-resources")
    @ResponseBody
    public Object getAvailableResources(@RequestHeader("RLS-Referrer") String aDomain, @Valid @RequestBody ResourceRequest aResourceRequest) throws UnirestException, JSONException {

        if (aDomain == null || aDomain.isEmpty())
            throw new MissingHeaderException("RLS-Referrer header is not present");
        if (aResourceRequest.getResourceLocationRequest() == null)
            throw new HttpMessageNotReadableException("Distance can not be empty");

        ResourceLocationRequest aResourceLocationRequest = aResourceRequest.getResourceLocationRequest();
        ResourceMetadataRequest aResourceMetadataRequest = aResourceRequest.getResourceMetadataRequest();

//        System.out.println("HRERERER");
        System.out.println(aResourceRequest);
        HttpResponse<JsonNode> aLocationResponse = httpService.getLocationResponse(aResourceLocationRequest, appConfig.getPingServiceUrl(), aDomain);

        System.out.println(aLocationResponse.getStatus());
        System.out.println(aLocationResponse.getBody().toString());
//        System.out.println("HRERERER 232");
//        HttpResponse<JsonNode> aMetadataResponse =  httpService.getMetadataResponse(aResourceMetadataRequest, appConfig.getMetadataServiceUrl(), aDomain);

        return "Hola";
    }

}

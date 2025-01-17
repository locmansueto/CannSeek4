/*
 * BrAPI implementation for PIPPA
 * A first draft implementation of the breeding API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.brapi.client.api;

import org.brapi.client.ApiException;
import org.brapi.client.model.StudyResult;
import org.brapi.client.model.StudySearchResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StudyApi
 */
@Ignore
public class StudyApiTest {

    private final StudyApi api = new StudyApi();

    
    /**
     * Returns a list of studies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void studyDetailsTest() throws ApiException {
        String studyDbId = null;
        StudyResult response = api.studyDetails(studyDbId);

        // TODO: test validations
    }
    
    /**
     * Returns a list of studies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void studySearchTest() throws ApiException {
        List<String> germplasmDbIds = null;
        StudySearchResult response = api.studySearch(germplasmDbIds);

        // TODO: test validations
    }
    
}

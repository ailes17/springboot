package com.tx.child1;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = "application/json")
public class HealthCheckController {

    @RequestMapping(method = RequestMethod.GET, value = "/health-check-child1")
    @ResponseBody
    public List<HttpStatus> bffHealthCheck() {
        return Arrays.asList(HttpStatus.OK);
    }
    
}
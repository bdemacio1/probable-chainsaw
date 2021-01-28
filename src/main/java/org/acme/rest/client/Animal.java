package org.acme.rest.client;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Animal {

    public String name;
    public String color;
    public String size;
}
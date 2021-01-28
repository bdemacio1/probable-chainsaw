package org.acme.rest.client;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;

import java.util.Set;
import javax.ws.rs.Path;
import java.util.concurrent.CompletionStage;

@Path("/animalResource")
public class AnimalsResource {

    public AnimalsResource(){
        //animalsService = new AnimalsService();
    }

    @Inject
    @RestClient
    AnimalsService animalsService;

    @GET
    public Set<Animal> all() {
        return animalsService.getAll();
    }

    @GET
    @Path("/name/{name}")
    public Animal name(@PathParam String name) {
        return animalsService.getByName(name);
    }

    @GET
    @Path("/name-async/{name}")
    public CompletionStage<Animal> nameAsync(@PathParam String name) {
        return animalsService.getByNameAsync(name);
    }
}
package org.acme.spring.data.jpa;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.*;
import java.util.List;
import java.util.Optional;

@Path("/type")
public class TypeResource {

    private final TypeRepository typeRepository;

    public TypeResource(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @GET
    @Produces("application/json")
    public Iterable<Type> findAll() {
        return typeRepository.findAll();
    }

//    @DELETE
//    @Path("{id}")
//    public void delete(@PathParam long id) {
//        fruitRepository.deleteById(id);
//    }
//
//    @POST
//    @Path("/name/{name}/color/{color}")
//    @Produces("application/json")
//    public Fruit create(@PathParam String name, @PathParam String color) {
//        Type type = new Type();
//        type.setId(1L);
//        return fruitRepository.save(new Fruit(name, color,type));
//    }
//
//    @PUT
//    @Path("/id/{id}/color/{color}")
//    @Produces("application/json")
//    public Fruit changeColor(@PathParam Long id, @PathParam String color) {
//        Optional<Fruit> optional = fruitRepository.findById(id);
//        if (optional.isPresent()) {
//            Fruit fruit = optional.get();
//            fruit.setColor(color);
//            return fruitRepository.save(fruit);
//        }
//
//        throw new IllegalArgumentException("No Fruit with id " + id + " exists");
//    }
//
//    @GET
//    @Path("/color/{color}")
//    @Produces("application/json")
//    public List<Fruit> findByColor(@PathParam String color) {
//        return fruitRepository.findByColor(color);
//    }
}

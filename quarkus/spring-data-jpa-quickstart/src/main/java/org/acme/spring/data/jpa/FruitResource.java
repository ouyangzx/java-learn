package org.acme.spring.data.jpa;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/fruits")
public class FruitResource {

    private final FruitRepository fruitRepository;
    private final TypeRepository typeRepository;

    public FruitResource(FruitRepository fruitRepository, TypeRepository typeRepository) {
        this.fruitRepository = fruitRepository;
        this.typeRepository = typeRepository;
    }

    @GET
    @Produces("application/json")
    public Iterable<Fruit> findAll() {
        Iterable<Fruit> all = fruitRepository.findAll();

//        all.forEach(f->{
//            Optional<Type> optional = typeRepository.findById(f.getId());
//            if (optional.isPresent()) {
//                System.out.println("optional.get() = " + optional.get());
//                f.setType(optional.get());
//            }
//
//        });
        return all;
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam long id) {
        fruitRepository.deleteById(id);
    }

    @POST
    @Path("/name/{name}/color/{color}")
    @Produces("application/json")
    public Fruit create(@PathParam String name, @PathParam String color) {
        Type type = new Type();
        type.setId(1L);
        return fruitRepository.save(new Fruit(name, color,type));
    }

    @PUT
    @Path("/id/{id}/color/{color}")
    @Produces("application/json")
    public Fruit changeColor(@PathParam Long id, @PathParam String color) {
        Optional<Fruit> optional = fruitRepository.findById(id);
        if (optional.isPresent()) {
            Fruit fruit = optional.get();
            fruit.setColor(color);
            return fruitRepository.save(fruit);
        }

        throw new IllegalArgumentException("No Fruit with id " + id + " exists");
    }

    @GET
    @Path("/color/{color}")
    @Produces("application/json")
    public List<Fruit> findByColor(@PathParam String color) {
        return fruitRepository.findByColor(color);
    }
}

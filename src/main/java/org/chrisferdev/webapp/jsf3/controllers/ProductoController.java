package org.chrisferdev.webapp.jsf3.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Model;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;
import org.chrisferdev.webapp.jsf3.entities.Producto;

import java.util.Arrays;
import java.util.List;

@Model
public class ProductoController {

    @Produces
    @Model
    public String titulo(){
        return "Hola Mundo JavaServer Face 3.0";
    }

    @Produces
    @RequestScoped
    @Named("listado")
    public List<Producto> findAll(){
        return Arrays.asList(new Producto("peras"), new Producto("manzanas"), new Producto("mandarinas"));
    }
}

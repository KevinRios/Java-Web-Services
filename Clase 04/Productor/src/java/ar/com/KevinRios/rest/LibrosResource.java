package ar.com.KevinRios.rest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("libros")
public class LibrosResource {
  
    @GET
    @Produces(value = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Libro> obtenerLibros(){
        
        List<Libro> listaLibros = new ArrayList();
        Libro libro1 = new Libro();
        libro1.setAutor("qwerty");
        libro1.setPaginas(100);
        libro1.setTitulo("asd");
        listaLibros.add(libro1);
        return listaLibros;
    }
    
    
} 

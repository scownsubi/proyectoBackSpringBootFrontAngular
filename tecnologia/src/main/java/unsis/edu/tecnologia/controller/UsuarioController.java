package unsis.edu.tecnologia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unsis.edu.tecnologia.entity.Usuario;
import unsis.edu.tecnologia.service.UsuarioService;

@RestController
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping("/api")
public class UsuarioController {
	@Autowired  
    private UsuarioService service;  
      
    @PostMapping("/createUsuario")  
    public void createUsuario(@RequestBody Usuario usuario) {  
         service.createUsuario(usuario);            
    }  
      
    @GetMapping("/listarUsuariosSP")  
    public List<Usuario> spGetAllUsers() {  
         return service.spGetAllUsers();          
    }  
    @GetMapping("/listUsuario")  
    public List<Usuario> getAllUsuarios() {  
         return service.getAllUsuarios();          
    }  
      
    @DeleteMapping("/deleteUsuario/{id}")  
    public void deleteStudent(@PathVariable("id") Long id) {   
        service.deleteUsuario(id);
    }  
  
    @GetMapping("/getUsuario/{id}")  
    public Usuario getUsuarioById(@PathVariable("id") Long id) {    
         return service.getUsuarioById(id);          
    }  
    
    @GetMapping("/myGetUsuarioById/{id}")  
    public Usuario myGetUsuarioById(@PathVariable("id") Long id) {    
         return service.myGetUsuarioById(id);          
    }  
    
    @GetMapping("/mySpGetUsuarioById/{id}")  
    public Usuario mySpGetUsuarioById(@PathVariable("id") Long id) {    
         return service.mySpGetUsuarioById(id);          
    }  
      
    @PostMapping("/updateUsuario/{id}")  
    public void updateUsuario(@RequestBody Usuario usuario,@PathVariable("id") Long id) {  
        usuario.setId(id);  
        service.updateUsuario(usuario);
    }  
}

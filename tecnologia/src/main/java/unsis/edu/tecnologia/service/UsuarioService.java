package unsis.edu.tecnologia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import unsis.edu.tecnologia.entity.Usuario;
import unsis.edu.tecnologia.repository.UsuarioRepository;

@Transactional
@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repository;

	public List<Usuario> getAllUsuarios(){
		return repository.findAll();
	}
	
	public Usuario getUsuarioById(Long id) {
		return repository.findById(id).get();
	}
	
	public void createUsuario(Usuario usuario) {
		repository.save(usuario);
	}
	
	public void updateUsuario(Usuario usuario) {
		repository.save(usuario);
	}
	
	public void deleteUsuario(Long id) {
		repository.deleteById(id);
	}
	
	public Usuario myGetUsuarioById(Long id) {
		return repository.myGetUsuarioById(id);
	}
		
	public Usuario mySpGetUsuarioById(Long id) {
		return repository.spGetUsuarioById(id);
	}
	
	public List<Usuario> spGetAllUsers(){
		return repository.spGetAllUsers();
	}
}

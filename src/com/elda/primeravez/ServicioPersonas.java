package com.elda.primeravez;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elda.primeravez.entity.PersonasEntity;
import com.elda.primeravez.repository.PersonasRepository;

@RestController
public class ServicioPersonas {

	@Autowired
	private PersonasRepository personasRepository;

	private Map<Integer, Persona> personas;

	// constructor
	public ServicioPersonas() {
		personas = new HashMap<>();
	}

	// crear personas
	@PutMapping("/put/{idPersona}")
	public Persona putPersona(@PathVariable int idPersona, @RequestBody Persona persona) {

		PersonasEntity person = new PersonasEntity(new Long(idPersona), persona.getNombre(), 
				persona.getApellido());
		personasRepository.save(person);
		return persona;
	}

	// obtener personas
	@GetMapping("/get")
	public Persona getPersona(@RequestParam("idPersona") int idPersona) {
		return personas.get(idPersona);
	}

	// agregar personas
	@PostMapping("/post")
	public Persona postPersona(@RequestBody Persona persona) {
		Random rnd = new Random();
		personas.put(rnd.nextInt(), persona);
		return persona;
	}

	// borrar personas
	@DeleteMapping("/delete/{idPersona}")
	public String deletePersona(@PathVariable int idPersona) {
		try {
			personas.remove(idPersona);
		} catch (Exception e) {
			return "Error";
		}
		return "Listo";
	}
}

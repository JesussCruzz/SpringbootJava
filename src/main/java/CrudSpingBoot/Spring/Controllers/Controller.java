package CrudSpingBoot.Spring.Controllers;

import CrudSpingBoot.Spring.Repository.Repository;
import CrudSpingBoot.Spring.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Repository repo;

    @GetMapping()
    public String index(){
        return "Conectado";
    }

    @GetMapping("personas")
    public List<Persona> getPersona(){
        return repo.findAll();
    }

    @PostMapping("grabar")
    public String post(@RequestBody Persona persona){
        repo.save(persona);
        return "Grabado";
    }

    @PutMapping("editar/{id}")
    public String update(@PathVariable Long id, @RequestBody Persona persona){
        Persona updatePersona= repo.findById(id).get();
        updatePersona.setNombre(persona.getNombre());
        updatePersona.setTel(persona.getTel());
        repo.save(updatePersona);
        return "Editado correctamente";
    }
 @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        Persona deletePersona= repo.findById(id).get();
        repo.delete(deletePersona);
        return "Se elimino";
 }


}

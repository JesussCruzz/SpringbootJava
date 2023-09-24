package CrudSpingBoot.Spring.Repository;

import CrudSpingBoot.Spring.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository <Persona, Long> {
}

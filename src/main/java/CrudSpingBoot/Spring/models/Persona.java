package CrudSpingBoot.Spring.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
public class Persona {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Getter
@Setter

    private  long id;
@Column
@Setter
@Getter
    private String nombre;
@Column(name = "Tel")
@Getter
@Setter
    private String tel;

}

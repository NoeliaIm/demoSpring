package com.bolsadeideas.springboot.backend.apirest.demo.models.entity;

        import lombok.Getter;
        import lombok.Setter;

        import javax.persistence.*;
        import java.io.Serializable;
        import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String apellido;
    private String email;
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    @PrePersist
    public void prePersist(){
        createAt = new Date();
    }
}

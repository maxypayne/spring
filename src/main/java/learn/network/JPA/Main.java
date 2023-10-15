package learn.network;

import com.maxim.api.models.Student;
import jakarta.persistence.*;

@Entity(name = "jpaConnection")
@Table(name = "users")
public class JpaConnection {
    EntityManager entityManager;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="email")
    private String email;
    public String[] getNames() {
        return this.entityManager.find(Student.class, "email");
    }
}

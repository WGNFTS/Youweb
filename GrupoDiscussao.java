import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "grupos_discussao")
public class GrupoDiscussao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany
    @JoinTable(name = "membros_grupo",
               joinColumns = @JoinColumn(name = "grupo_id"),
               inverseJoinColumns = @JoinColumn(name = "usuario_id"))
    private List<Usuario> membros;

    // Getters e setters
}

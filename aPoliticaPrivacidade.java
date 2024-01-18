import javax.persistence.*;

@Entity
@Table(name = "politica_privacidade")
public class PoliticaPrivacidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean aceitaPolitica;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Getters e setters
}

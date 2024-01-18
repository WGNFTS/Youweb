import javax.persistence.*;

@Entity
@Table(name = "historico_pesquisa")
public class HistoricoPesquisa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String consulta;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Getters e setters
}

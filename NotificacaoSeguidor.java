import javax.persistence.*;

@Entity
@Table(name = "notificacoes_seguidor")
public class NotificacaoSeguidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensagem;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Getters e setters
}


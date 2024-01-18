import javax.persistence.*;

@Entity
@Table(name = "curtidas")
public class Curtida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "video_id")
    private Video video;

    private boolean gostou;

    // Getters e setters
}

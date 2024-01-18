import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "playlists")
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToMany
    @JoinTable(name = "videos_playlist",
               joinColumns = @JoinColumn(name = "playlist_id"),
               inverseJoinColumns = @JoinColumn(name = "video_id"))
    private List<Video> videos;

    // Getters e setters
}

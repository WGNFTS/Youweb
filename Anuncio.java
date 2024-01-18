import javax.persistence.*;

@Entity
@Table(name = "anuncios")
public class Anuncio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    // Outros atributos relacionados a anúncios

    // Getters e setters
}

package societepade.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.Id;
import java.util.Date;
import java.util.Set;
@Entity
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor @ToString
@Table(name = "ligne_achat")
public class LigneAchat implements Serializable {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @ManyToOne
    @JoinColumn(name="id_achat")
    private Achat achat;
    @ManyToOne
    @JoinColumn(name="id_article")
    private Article article;
    @Column(name="quantite")
    private int quantite;
    public LigneAchat(Achat achat,Article article,int quantite){
        this.achat=achat;
        this.article=article;
        this.quantite=quantite;
    }

}

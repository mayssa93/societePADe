package societepade.demo.entity;
import lombok.*;
import javax.persistence.Id;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
@Entity
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor @ToString
@Table(name = "Achat")
public class Achat implements Serializable {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @Column(name="date")
    private LocalDate date;
    @Column(name="totalHT")
    private float totalHT;
    @Column(name="remise")
    private float remise;
    @OneToMany(mappedBy = "achat",cascade =CascadeType.ALL)
    private List<LigneAchat> ligneAchats ;
    public Achat(LocalDate date,float totalHT,float remise) {
        this.date=date;
        this.totalHT = totalHT;
        this.remise=remise;
    }
}

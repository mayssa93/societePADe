package societepade.demo.entity;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.Id;

import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.Serializable;
@Entity
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor @ToString
@Table(name = "Article")
public class Article implements Serializable {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @Column(name="libel")
    private String libel;
    @Column(name="reference")
    private String reference;
    @Column(name="prix_achatht")
    private float prix_achatht;
    @Column(name="stock")
    private int stock;
    /*@OneToMany(mappedBy = "article",cascade =CascadeType.ALL)
    private Set<LigneAchat> ligneAchats ;*/
    public Article(String libel,String reference,float prix_achatht,int stock) {
        this.libel = libel;
        this.reference=reference;
        this.prix_achatht = prix_achatht;
        this.stock=stock;
    }
}

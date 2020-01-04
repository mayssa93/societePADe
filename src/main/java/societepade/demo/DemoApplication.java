package societepade.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import societepade.demo.config.SwaggerConfig;
import societepade.demo.dao.AchatRepository;
import societepade.demo.dao.ArticleRepository;
import societepade.demo.dao.LigneAchatRepository;
import societepade.demo.entity.Achat;
import societepade.demo.entity.Article;
import societepade.demo.entity.LigneAchat;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
@SpringBootApplication
@EnableSwagger2
public class DemoApplication {
@Autowired
 private ArticleRepository articleRepository;
 @Autowired
 private AchatRepository achatRepository;
 @Autowired
 private LigneAchatRepository ligneAchatRepository;
 @Autowired
 private RepositoryRestConfiguration restConfiguration;
public static void main(String[] args) { SpringApplication.run(DemoApplication.class, args); }

/*
 @Override
 public void run(String... args) throws Exception {

   restConfiguration.exposeIdsFor(Article.class, Achat.class, LigneAchat.class);
   Article A1 = new Article("Huile", "Exon", 45.0f, 5);
   Article A2 = new Article("Filtre", "Gif", 50.0f, 10);
   Article A3 = new Article("Piston", "EE123456", 25.0f, 15);
   Article A4 = new Article("Batterie", "Assad", 120.0f, 30);
   Article A5 = new Article("Patain", "05P007", 40.0f, 7);
   Achat AC1= new Achat();
   LocalDate date = LocalDate.of(2019, 12, 22);
   AC1.setDate(date);
   AC1.setRemise(10f);
   AC1.setTotalHT(250.0f);
   Achat AC2= new Achat();
   LocalDate date1 = LocalDate.of(2019, 12, 23);
   AC2.setDate(date1);
   AC2.setRemise(15f);
   AC2.setTotalHT(150.0f);
   LigneAchat LA1=new LigneAchat();
   LA1.setAchat(AC1);
   LA1.setArticle(A1);
   LA1.setQuantite(3);
   LigneAchat LA2=new LigneAchat();
   LA2.setAchat(AC2);
   LA2.setArticle(A3);
   LA2.setQuantite(2);
   articleRepository.saveAndFlush(A1);
   articleRepository.saveAndFlush(A2);
   articleRepository.saveAndFlush(A3);
   articleRepository.saveAndFlush(A4);
   articleRepository.saveAndFlush(A5);
   achatRepository.saveAndFlush(AC1);
   achatRepository.saveAndFlush(AC2);
   ligneAchatRepository.saveAndFlush(LA1);
   ligneAchatRepository.saveAndFlush(LA2);
   float total=100;
   AC1.setTotalHT(total);
   achatRepository.saveAndFlush(AC1);
   A1.setStock(A1.getStock()-LA1.getQuantite());
   articleRepository.saveAndFlush(A1);
   float total1=222;
   AC2.setTotalHT(total1);
   achatRepository.saveAndFlush(AC2);
   A3.setStock(A3.getStock()-LA2.getQuantite());
   articleRepository.saveAndFlush(A3);
  }*/
 }




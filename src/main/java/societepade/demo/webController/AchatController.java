package societepade.demo.webController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import societepade.demo.entity.Achat;
import societepade.demo.service.AchatService;
import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/list-achats")
public class AchatController {
    @Autowired
    AchatService achatService;
    @GetMapping(value= "/")
    public List<Achat> getAchats() {
        return achatService.getAchats();
    }
    @GetMapping(value= "/{id}")
    public Achat getAchatsById(@PathVariable long id) throws Exception {
        Optional<Achat> ach =  achatService.getAchatsById(id);
        if(!ach.isPresent())
            throw new Exception("Could not find achat with id- " + id);
        return ach.get();
    }
    @PostMapping (value= "/")
    public Achat createAchat(@RequestBody Achat newach) {
        return achatService.addNewAchat(newach);
    }
    @PutMapping (value= "/{id}")
    public Achat updateArticle(@RequestBody Achat upach, @PathVariable Long id) throws Exception {
        Optional<Achat> ach =  achatService.getAchatsById(id);
        upach.setId(id);
        return achatService.updateAchat(upach);
    }
    @DeleteMapping (value= "/{id}")
    public void deleteAchatById(@PathVariable long id) throws Exception {
        Optional<Achat> ach =  achatService.getAchatsById(id);
        if(!ach.isPresent())
            achatService.deleteAchatById(id);
    }
    @DeleteMapping (value= "/")
    public void deleteAll() {
        achatService.deleteAllAchats();
    }

    }


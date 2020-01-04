package societepade.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import societepade.demo.dao.AchatRepository;
import societepade.demo.entity.Achat;
import java.util.List;
import java.util.Optional;
@Service
public class AchatService {
    @Autowired
    AchatRepository achatRepository;
    public List getAchats() {
        return achatRepository.findAll();
    }
    public Optional<Achat> getAchatsById(Long achatid) {
        return achatRepository.findById(achatid);
    }
    public Achat addNewAchat(Achat achat) {
        return achatRepository.save(achat);
    }
    public Achat updateAchat(Achat achat) {
        return achatRepository.save(achat);
    }
    public void deleteAchatById(Long achatid) {
        achatRepository.deleteById(achatid);
    }
    public void deleteAllAchats() {
        achatRepository.deleteAll();
    }
}

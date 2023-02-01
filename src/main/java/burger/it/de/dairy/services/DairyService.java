package burger.it.de.dairy.services;

import burger.it.de.dairy.models.DairyEntry;
import burger.it.de.dairy.repositories.DairyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
public class DairyService implements  IDairyService{

    DairyRepository dairyRepository;

    @Autowired
    public DairyService(DairyRepository dairyRepository){
        this.dairyRepository = dairyRepository;
    }
    @Override
    public List<DairyEntry> getAllDairyEntries() {
        return null;
    }

    @Override
    public Optional<DairyEntry> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<DairyEntry> findByEntryDate(LocalDateTime entryDate) {
        return Optional.empty();
    }

    @Override
    public DairyEntry save(DairyEntry std) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}

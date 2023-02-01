package burger.it.de.dairy.services;

import burger.it.de.dairy.models.DairyEntry;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface IDairyService {
    List<DairyEntry> getAllDairyEntries();
    Optional<DairyEntry> findById(int id);
    Optional<DairyEntry> findByEntryDate(LocalDateTime entryDate);
    DairyEntry save(DairyEntry std);
    void deleteById(int id);
}

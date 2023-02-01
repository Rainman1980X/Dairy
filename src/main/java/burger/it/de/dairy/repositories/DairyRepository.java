package burger.it.de.dairy.repositories;

import burger.it.de.dairy.models.DairyEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface DairyRepository extends JpaRepository<DairyEntry,Integer> {
    Optional<DairyEntry> findByEntryDate(LocalDateTime entryDate);
}

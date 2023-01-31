package matthias.burger.de.springboot3test.repositories;

import matthias.burger.de.springboot3test.model.DairyEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface DairyRepository extends JpaRepository<DairyEntry,Integer> {
    Optional<DairyEntry> findByEntryDate(LocalDateTime entryDate);
}

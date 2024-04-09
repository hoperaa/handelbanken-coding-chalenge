package infra.repository;

import core.model.Watch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface WatchRepository extends JpaRepository<Watch, String> {

    @Override
    Optional<Watch> findById(String id);

    Set<Watch> findAllByWatchIdIs(Set<String> ids);

}

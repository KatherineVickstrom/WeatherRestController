package weather_rest.domain;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface CityRepository extends JpaRepository<CityInfo, Long> {
        List<CityInfo> findByName(String name);
}

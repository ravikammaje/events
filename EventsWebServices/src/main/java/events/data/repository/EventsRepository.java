
package events.data.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import events.data.Event;

@RepositoryRestResource(collectionResourceRel = "event", path = "event")
public interface EventsRepository extends MongoRepository<Event, String> {

	List<Event> findByLatitudeBetween(@Param("startLatitude") double startLatitude, @Param("endLatitude") double endLatitude);
	List<Event> findByLongitudeBetween(@Param("startLongitude") double startLongitude, @Param("endLongitude") double endLongitude);
	List<Event> findByeventStartDateTimeBetween(@Param("startDate") Date startDate, @Param("endDate") Date endDate);


}


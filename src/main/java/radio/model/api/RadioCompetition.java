package radio.model.api;

import java.time.LocalDateTime;

public interface RadioCompetition {

	int id();

	String description();
	
 String rules();

 LocalDateTime startDate();

 LocalDateTime inscriptionStartDate();

 LocalDateTime inscriptionEndDate();

}

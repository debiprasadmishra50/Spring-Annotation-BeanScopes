package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope
//@Scope("singleton") //Both the lines are same because default scope is singleton
@Scope("prototype")
public class BadmintonCoach implements Coach {

	public BadmintonCoach() {
		System.out.println("BadmintonCoach : Constructor is called");
	}
	
	@Override
	public String getDailyWorkout() {
		return "In Badminton : Practice Badminton smash 2 hours a day";
	}

}

package com.sam.design_patterns.builder;

import org.springframework.stereotype.Service;

@Service
public class VaccationPlanner {

	public void planVaccation() {
		
		
		Vacation worldCupVacation1 = new CityVacationBuilder()
				.addTravel("Emirates")
				.travelDuringTheYear(2022)
				.travelDuringTheMonth(10)
				.travelOnAday(30)
				.addAccommodation("The Park")
				.bookAccoduringTheYear(2022)
				.bookAccoduringTheMonth(11)
				.bookAccoOnAday(1)
				.noOfDaysOfStay(30)
				.atTheLocation(100)
				.addEvent("Argentina vs Brazil")
				.bookEventDuringTheYear(2022)
				.bookEventDuringTheMonth(11)
				.bookEventDOnADay(5)
				.addEvent("Portugal vs Italy")
				.bookEventDuringTheYear(2022)
				.bookEventDuringTheMonth(11)
				.bookEventDOnADay(15)
				.getVacation();
				
	     System.out.println("*******World cup vacation of a non-resident******");	
	     System.out.println(worldCupVacation1);
	     
	     Vacation worldCupVacation2 = new CityVacationBuilder()
					.addEvent("France vs Croatia")
					.bookEventDuringTheYear(2022)
					.bookEventDuringTheMonth(11)
					.bookEventDOnADay(7)
					.addEvent("Spain vs Belgium")
					.bookEventDuringTheYear(2022)
					.bookEventDuringTheMonth(11)
					.bookEventDOnADay(17)
					.getVacation();
	     
	     System.out.println("*******World cup vacation of a resident*******");	
	     System.out.println(worldCupVacation2);
	     
	     Vacation worldCupVacation3 = new CityVacationBuilder()
	    		    .addTravel("Emirates")
					.travelDuringTheYear(2022)
					.travelDuringTheMonth(10)
					.travelOnAday(30)
					
					.addEvent("Switzerland vs Uruguay")
					.bookEventDuringTheYear(2022)
					.bookEventDuringTheMonth(11)
					.bookEventDOnADay(10)
					.getVacation();
	     
	     System.out.println("*******World cup vacation of a non-resident with a person who is a resident*******");	
	     System.out.println(worldCupVacation3);
	     
	   
			Vacation treckingVacation = new OutDoorVacationBuilder()
					.addTravel("Jeep")
					.addAccommodation("Cone Shaped Tent")
					.bookAccoduringTheYear(2022)
					.bookAccoduringTheMonth(6)
					.bookAccoOnAday(12)
					.noOfDaysOfStay(3)
					.atTheLocation(30)
					.addEvent("Trecking")
					.bookEventDuringTheYear(2022)
					.bookEventDuringTheMonth(6)
					.bookEventDOnADay(12)
					.getVacation();
			System.out.println("*******Trecking vacation*******");	
		    System.out.println(treckingVacation);
		    
		    Vacation forestVacation = new OutDoorVacationBuilder()
					.addTravel("Car")
					.addAccommodation("Triangle Shaped Tent")
					.bookAccoduringTheYear(2022)
					.bookAccoduringTheMonth(8)
					.bookAccoOnAday(10)
					.noOfDaysOfStay(5)
					.atTheLocation(40)
					.addEvent("Wild Life Photography")
					.getVacation();
			System.out.println("*******Forest vacation*******");	
		    System.out.println(forestVacation);
		
	}

}

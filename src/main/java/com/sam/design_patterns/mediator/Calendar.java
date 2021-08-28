package com.sam.design_patterns.mediator;

import java.time.DayOfWeek;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service
public class Calendar {

	private List<DayOfWeek> weekends = Lists.newArrayList(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
	private List<DayOfWeek> normalDays = Lists.newArrayList(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.FRIDAY);
	private List<DayOfWeek> busyDays = Lists.newArrayList(DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY);

	private String dayOfWeek;

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getTypeOfDay() {
		return this.isWeekend() ? "WEEKEND" : this.isNormalDay() ? "NORMALDAY" : 
			this.isBusyDay() ? "BUSYDAY" : null;
	}

	public Boolean isWeekend() {
		return this.weekends.contains(DayOfWeek.valueOf(dayOfWeek));
	}

	public Boolean isNormalDay() {
		return this.normalDays.contains(DayOfWeek.valueOf(dayOfWeek));
	}

	public Boolean isBusyDay() {
		return this.busyDays.contains(DayOfWeek.valueOf(dayOfWeek));
	}

}

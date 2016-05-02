package com.egwinc.timetracker.model;

import java.util.Date;
import java.util.List;

public class Report {
	private Date startDate;
	private Date endDate;
	private List<TimeEntry> entries;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<TimeEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<TimeEntry> entries) {
		this.entries = entries;
	}
}

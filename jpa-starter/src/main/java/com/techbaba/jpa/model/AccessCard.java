package com.techbaba.jpa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AccessCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private Date issueDate;
	
	private boolean active;
	
	@OneToOne(mappedBy = "card")
	private Employee cardOwner;
	
	public Employee getCardOwner() {
		return cardOwner;
	}

	public void setCardOwner(Employee cardOwner) {
		this.cardOwner = cardOwner;
	}

	@Override
	public String toString() {
		return "AccessCard [id=" + id + ", issueDate=" + issueDate + ", active=" + active + ", firmwareVersion="
				+ firmwareVersion + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	private String firmwareVersion;
}

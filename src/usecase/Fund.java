package usecase;

import java.math.BigDecimal;
import java.sql.Date;

public class Fund {

	private long accNumber;
	private String accName;
	private BigDecimal amount;
	private String isActive;
	private String createdBy;
	private Date createdDt;

	
	public Fund(){
		
	}
	
	
	
	public Fund(long accNumber, String accName, BigDecimal amount, String isActive, String createdBy, Date createdDt) {
		super();
		this.accNumber = accNumber;
		this.accName = accName;
		this.amount = amount;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdDt = createdDt;
	}

	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

}

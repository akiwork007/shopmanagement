package com.fs.shopmanagement.doa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_master_tbl")
public class CustomerEntity {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CustomerId;

	@Column
	private String FirstName;

	@Column
	private String MiddleName;

	@Column
	private String LastName;

	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return CustomerId;
	}

	/**
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return MiddleName;
	}

	/**
	 * @param middleName
	 *            the middleName to set
	 */
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}

}

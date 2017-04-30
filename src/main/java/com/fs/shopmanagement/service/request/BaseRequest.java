/**
 * 
 */
package com.fs.shopmanagement.service.request;

import java.io.Serializable;

/**
 * @author Life
 *
 */
public class BaseRequest implements Serializable {

	private static final long serialVersionUID = -63554135837336455L;

	private String user;

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

}

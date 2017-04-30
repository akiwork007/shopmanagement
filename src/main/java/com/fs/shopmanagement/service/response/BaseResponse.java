/**
 * 
 */
package com.fs.shopmanagement.service.response;

import java.io.Serializable;

/**
 * @author Life
 *
 */
public class BaseResponse implements Serializable {

	private static final long serialVersionUID = -6195441113700028786L;

	private String errorCode;

	private String errorMsg;

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode
	 *            the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * @param errorMsg
	 *            the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}

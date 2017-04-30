/**
 * 
 */
package com.fs.shopmanagement.exception;

/**
 * @author Life
 *
 */
public class NoDataFountException extends Exception {

	private static final long serialVersionUID = 2582653766482026971L;

	public NoDataFountException(String errorCode, String errorMsg) {
		super(errorMsg);
	}

}

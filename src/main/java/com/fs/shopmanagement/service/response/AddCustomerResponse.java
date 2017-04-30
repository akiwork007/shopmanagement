/**
 * 
 */
package com.fs.shopmanagement.service.response;

/**
 * @author Life
 *
 */
public class AddCustomerResponse extends BaseResponse {

	private static final long serialVersionUID = 5703680411275862655L;

	private String successMsg;

	/**
	 * @return the successMsg
	 */
	public String getSuccessMsg() {
		return successMsg;
	}

	/**
	 * @param successMsg
	 *            the successMsg to set
	 */
	public void setSuccessMsg(String successMsg) {
		this.successMsg = successMsg;
	}
}

package com.aubank.cloudflare.entity;

import lombok.Data;

import java.util.List;

/**
 * <p>Title: UpdateToken</p>
 * <p>Description: </p>
 *
 * @author Ravindar Singh
 */
@Data
public class UpdateToken {
    private String id;
    private String name;
    private String notBefore;
    private String expiresOn;
    private String status;
    private String issuedOn;
    private String modifiedOn;
    private List<UserApiTokens.Policy> policies;
    private UserApiTokens.Condition condition;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the notBefore
	 */
	public String getNotBefore() {
		return notBefore;
	}
	/**
	 * @param notBefore the notBefore to set
	 */
	public void setNotBefore(String notBefore) {
		this.notBefore = notBefore;
	}
	/**
	 * @return the expiresOn
	 */
	public String getExpiresOn() {
		return expiresOn;
	}
	/**
	 * @param expiresOn the expiresOn to set
	 */
	public void setExpiresOn(String expiresOn) {
		this.expiresOn = expiresOn;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the issuedOn
	 */
	public String getIssuedOn() {
		return issuedOn;
	}
	/**
	 * @param issuedOn the issuedOn to set
	 */
	public void setIssuedOn(String issuedOn) {
		this.issuedOn = issuedOn;
	}
	/**
	 * @return the modifiedOn
	 */
	public String getModifiedOn() {
		return modifiedOn;
	}
	/**
	 * @param modifiedOn the modifiedOn to set
	 */
	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	/**
	 * @return the policies
	 */
	public List<UserApiTokens.Policy> getPolicies() {
		return policies;
	}
	/**
	 * @param policies the policies to set
	 */
	public void setPolicies(List<UserApiTokens.Policy> policies) {
		this.policies = policies;
	}
	/**
	 * @return the condition
	 */
	public UserApiTokens.Condition getCondition() {
		return condition;
	}
	/**
	 * @param condition the condition to set
	 */
	public void setCondition(UserApiTokens.Condition condition) {
		this.condition = condition;
	}
    
}

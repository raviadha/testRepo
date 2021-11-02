package com.aubank.cloudflare.entity;

import lombok.Data;

/**
 * <p>Title: CreateZone</p>
 * <p>Description: </p>
 *
 * @author Ravindar Singh
 */
@Data
public class CreateZone {
    private String name;
    private String type;
    private Account account;
    private Boolean jumpStart;

    @Data
    public static class Account {
        private String id;

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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * @return the jumpStart
	 */
	public Boolean getJumpStart() {
		return jumpStart;
	}

	/**
	 * @param jumpStart the jumpStart to set
	 */
	public void setJumpStart(Boolean jumpStart) {
		this.jumpStart = jumpStart;
	}
    
}

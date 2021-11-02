package com.aubank.cloudflare.entity;

import lombok.Data;

import java.util.List;

/**
 * <p>Title: Zone</p>
 * <p>Description: </p>
 *
 * @author Ravindar Singh
 */
@Data
public class Zone {
    private String id;
    private String name;
    private Integer developmentMode;
    private List<String> originalNameServers;
    private String originalRegistrar;
    private String originalDnshost;
    private String createdOn;
    private String modifiedOn;
    private String activatedOn;
    private Owner owner;
    private Account account;
    private List<String> permissions;
    private Plan plan;
    private PlanPending planPending;
    private String status;
    private Boolean paused;
    private String type;
    private List<String> nameServers;

    @Data
    public static class Plan {
        private String id;
        private String name;
        private Integer price;
        private String currency;
        private String frequency;
        private String legacyId;
        private Boolean isSubscribed;
        private Boolean canSubscribe;
    }

    @Data
    public static class Account {
        private String id;
        private String name;
    }

    @Data
    public static class PlanPending {

        private String id;
        private String name;
        private Integer price;
        private String currency;
        private String frequency;
        private String legacyId;
        private Boolean isSubscribed;
        private Boolean canSubscribe;
    }

    @Data
    public static class Owner {
        private String id;
        private String email;
        private String type;
    }

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
	 * @return the developmentMode
	 */
	public Integer getDevelopmentMode() {
		return developmentMode;
	}

	/**
	 * @param developmentMode the developmentMode to set
	 */
	public void setDevelopmentMode(Integer developmentMode) {
		this.developmentMode = developmentMode;
	}

	/**
	 * @return the originalNameServers
	 */
	public List<String> getOriginalNameServers() {
		return originalNameServers;
	}

	/**
	 * @param originalNameServers the originalNameServers to set
	 */
	public void setOriginalNameServers(List<String> originalNameServers) {
		this.originalNameServers = originalNameServers;
	}

	/**
	 * @return the originalRegistrar
	 */
	public String getOriginalRegistrar() {
		return originalRegistrar;
	}

	/**
	 * @param originalRegistrar the originalRegistrar to set
	 */
	public void setOriginalRegistrar(String originalRegistrar) {
		this.originalRegistrar = originalRegistrar;
	}

	/**
	 * @return the originalDnshost
	 */
	public String getOriginalDnshost() {
		return originalDnshost;
	}

	/**
	 * @param originalDnshost the originalDnshost to set
	 */
	public void setOriginalDnshost(String originalDnshost) {
		this.originalDnshost = originalDnshost;
	}

	/**
	 * @return the createdOn
	 */
	public String getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
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
	 * @return the activatedOn
	 */
	public String getActivatedOn() {
		return activatedOn;
	}

	/**
	 * @param activatedOn the activatedOn to set
	 */
	public void setActivatedOn(String activatedOn) {
		this.activatedOn = activatedOn;
	}

	/**
	 * @return the owner
	 */
	public Owner getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Owner owner) {
		this.owner = owner;
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
	 * @return the permissions
	 */
	public List<String> getPermissions() {
		return permissions;
	}

	/**
	 * @param permissions the permissions to set
	 */
	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

	/**
	 * @return the plan
	 */
	public Plan getPlan() {
		return plan;
	}

	/**
	 * @param plan the plan to set
	 */
	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	/**
	 * @return the planPending
	 */
	public PlanPending getPlanPending() {
		return planPending;
	}

	/**
	 * @param planPending the planPending to set
	 */
	public void setPlanPending(PlanPending planPending) {
		this.planPending = planPending;
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
	 * @return the paused
	 */
	public Boolean getPaused() {
		return paused;
	}

	/**
	 * @param paused the paused to set
	 */
	public void setPaused(Boolean paused) {
		this.paused = paused;
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
	 * @return the nameServers
	 */
	public List<String> getNameServers() {
		return nameServers;
	}

	/**
	 * @param nameServers the nameServers to set
	 */
	public void setNameServers(List<String> nameServers) {
		this.nameServers = nameServers;
	}
    
    
}

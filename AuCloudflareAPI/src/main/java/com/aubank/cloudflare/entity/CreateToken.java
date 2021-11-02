package com.aubank.cloudflare.entity;

import lombok.Data;

import java.util.List;

/**
 * <p>Title: CreateToken</p>
 * <p>Description: </p>
 *
 * @author Ravindar Singh
 */
@Data
public class CreateToken {
    private String name;
    private String notBefore;
    private String expiresOn;
    private List<UserApiTokens.Policy> policies;
    private UserApiTokens.Condition condition;
}

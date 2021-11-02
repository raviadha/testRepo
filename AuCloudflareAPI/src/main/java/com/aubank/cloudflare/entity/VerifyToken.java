package com.aubank.cloudflare.entity;

import lombok.Data;

/**
 * <p>Title: VerifyToken</p>
 * <p>Description: </p>
 *
 * @author Ravindar Singh
 */
@Data
public class VerifyToken {
    private String id;
    private String status;
    private String notBefore;
    private String expiresOn;
}

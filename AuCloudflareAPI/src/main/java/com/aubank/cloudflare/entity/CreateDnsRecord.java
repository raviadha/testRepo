package com.aubank.cloudflare.entity;

import lombok.Data;

/**
 * <p>Title: CreateDnsRecord</p>
 * <p>Description: </p>
 *
 * @author Ravindar Singh
 */
@Data
public class CreateDnsRecord {
    private String type;
    private String name;
    private String content;
    private Integer ttl;
    private Integer priority;
    private Boolean proxied;
}

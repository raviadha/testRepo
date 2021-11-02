package com.aubank.cloudflare.entity;

import lombok.Data;

import java.util.List;

/**
 * <p>Title: EditZone</p>
 * <p>Description: </p>
 *
 * @author Ravindar Singh
 */
@Data
public class EditZone {
    private Boolean paused;
    private List<String> vanityNameServers;
    private Plan plan;

    @Data
    public static class Plan {
        private String id;
    }
}

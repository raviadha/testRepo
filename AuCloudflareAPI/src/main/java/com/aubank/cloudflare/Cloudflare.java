package com.aubank.cloudflare;

import com.aubank.cloudflare.dns.DnsRecordsApi;
import com.aubank.cloudflare.user.UserApi;
import com.aubank.cloudflare.user.UserApiTokensApi;
import com.aubank.cloudflare.zone.ZoneApi;

/**
 * <p>Title: Cloudflare</p>
 * <p>Description: </p>
 *
 * @author Ravindar Singh
 */
public class Cloudflare {
    public UserApi user;
    public UserApiTokensApi userApiTokens;
    public ZoneApi zone;
    public DnsRecordsApi dnsRecords;

    private Cloudflare() {
    }

    public Cloudflare(String apiToken) {
        this.user = new UserApi(apiToken);
        this.userApiTokens = new UserApiTokensApi(apiToken);
        this.zone = new ZoneApi(apiToken);
        this.dnsRecords = new DnsRecordsApi(apiToken);
    }
}

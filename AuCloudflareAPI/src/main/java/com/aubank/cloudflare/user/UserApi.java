package com.aubank.cloudflare.user;

import com.alibaba.fastjson.JSON;
import com.aubank.cloudflare.CloudflareException;
import com.aubank.cloudflare.CloudflareInterface;
import com.aubank.cloudflare.entity.EditUser;
import com.aubank.cloudflare.entity.UserDetail;

import net.renfei.sdk.http.HttpRequest;
import net.renfei.sdk.utils.HttpUtils;

import java.io.IOException;

/**
 * <p>Title: UserApi</p>
 * <p>Description: </p>
 *
 * @author Ravindar Singh
 */
public class UserApi extends CloudflareInterface {
    private UserApi() {
    }

    public UserApi(String apiToken) {
        API_TOKEN = apiToken;
    }

    public UserDetail getUserDetails() throws IOException, CloudflareException {
        return getResult(HttpUtils.get(getRequest("user")), UserDetail.class);
    }

    public UserDetail editUser(EditUser editUser) throws IOException, CloudflareException {
        HttpRequest request = getRequest("user");
        request.json(JSON.toJSONString(editUser));
        return getResult(HttpUtils.patch(request), UserDetail.class);
    }
}

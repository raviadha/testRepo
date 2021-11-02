package com.aubank.cloudflare;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import net.renfei.sdk.http.HttpEntityType;
import net.renfei.sdk.http.HttpRequest;
import net.renfei.sdk.http.HttpResult;

import java.util.HashMap;
import java.util.List;

/**
 * <p>Title: CloudflareInterface</p>
 * <p>Description: </p>
 *
 * @author Ravindar Singh
 */
public abstract class CloudflareInterface {
    protected final static String ENDPOINTS = "https://api.cloudflare.com/client/v4/";
    protected final static String AUTHORIZATION = "Authorization";
    protected static String API_TOKEN;

    protected HttpRequest getRequest(String api) {
        HttpRequest request = HttpRequest.create().url(ENDPOINTS + api).useSSL();
        request.headers(new HashMap<>(1));
        //request.addHeader(AUTHORIZATION, "Bearer " + API_TOKEN);
        request.httpEntityType(HttpEntityType.ENTITY_STRING);
        request.addHeader("Content-Type", "application/json; charset=utf-8");
        request.addHeader("Accept", "application/json");
        request.addHeader("X-Auth-Key", "5a5e4a9e9d9758453120ab5b273553bb8d3e7");
        request.addHeader("X-Auth-Email", "ravindar.singh@aubank.in");
        request.addHeader("X-Auth-User-Service-Key", api);
        
        //.header("X-Auth-User-Service-Key","purge_everything")
        System.out.println("Request:"+request.getUrl());
        //System.out.println("Request:"+request.get);
        
        
        /*// any other headers
		.header("cloudflare_pass","5a5e4a9e9d9758453120ab5b273553bb8d3e7")
		.header("cloudflare_email","ravindar.singh@aubank.in")
		// .header("X-Auth-User-Service-Key","v1.0-75bdd5534f69911192d1dbfd-4815c7cf6455ea66090768c415dc16446b87f9955f1248805b670aa9ee66cf6c67300277872921959f4e9034035d0dd430c008c61c637839af3734f48dd50c3340f154ae7e4d93bf")
		.header("X-Auth-User-Service-Key","purge_everything")*/
        
        return request;
    }

    protected <T> T getResult(HttpResult result, Class<T> clazz) throws CloudflareException {
        JSONObject jsonObject = JSON.parseObject(result.getResponseText());
        if (jsonObject.getBoolean("success")) {
            return jsonObject.getObject("result", clazz);
        } else {
            JSONArray jsonArray = jsonObject.getJSONArray("errors");
            if (jsonArray.size() > 0) {
                throw new CloudflareException(jsonArray.getJSONObject(0).getString("code"), "Error",
                        jsonArray.getJSONObject(0).getString("message"));
            } else {
                throw new CloudflareException("500", "Error", "Unknown unexpected error.");
            }
        }
    }

    protected <T> List<T> getResultList(HttpResult result, Class<T> clazz) throws CloudflareException {
        JSONObject jsonObject = JSON.parseObject(result.getResponseText());
        if (jsonObject.getBoolean("success")) {
            return JSON.parseArray(JSON.toJSONString(jsonObject.getJSONArray("result")), clazz);
        } else {
            JSONArray jsonArray = jsonObject.getJSONArray("errors");
            if (jsonArray.size() > 0) {
                throw new CloudflareException(jsonArray.getJSONObject(0).getString("code"), "Error",
                        jsonArray.getJSONObject(0).getString("message"));
            } else {
                throw new CloudflareException("500", "Error", "Unknown unexpected error.");
            }
        }
    }
}

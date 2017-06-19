package com.util;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

import static org.apache.http.impl.client.HttpClients.createDefault;

/**
 * Created by maven on 2017/4/13.
 */

public class ChatbotSend {
    public static String WEBHOOK_TOKEN = "https://oapi.dingtalk.com/robot/send?access_token=32379ecee4c114831a8c3446acfda2ad3c5bf5f913a49b2ebc13b07481ef3176";

    public static void main(String args[]) throws Exception {

        HttpClient httpclient = createDefault();

        HttpPost httppost = new HttpPost(WEBHOOK_TOKEN);
        httppost.addHeader("Content-Type", "application/json; charset=utf-8");

        String textMsg = "{ \"msgtype\": \"text\", \"text\": {\"content\": \"可是你头大啊\"}}";
        StringEntity se = new StringEntity(textMsg, "utf-8");
        httppost.setEntity(se);

        HttpResponse response = httpclient.execute(httppost);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String result = EntityUtils.toString(response.getEntity());
            System.out.println(result);
        }
    }
}
package com.util;

import com.google.common.base.Joiner;
import org.apache.commons.collections.CollectionUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

import java.util.List;

import static org.apache.http.impl.client.HttpClients.createDefault;

/**
 * Created by maven on 2017/3/29.
 * 多条件拼接sql
 */

public class Regular {
    public static String SplicedSql(String sql,List<String> whereClause ) {
        StringBuffer sbSql = new StringBuffer();
        if(CollectionUtils.isNotEmpty(whereClause)){
            sbSql.append(sql).append(" ").append("where");
        }else{
            sbSql.append(sql).append(" ");
        }
        String whereClauseString = Joiner.on(' ').skipNulls().join(whereClause);
        whereClauseString = whereClauseString.replaceFirst("^(\\s*(and|AND|OR|or)?\\s+)", " ");
        return  sbSql.append(whereClauseString).toString();
    }

    public static class ChatbotSend {

        public static String WEBHOOK_TOKEN = "https://oapi.dingtalk.com/robot/send?access_token=8b372eccda448a0cf918a17b2bd9498075392b50adf1a5e094db3089aaf59bf9";

        public static void main(String args[]) throws Exception{

            HttpClient httpclient = createDefault();

            HttpPost httppost = new HttpPost(WEBHOOK_TOKEN);
            httppost.addHeader("Content-Type", "application/json; charset=utf-8");

            String textMsg = "{ \"msgtype\": \"text\", \"text\": {\"content\": \"测试测试\"}}";
            StringEntity se = new StringEntity(textMsg, "utf-8");
            httppost.setEntity(se);

            HttpResponse response = httpclient.execute(httppost);
            if (response.getStatusLine().getStatusCode()== HttpStatus.SC_OK){
                String result= EntityUtils.toString(response.getEntity());
                System.out.println(result);
            }
        }
    }

}

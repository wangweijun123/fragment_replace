package com.example.administrator.searchfragmentreplace;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtil {

    /**
     * {
     * sceneNmame:"",
     * curModel:"url",
     * localLoaded:[{item1},{item2}]
     * }
     * item{
     * name:""
     * price:""
     * imgUrl:""
     * modelUrl:"" // 本地文件地址
     * }
     */
    public static void writeFile() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("sceneNmame", "VR");
        jsonObject.addProperty("curModel", "/storage/emulated/0/Android/data/com.wld");

        JsonArray jsonArray = new JsonArray();
        for(int i=0; i<2; i++) {
            JsonObject item = new JsonObject();
            item.addProperty("name", "商品名称 "+i);
            item.addProperty("price", "58");
            item.addProperty("imageurl", "https:///");
            item.addProperty("modelUrl", "local1");
            jsonArray.add(item);
        }
        jsonObject.add("localLoaded", jsonArray);
        Log.i("wangweijun", jsonObject.toString());

        insert(jsonObject.toString());
    }

    public static void insert(String json) {

        try {
            JSONObject jsonObject1 = new JSONObject(json);
            JSONArray localLoaded = jsonObject1.getJSONArray("localLoaded");
            int size = localLoaded.length();
            JSONObject newItem = new JSONObject();
            newItem.put("name", "新商品名称");
            newItem.put("price", "10000");
            newItem.put("imageurl", "xxxxx");
            newItem.put("modelUrl", "cccc");
            localLoaded.put(size, newItem);

            Log.i("wangweijun", "插入记录后json : " + jsonObject1.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

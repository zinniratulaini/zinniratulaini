package com.example.katalogsmarthpone.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


public class Smartphone {
    public static final String SAMSUNG="SAMSUNG";
    public static final String OPPO="OPPO";
    private String id;
    private Date tanggal;
    private String deskripsi;
    private String nilai;
    private String jenis;
    private String model;

    public Smartphone() {
        this.id = UUID.randomUUID().toString();
        this.tanggal = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getModel(){
        return model;
    }
    public void setModel( String model){
        this.model = model;
    }

    public static Smartphone fromJSONObject(JSONObject obj) {
        Smartphone tr = new Smartphone();
        try {
            tr.setId(obj.getString("id"));
            tr.setTanggal(new Date(obj.getLong("tanggal")));
            tr.setDeskripsi(obj.getString("deskripsi"));
            tr.setNilai(obj.getString("nilai"));
            tr.setJenis(obj.getString("jenis"));
            tr.setModel(obj.getString("model"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return tr;
    }

    public JSONObject toJSONObject() {
        JSONObject jsonObj = new JSONObject();
        try {
            jsonObj.put("id",this.id);
            jsonObj.put("tanggal",this.tanggal.getTime());
            jsonObj.put("jenis",this.jenis);
            jsonObj.put("nilai",this.nilai);
            jsonObj.put("deskripsi",this.deskripsi);
            jsonObj.put("model",this.model);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObj;
    }
}

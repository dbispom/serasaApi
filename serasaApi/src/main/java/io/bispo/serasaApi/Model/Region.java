package io.bispo.serasaApi.Model;


import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class Region {

    @Id
    private String id;

    private String regiao;
    private ArrayList<String> estados;

    public Region(String regiao, ArrayList<String> estados) {
        this.regiao = regiao;
        this.estados = estados;
    }

    public String getId() {
        return id;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public ArrayList<String> getEstados() {
        return estados;
    }

    public void setEstados(ArrayList<String> estados) {
        this.estados = estados;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id='" + id + '\'' +
                ", regiao='" + regiao + '\'' +
                ", estados=" + estados +
                '}';
    }
}

package com.example.atividade1109;

public class Produto {
    private String name;
    private int qtd;
    private String unit;
    private boolean priority;

    public Produto(String nome, int q, String u, boolean checked) {
        name=nome;
        qtd=q;
        unit=u;
        priority=checked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }
}

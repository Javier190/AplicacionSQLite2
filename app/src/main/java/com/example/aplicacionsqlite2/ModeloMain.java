package com.example.aplicacionsqlite2;

public class ModeloMain {

    private String titulo;
    private int imageID;                             //imagen es un valor tipo numero

    public ModeloMain(String titulo, int imageID) {
        this.titulo = titulo;
        this.imageID = imageID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}

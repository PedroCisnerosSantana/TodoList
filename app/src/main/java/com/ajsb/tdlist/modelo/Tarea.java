package com.ajsb.tdlist.modelo;

public class Tarea
{
    private int id ;
    private String tarea ;
    private Integer lista ;
    private Boolean completa ;

    public Tarea() { }
    public Tarea(int id, String tarea, int lista, Boolean completa)
    {
        this.id = id ;
        this.tarea = tarea ;
        this.lista = lista ;
        this.completa = completa ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public Integer getLista() {
        return lista;
    }

    public void setLista(Integer lista) {
        this.lista = lista;
    }

    public Boolean getCompleta() {
        return completa;
    }

    public void setCompleta(Boolean completa) {
        this.completa = completa;
    }
}

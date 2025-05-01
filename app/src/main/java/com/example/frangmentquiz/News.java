package com.example.frangmentquiz;

public class News {

    private String image;
    private String titular;
    private String subtitulo;
    private String fechaHora;
    private String ciudad;
    private String fuente;
    private String autor;
    private String descripcion;

    public News(String image, String titular, String subtitulo, String fechaHora, String ciudad, String fuente, String autor, String descripcion) {
        this.image = image;
        this.titular = titular;
        this.subtitulo = subtitulo;
        this.fechaHora = fechaHora;
        this.ciudad = ciudad;
        this.fuente = fuente;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

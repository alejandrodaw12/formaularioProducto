package com.example.formaularioproducto;

import java.io.Serializable;
import java.util.Objects;

public class envio  implements Serializable {

    private String idproducto;
    private String nombre;
    private String direccion;
    private String telefono;
    private String tipoEnvio;

    public envio(String idproducto, String nombre, String direccion, String telefono, String tipoEnvio) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoEnvio = tipoEnvio;
    }



    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        envio envio = (envio) o;
        return Objects.equals(idproducto, envio.idproducto) &&  Objects.equals(direccion, envio.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idproducto, nombre, direccion, telefono, tipoEnvio);
    }


    @Override
    public String toString() {
        return "envio{" +
                ", idproducto='" + idproducto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", tipoEnvio='" + tipoEnvio + '\'' +
                '}';
    }
}

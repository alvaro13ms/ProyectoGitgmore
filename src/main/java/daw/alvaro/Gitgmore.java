/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.alvaro;

/**
 *
 * @author alvaro
 */
public class Gitgmore {

    private String dni;
    private int numero;
    private int codigo;

    public Gitgmore() {
    }

    public Gitgmore(String dni, int numero, int codigo) {
        this.dni = dni;
        this.numero = numero;
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Gmore{" + "dni=" + dni + ", numero=" + numero + ", codigo=" + codigo + '}';
    }

    public void merendar() {
        System.out.println("Merienda");
    }

}

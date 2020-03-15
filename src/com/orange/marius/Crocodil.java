package com.orange.marius;

public class Crocodil implements Terestru, Acvatic, Salbatic{
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void inoata() {
        System.out.println("Crocodilul "+ nume  + " inoata.");
    }

    @Override
    public void merge() {
        System.out.println("Crocodilul "+ nume + " merge pe burta");
    }

    @Override
    public void sunet() {
        System.out.println("Crocodilul sasaie");
    }

    @Override
    public void mananca() {
        System.out.println("Crocodilul se hraneste cu pesti ");
    }

    @Override
    public void mediu() {
        System.out.println("Crocodilul traieste in zone tropicale, in apropierea lacurilor");
    }

    public String toString(){
        return String.format("Crocodil");
    }
}

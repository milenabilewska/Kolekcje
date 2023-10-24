package org.example.zad.linkedlist;

class Zadanie {
    private String nazwa;
    private boolean czyZakonczone;

    public Zadanie(String nazwa) {
        this.nazwa = nazwa;
        this.czyZakonczone = false; // Nowe zadania są domyślnie niezakończone
    }

    public String getNazwa() {
        return nazwa;
    }
    public boolean czyZakonczone() {
        return czyZakonczone;
    }

    public void oznaczJakoZakonczone() {
        czyZakonczone = true;
    }
}

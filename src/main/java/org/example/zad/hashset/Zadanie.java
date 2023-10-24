package org.example.zad.hashset;

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

    @Override
    public int hashCode() {
        return nazwa.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Zadanie zadanie = (Zadanie) obj;
        return nazwa.equals(zadanie.nazwa);
    }
}

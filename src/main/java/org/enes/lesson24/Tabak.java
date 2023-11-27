package org.enes.lesson24;

public class Tabak {
    private int id;
    private boolean kirliMi;

    public Tabak(int id) {
        this.id = id;
    }

    public Tabak(int id, boolean kirliMi) {
        this.id = id;
        this.kirliMi = kirliMi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isKirliMi() {
        return kirliMi;
    }

    public void setKirliMi(boolean kirliMi) {
        this.kirliMi = kirliMi;
    }

    @Override
    public String toString() {
        return "Tabak{" +
                "id=" + id +
                ", kirliMi=" + kirliMi +
                '}';
    }
}

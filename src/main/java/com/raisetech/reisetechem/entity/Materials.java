package com.raisetech.reisetechem.entity;

public class Materials {
    private int id;
    private String iupacName;
    private String generalName;

    public Materials(int id, String iupacName, String generalName) {
        this.id = id;
        this.iupacName = iupacName;
        this.generalName = generalName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIupacName() {
        return iupacName;
    }

    public void setIupacName(String iupacName) {
        this.iupacName = iupacName;
    }

    public String getGeneralName() {
        return generalName;
    }

    public void setGeneralName(String generalName) {
        this.generalName = generalName;
    }
}

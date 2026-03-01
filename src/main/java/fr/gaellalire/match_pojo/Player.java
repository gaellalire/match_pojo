package fr.gaellalire.match_pojo;

public class Player {

    private String name;

    private String identifier;

    private Integer uniformNumber;
    
    private boolean libero;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getUniformNumber() {
        return uniformNumber;
    }
    
    public void setUniformNumber(Integer uniformNumber) {
        this.uniformNumber = uniformNumber;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public boolean isLibero() {
        return libero;
    }

    public void setLibero(boolean libero) {
        this.libero = libero;
    }

}

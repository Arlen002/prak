package com.company;

public class Farm {
    private String ownerName;
    private String address;
    private Cow[] cows;
    private Sheep[] sheeps;
    private Horse[] horses;

    public Farm(String ownerName, String address, Cow[] cows, Sheep[] sheeps, Horse[] horses) {
        this.ownerName = ownerName;
        this.address = address;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }
    public void getmethod(){
        System.out.println("Владелец: "+getOwnerName()+", адрес - "+ getAddress());

        for (AbstractAnimal res :getCows()) {
            res.getMetod();
        }

        for (AbstractAnimal res2:getSheeps()) {
            res2.getMetod();
        }

        for (Horse res3:getHorses()) {
            res3.method3();
        }
    }
}

package com.company;

public class Horse extends AbstractAnimal{
   private String colour;

    public Horse(String nickName, int age, String gender, int weight, String colour) {
        super(nickName, age, gender, weight);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void method3(){
        System.out.println(""+getNickName()+", жашы - "+getAge()+
                ", жынысы - "+getGender()+", салмагы - "+getWeight()+", тусу - "+getColour());
    }

}

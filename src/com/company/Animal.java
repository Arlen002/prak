package com.company;

abstract class AbstractAnimal {
    private String nickName;
    private  int age;
    private String gender;
    private int weight;

    public AbstractAnimal(){}

    public AbstractAnimal(String nickName, int age, String gender, int weight) {
        this.nickName = nickName;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
public void getMetod(){
    System.out.println(getNickName()+", жынысы - "
            +getGender()+
            ", жашы - "+getAge()+", салмагы - "+
            getWeight());
}

}

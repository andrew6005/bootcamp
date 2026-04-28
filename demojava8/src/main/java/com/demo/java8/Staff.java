package com.demo.java8;

enum Gender {
    Male, Female
}

class Staff {
    private String name;
    private Gender gender;

    public Staff(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public Gender getGender() { return gender; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return name; // Returns name for clean output matching your example
    }
}
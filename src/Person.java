public class Person {
    String surName, gender;
    int age;
    double height;


//    non-parameterizes constructor
    Person(){
        surName = "Nobody"; age = 0; height = 0.0;
    }

//    parametrised constructor
    Person(String sName, int a, double h, String aGender) {
        surName = sName; age = a;
        gender = aGender; height = h;
    }

//    the setSurName method
    public void setSurName(String mSurName) {
        surName = mSurName;
    }

//    set gender method
    public void setGender(String mGender) {
        gender = mGender;
    }

//    set age method
    public void setAge(int mAge) {
        age = mAge;
    }

//    set height method
    public void setHeight(double mheight) {
        height = mheight;
    }

//    get surName method
    public String getSurName() {
        return surName;
    }
//    get gender method
    public String getGender(){
        return gender;
    }
//    get Age method
    public int getAge(){
        return age;
    }
//    get height method
    public double getHeight(){
        return height;
    }

    public String toString() {
        String output = "\n\t SurName: " + getSurName();
        output += "\n\t Age: "+ getAge();
        output += "\n\t Height: "+ getHeight();
        output += "\n\t gender: "+ getGender();
        return output;
    }
}

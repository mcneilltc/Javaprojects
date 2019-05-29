public class User extends person {
    private String  gender, eyeColor, address, gender;
    private int phone;
    private boolean adult;


    public User(String name, String gender, String eyeColor, String address,
                String gender1, int age, int phone, boolean adult) {
        super(name, age);
        //this.name = name;//person is the super constructor, it is passing data to the user
        this.gender = gender;
        this.eyeColor = eyeColor;
        this.address = address;
        this.gender = gender1;
       // this.age = age;// are added to person, and being extended from person.java
        this.phone = phone;
        this.adult = adult;
    }

    public User(String name, int age, boolean adult) {
        this.name = name;
        this.age = age;
        this.adult = adult;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public boolean isAdult() {
        if(this.getAge() <21)
            this.adult =false;

        else {
            this.adult = true;
        }
        return this.adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

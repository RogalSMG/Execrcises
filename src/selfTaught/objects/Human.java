package selfTaught.objects;

public class Human {
    Integer age;
    Integer height;
    String name;
    Sex userSex;

    public Human(int age, int height, String name, Sex userSex) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.userSex = userSex;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public Sex getUserSex() {
        return userSex;
    }

}

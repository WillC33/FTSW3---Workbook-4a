public class Person {
    private String name;
   private int age;
    private double height;
    private double weight;

    //constructor
    public Person(String name, int age, double height, double weight) {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    //get methods
    public String getName() {
      return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    //set methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void whoIs() {
        this.name = getName();
        this.age = getAge();
        this.height = getHeight();
        this.weight = getWeight();
        System.out.println(this + " is: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Height: " + this.height + "cm");
        System.out.println("Weight: " + this.weight + "lbs");
        System.out.println();
    }

    //extension exercise

    public void growOlder() {
        System.out.println(this.name + " gets a little older!\n");
        this.age += 1;
        this.height -= 1;
        this.weight -= 0.5;
    }

}


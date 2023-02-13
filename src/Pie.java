public class Pie {
    String filling;
    String pastryType;
    int slices;

    public Pie(String filling, String pastryType) {
        this.filling = filling;
        this.pastryType = pastryType;
        this.slices = 8;
        aboutPie();
    }

    private void aboutPie() {
        System.out.println("This " +  pastryType +  " " + filling + " pie has " + slices + " slices");
    }

    private void eatSlice(int slicesEaten) {
        slices = slices - slicesEaten;
        System.out.println("\nYou eat some of the pie...");
        System.out.println("There are " + slices + " slices " + this.filling + " pie left!");
    }

    public static void main(String[] args) {
        Pie porkPie = new Pie("Pork", "Hot Water Crust");
        Pie chickenMush = new Pie("Chicken & Mushroom", "Puff pastry");
        Pie steakAle = new Pie("Steak & Ale", "Shortcrust pastry");

        chickenMush.eatSlice(1);
        chickenMush.eatSlice(1);
        steakAle.eatSlice(3);
        porkPie.eatSlice(1);
    }
}


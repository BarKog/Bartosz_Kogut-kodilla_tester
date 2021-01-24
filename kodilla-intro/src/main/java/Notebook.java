public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 300) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("This price is good.");
        } else if (this.price < 1100 && this.year > 2017) {
            System.out.println("This device has best price for presented quality");
        } else if (this.price < 700 && this.year < 2014) {
            System.out.println("This device is a great budget option");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

        public void checkWeight() {
            if (this.weight < 650) {
                System.out.println("This notebook is light");
            } else if (this.weight > 650 && this.weight < 1500) {
                System.out.println("This notebook is not that heavy");
            } else {
                System.out.println("This notebook is quite heavy");
            }
        }
    }

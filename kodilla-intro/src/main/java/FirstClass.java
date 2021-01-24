public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000,2018);
        System.out.println(notebook.weight + "g" + " " + notebook.price + "USD" + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();

        Notebook heavyNotebook = new Notebook(2000,1500,2020);
        System.out.println(heavyNotebook.weight +"g" + " " + heavyNotebook.price + "USD" + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();

        Notebook oldNotebook = new Notebook(1200,600,2012);
        System.out.println(oldNotebook.weight + "g" + " " + oldNotebook.price + "USD" + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();

        Notebook junkNotebook = new Notebook(3000,200,2000);
        System.out.println(junkNotebook.weight + "g" + "" + junkNotebook.price + "USD" + "" + junkNotebook.year);
        junkNotebook.checkPrice();
        junkNotebook.checkWeight();
    }
}
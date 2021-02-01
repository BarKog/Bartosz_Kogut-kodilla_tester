public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000,2018);
        Notebook heavyNotebook = new Notebook(2000,1500,2020);
        Notebook oldNotebook = new Notebook(1200,600,2012);
        Notebook junkNotebook = new Notebook(3000,200,2000);

        checkNotebookParameters(notebook);
        checkNotebookParameters(heavyNotebook);
        checkNotebookParameters(oldNotebook);
        checkNotebookParameters(junkNotebook);
    }

    public static void checkNotebookParameters(Notebook notebook) {
        System.out.println(notebook.weight + "g" + " " + notebook.price + "USD" + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
    }

    public void toNieJestMetodaStatyczna(){

    }
}
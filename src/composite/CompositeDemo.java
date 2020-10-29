package composite;

/**
 * @author Mohammad.Abbasi
 * @created 29/10/2020
 */
public class CompositeDemo {
    public static void main(String[] args) {
        Employee developer1 = new Developer(1,"Mohammad Abbasi","Senior Java Developer");
        Employee developer2 = new Developer(2,"Parham Abbasi","C# Developer");
        Employee developer3 = new Developer(3,"Panisa Abbasi","Web Developer");

        Manager manager1 = new Manager(4,"AmirAli Abbasi","Modern Manager");
        Manager manager2 = new Manager(5,"Parsa Abbasi","Banco Manager");

        manager1.addEmployee(developer1);
        manager1.addEmployee(developer2);
        manager2.addEmployee(developer3);

        manager1.showDetails();
        manager2.showDetails();
    }
}

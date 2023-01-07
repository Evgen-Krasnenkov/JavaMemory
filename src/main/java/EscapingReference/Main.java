package EscapingReference;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));

        for (Customer next : records.getCustomers().values())
        {
            System.out.println(next);
        }
        records.getCustomers().clear();
        records.getCustomers().entrySet().stream()
                .forEach(System.out::println);

        CustomerReadOnly john = records.getCustomerByName("John");
        Customer john1 = (Customer) john;
        //john.setName();
        john1.setName("Derek");
        System.out.println(john1);
        System.out.println(records.getCustomerByName("Derek"));
        System.out.println(records.getCustomerByName("John"));
    }

}

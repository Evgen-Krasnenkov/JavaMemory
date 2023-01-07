package EscapingReference;

import java.util.Map;

public interface CustomerRecordsReadOnly {
    Map<String, Customer> getCustomers();

    CustomerReadOnly getCustomerByName(String Name);
}

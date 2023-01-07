package GarbadgeCollector;

import java.util.Objects;

public class Customer {
    int s = 0;
    public Customer() {
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return s == customer.s;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("This Finalize at Customer Class");
    }

    @Override
    public int hashCode() {
        return Objects.hash(s);
    }
}

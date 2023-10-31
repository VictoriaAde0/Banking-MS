public class Customer {
    public String name;
    private String contactInformation;
    private int customerIdentification;


    public Customer(){
    }
    public Customer(String name, String contactInformation, int customerIdentification){
        this.name = name;
        this.contactInformation = contactInformation;
        this.customerIdentification =customerIdentification;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {

        this.contactInformation = contactInformation;
    }

    public int getCustomerIdentification() {

        return customerIdentification;
    }

    public void setCustomerIdentification(int customerIdentification) {
        this.customerIdentification = customerIdentification;
    }
}

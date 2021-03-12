package br.com.design.patterns.creational.builder;

public class Customer {
    private Long id;
    private String name;
    private Integer age;
    private String phoneNumber;
    private String address;
    private String admissionDate;
    private String dismissalDate;

    public static class Builder {
        private Long id;
        private String name;
        private Integer age;
        private String phoneNumber;
        private String address;
        private String admissionDate;
        private String dismissalDate;

        //If a attribute is important we put it in constructor
        public Builder(Long id) {
            this.id = id;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAdmissionDate(String admissionDate) {
            this.admissionDate = admissionDate;
            return this;
        }

        public Builder setDismissalDate(String dismissalDate) {
            this.dismissalDate = dismissalDate;
            return this;
        }

        public Customer build() {
            Customer customer = new Customer();
            customer.id = this.id;
            customer.age = this.age;
            customer.name = this.name;
            customer.address = this.address;
            customer.admissionDate = this.admissionDate;
            customer.dismissalDate = this.dismissalDate;
            return customer;
        }

    }

    public static void main(String[] args) {
        Customer customer = new Builder(1L)
                .setName("Fernanda")
                .setAge(20)
                .setPhoneNumber("11987267827")
                .setAddress("Avenida São João, 70")
                .setAdmissionDate("10/10/2019")
                .setDismissalDate("13/01/2020")
                .build();
    }
}





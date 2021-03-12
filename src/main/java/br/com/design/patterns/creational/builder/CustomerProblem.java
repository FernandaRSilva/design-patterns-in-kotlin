package br.com.design.patterns.creational.builder;/*
Considering br.com.design.patterns.creational.builder.CustomerProblem class:
    Problems: 1 - What if we want to turn phoneNumber and dismissalDate into optional attributes?
              2 - How can we make the instantiation of br.com.design.patterns.creational.builder.Customer class readable? If we have a class with many
              attributes, developers will not know what attribute the value is referring to.
 */

public class CustomerProblem {
    private Long id;
    private String name;
    private Integer age;
    private String phoneNumber;
    private String address;
    private String admissionDate;
    private String dismissalDate;

    public CustomerProblem(Long id, String name, Integer age, String phoneNumber, String address, String admissionDate, String dismissalDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.admissionDate = admissionDate;
        this.dismissalDate = dismissalDate;
    }

    // We could make others constructors to make phone or dismissalDate optionals like:
    public CustomerProblem(Long id, String name, Integer age, String address, String admissionDate, String dismissalDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.admissionDate = admissionDate;
        this.dismissalDate = dismissalDate;
    }
    // But not worthy it if we have many optional attributes

    public static void main(String[] args) {
        CustomerProblem customerProblem = new CustomerProblem(
                1L,
                "Fernanda",
                23,
                "11987267827",
                "Avenida São João, 70",
                "10/10/2019",
                "13/01/2020");
        // If we have many attributes, it would be a problem for other developers differentiate
    }
}




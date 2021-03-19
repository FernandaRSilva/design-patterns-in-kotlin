package br.com.design.patterns.creational.builder.kotlin.br.com.design.patterns.creational.builder

/*
    We can implement Builder Pattern in Kotlin, but it is recommended to avoid it, once
    is a long solution and hard to implement and once Kotlin has many language features for it.
 */

class Customer private constructor (
        private val id: Long,
        private val name: String,
        private val age: Int,
        private val address: String,
        private val admissionDate: String
) {

    private var phoneNumber: String? = null
    private var dismissalDate: String? = null

    internal class Builder(
            private var id: Long,
            private var name: String,
            private var age: Int,
            private var address: String,
            private var admissionDate: String

    ) {
        private var customerToBuild: Customer? = null

        init {
            customerToBuild =
                Customer(
                    id,
                    name,
                    age,
                    address,
                    admissionDate
                )
        }

        internal fun build(): Customer? {
            return customerToBuild
        }

        fun setPhoneNumber(phoneNumber: String): Builder {
            customerToBuild!!.phoneNumber = phoneNumber
            return this
        }

        fun setDismissalDate(dismissalDate: String): Builder {
            customerToBuild!!.dismissalDate = dismissalDate
            return this
        }
    }



}

fun main() {
    val customer = Customer.Builder(
        id = 1,
        name = "Fernanda",
        age = 23,
        address = "Avenida São João, 70",
        admissionDate = "10/10/2019"
    )
            .setDismissalDate("13/01/2020")
            .setPhoneNumber("11987267827")
            .build()
}








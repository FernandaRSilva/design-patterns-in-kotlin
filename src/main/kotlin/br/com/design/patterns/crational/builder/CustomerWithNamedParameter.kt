package br.com.design.patterns.creational.builder.kotlin.br.com.design.patterns.creational.builder

/*
    When comes to Kotlin, its features(optional and named parameter) makes Builder Pattern unusable, resulting in a
    shorter and readable class. This implementation makes possible the usability of immutable properties in projects.
 */

class CustomerWithoutBuilder (
        private val id: Long,
        private val name: String,
        private val age: Int,
        private val address: String,
        private val admissionDate: String,
        private val phoneNumber: String? = null,
        private val dismissalDate: String? = null
)

fun main() {
    val customerWithoutBuilder =
            CustomerWithoutBuilder(
                    id = 1,
                    name = "Fernanda",
                    age = 23,
                    address = "Avenida São João, 70",
                    admissionDate = "10/10/2019"
            )
}

package br.com.design.patterns.creational.builder.kotlin.br.com.design.patterns.creational.builder

/*
    Using default parameters plus function apply of Kotlin, make this pattern more readable and shorter.
 */

class CustomerWithApply (
        private val id: Long,
        private val name: String,
        private val age: Int,
        private var phoneNumber: String? = null,
        private val address: String,
        private val admissionDate: String,
        private var dismissalDate: String? = null
) {
    fun setPhoneNumber(phoneNumber: String) = apply {
        this.phoneNumber = phoneNumber
    }

    fun setDismissalDate(dismissalDate: String) = apply {
        this.dismissalDate = dismissalDate
    }
}

fun main() {
    val customerWithApply = CustomerWithApply(
        id = 1,
        name = "Fernanda",
        age = 23,
        address = "Avenida São João, 70",
        admissionDate = "10/10/2019"
    )
            .setDismissalDate("13/01/2020")
            .setPhoneNumber("11987267827")
}
package br.com.design.patterns.creational.singleton

import java.math.BigDecimal

/*
    Object command of kotlin already create a private constructor,
     ensuring that there is no more than one instantiation of this class, i.e., singletons out-of-the-box.
 */

object PrinterWithObject {

    fun printDeposit(amount: BigDecimal, toAccount: String) {
        println("Deposit of $amount with success in account $toAccount.")
    }

    fun printTransfer(amount: BigDecimal, toAccount: String, fromAccount: String) {
        println("Transfer from account $fromAccount of $amount  with success to account $toAccount.")
    }
}

fun main() {
    PrinterWithObject.printDeposit(BigDecimal.valueOf(150.00), "123456789")
    PrinterWithObject.printTransfer(BigDecimal.valueOf(150.00), "123456789", "987654321")
}
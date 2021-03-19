package br.com.design.patterns.creational.singleton

import java.math.BigDecimal

/*
    Companion object is equivalent to static in java. So, if we want to use companion objects to create singletons and
    ensure that only one instance of it is created, we need to create the logic for it.
 */

class PrinterWithCompanionObject {
    companion object{
        private var INSTANCE: PrinterWithCompanionObject? = null

        val instance: PrinterWithCompanionObject
            get() {
                if (PrinterWithCompanionObject.INSTANCE == null) {
                    PrinterWithCompanionObject.INSTANCE = PrinterWithCompanionObject()
                }

                return PrinterWithCompanionObject.INSTANCE!!
            }
    }

    fun printDeposit(amount: BigDecimal, toAccount: String) {
        println("Deposit of $amount with success in account $toAccount.")
    }

    fun printTransfer(amount: BigDecimal, toAccount: String, fromAccount: String) {
        println("Transfer from account $fromAccount of $amount  with success to account $toAccount.")
    }

}

fun main() {
    val printerWithCompanionObject = PrinterWithCompanionObject.instance
    printerWithCompanionObject.printDeposit(BigDecimal.valueOf(150.00), "123456789")
    printerWithCompanionObject.printTransfer(BigDecimal.valueOf(150.00), "123456789", "987654321")
}

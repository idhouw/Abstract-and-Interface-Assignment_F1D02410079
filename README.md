# OOP Case Study - Payment System

Simple Java implementation demonstrating Abstract Class, Interface, Inheritance, and Polymorphism using a digital payment case study.

**Name:** Muhammad Ridho Kurniawan

**NIM:** F1D02410079 

**Class:** 5A  

## Class Diagram

<img width="1246" height="666" alt="image" src="https://github.com/user-attachments/assets/bb7a1b22-b44b-4a63-ab68-3639e44b93bf" />


## Code Explanation

* **Abstract Class (`Payment`)**  
  Acts as the base class since every transaction needs a `transactionId` and `amount`. It contains an abstract method `processPayment()` because each payment method handles transactions differently.
* **Interface (`CashbackPromo`)**  
  Created separately because not all payment methods offer cashback. Here, only `EWallet` implements `CashbackPromo`, while `BankTransfer` does not.
* **Inheritance**  
  Both `EWallet` and `BankTransfer` use `extends Payment` to inherit the core attributes (`transactionId`, `amount`) and the `displayBasicInfo()` method without rewriting them.
* **Polymorphism**  
  Implemented through method overriding on `processPayment()` in each subclass (`EWallet` calculates a 5% cashback, while `BankTransfer` adds a Rp2,500 admin fee). In the `main` method, objects are also instantiated using the superclass reference (`Payment tx1 = new EWallet(...)`).

#Bank Acoount Management System

## Overview
This is a simple Java application for managing bank accounts. It allows users to open different types of accounts (Savings, Salary, Current), perform transactions (deposit, withdraw), and display account details.

## Features

- **Account Types:**
  - Saving Account
  - Salary Account
  - Current Account

- **Operations:**
  - Open new accounts
  - Deposit money
  - Withdraw money
  - Display account transactions

  - Automatic Account Number Generation:
  - Account numbers are automatically generated and incremented.

### Prerequisites

- Java (version 18.0)
- Any IDE that supports Java (Eclipse, IntelliJ, etc.)

Project Structure
The project is structured as follows:

Account.java: Abstract class representing a generic bank account.
SavingAccount.java: Implementation of the Saving Account.
CurrentAccount.java: Implementation of the Current Account.
SalaryAccount.java: Implementation of the Salary Account.
AccountNumberGenerator.java: Class for generating auto-incremented account numbers.
Main.java: Main class to run the application.

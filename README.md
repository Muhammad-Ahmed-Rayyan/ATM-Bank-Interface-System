<div align="center">

# ATM-BANK-INTERFACE-SYSTEM

*Simulate a full-featured ATM & Banking system using Java Swing*

![last commit](https://img.shields.io/github/last-commit/Muhammad-Ahmed-Rayyan/ATM-Bank-Interface-System)
![Java](https://img.shields.io/badge/Java-100%25-orange)
![languages](https://img.shields.io/github/languages/count/Muhammad-Ahmed-Rayyan/Inventory-Management-System)

<br>

Built with:

![Java](https://img.shields.io/badge/Java-ED8B00?logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-UI-0db7ed?logo=java&logoColor=white)
![File Handling](https://img.shields.io/badge/File-Handling-green)
![Random](https://img.shields.io/badge/Random-PIN/Card-c9184a)

</div>

---

## ✨ Overview

The **ATM-BANK-INTERFACE-SYSTEM** is a desktop simulation of a simple banking infrastructure using Java. It includes:

- ATM interface for **withdrawals & balance checks**
- Bank interface for **account registration, deposits, and viewing account info**
- Integration with a **persistent data file (`data.txt`)** for storing customer data, ensuring data is saved across sessions.
- PIN & Card numbers are **securely randomly generated** during account registration.

Users can:
- **Register new accounts** with CNIC, Name, Initial Deposit.
- Receive **auto-generated unique PINs, Card numbers, and Account numbers.**
- Perform **deposits via Bank interface**.
- Use the **ATM interface to withdraw or check balances** by entering their PIN & Card.

---

## 📂 Repository Structure

```plaintext
📁 ATM-Bank-Interface-System
├── Bank.java
├── Bank.form
├── ATMHOME.java
├── ATMHOME.form
├── ATMPinConfirm.java
├── ATMPinConfirm.form
├── CheckBalance.java
├── CheckBalance.form
├── Withdraw.java
├── Withdraw.form
├── Customer.java
├── LinkedList.java
├── images/
│   └── round.png      # ATM round button image
└── data.txt           # persists all user records
```
---

## 🚀 How to Run

### 1️⃣ Requirements
- Java JDK installed
- Any IDE (e.g., NetBeans / IntelliJ / Eclipse) or run from command line.

---

### 2️⃣ Setup & Usage

1. **Clone the repository**
    ```bash
    git clone https://github.com/Muhammad-Ahmed-Rayyan/ATM-Bank-Interface-System.git
    cd ATM-Bank-Interface-System
    ```

2. **Open in your Java IDE** (or compile from CLI).

3. **Run `Bank.java`** to:
    - Register new accounts.
    - Make deposits.
    - View account details.
    - (Use the `Home` button to navigate to the ATM UI.)

4. **Run `ATMHOME.java` directly** to:
    - Withdraw money.
    - Check balance.
    - Requires entering the **randomly generated Card number & PIN** given at registration.

---

### 🔐 Where is my data saved?
All account information is **stored persistently in `data.txt`** in the project folder.  
So your balances, accounts, and transactions are saved across runs.

---

<div align="center">

⭐ If you like this project, don’t forget to give it a star on GitHub!

</div>

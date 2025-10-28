# 🏦 Green Banking App
A console-based Java application for managing bank accounts and transactions.
Designed to demonstrate clean architecture, OOP design, and modular project organization.

## 🚀 Features (Pipeline)
- Create new bank accounts
- Deposit and withdraw funds
- View account balance and transaction history
- Simple text-based menu navigation
- (Future) Save data between runs

## 🏗️ Project Architecture
```
src/com/yourname/bankapp/ 
│
├── model/ → Core data entities (Account, Transaction)
├── service/ → Business logic (deposits, withdrawals, etc.)
├── repository/ → Data storage management (in-memory or file-based)
├── ui/ → Console input/output and menu handling
├── exception/ → Custom exception handling
└── BankApplication.java → Program entry point
```
## ✅ Setup Checklist (Progress Tracker)
### Phase 1 — Project Setup
- [x] Create GitHub repository (`simple-banking-app`)
- [x] Initialize with `README.md` and Java `.gitignore`
- [x] Add base package (`com.yourname.bankapp`)
- [x] Create subpackages:
    - [x] `model`
    - [x] `service`
    - [x] `repository`
    - [x] `ui`
    - [x] `exception`
- [x] Add placeholder classes for each layer
- [x] Document architecture and checklist in `README.md`

---

### Phase 2 — Core Model Design
- [ ] Define `Account` class (fields, behaviors, relationships)
- [ ] Define `Transaction` class (fields, relationships)
- [ ] Document model relationships in `README.md`

---

### Phase 3 — Business Logic Layer
- [ ] Outline responsibilities for `AccountService` and `TransactionService`
- [ ] Design custom exceptions (`InsufficientFundsException`, `AccountNotFoundException`)
- [ ] Plan validation and error-handling flow

---

### Phase 4 — User Interface Layer
- [ ] Design console menu navigation
- [ ] Integrate UI with the service layer
- [ ] Add input validation and user feedback mechanisms

---

### Phase 5 — Testing & Persistence
- [ ] Implement in-memory testing of account operations
- [ ] Optional: Add file-based storage or serialization
- [ ] Conduct manual and automated testing (JUnit optional)


## 💡 Author
ceoDemitri <br>
Intermediate Java Developer, practicing object-oriented design and architecture.
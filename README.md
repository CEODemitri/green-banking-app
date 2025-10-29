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
src/com/ceodemitri/greenbankingapp/ 
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

## 🏦 `Account` Class — Design Overview

**Purpose:**  
Represents an individual bank account with information about its owner, balance, and activity.

**Conceptual Responsibilities:**
- Store identifying details about the account.
- Maintain and update the account balance.
- Link to transactions for audit or history.
- Enforce basic rules (no negative balances, unique identifiers).

**Attributes:**
| Field | Type | Description |
|-------|------|-------------|
| `accountId` |  long | Unique identifier for the account |
| `ownerName` | String | Name of the account holder |
| `balance` | double | Current balance of the account |
| `transactions` | List\<Transaction\> | Record of all transactions related to this account |
| `createdAt` | LocalDateTime | Timestamp of account creation |

**Behaviors (methods to plan):**
- `deposit(amount)` — increases balance and records a transaction
- `withdraw(amount)` — decreases balance and records a transaction
- `getBalance()` — returns current balance
- `getTransactions()` — retrieves transaction list

**Design Notes:**
- Used **encapsulation** — made fields private and exposed access via getters/setters.
- Validate that deposits/withdrawals use positive amounts.
- Ensure the balance never becomes negative.
- No user input or printing yet — will add at UI layer.

---

### 💰 `Transaction` Class — Design Overview

**Purpose:**  
Represents a financial action (deposit, withdrawal, or transfer) linked to an account.

**Conceptual Responsibilities:**
- Record the details of a single transaction.
- Track the type, amount, and resulting balance.
- Provide a historical audit trail for each account.

**Attributes (fields):**
| Field | Type | Description |
|-------|------|-------------|
| `transactionId` | long | Unique ID for each transaction |
| `accountId` | long | Associated account’s ID |
| `type` | Enum | Transaction type (DEPOSIT, WITHDRAWAL, TRANSFER) |
| `amount` | double | Transaction amount |
| `timestamp` | LocalDateTime | When the transaction occurred |
| `balanceAfterTransaction` | double | Account balance after the transaction |

**Behaviors (methods to plan):**
- Constructor for initializing transaction data.
- `toString()` for clean display in transaction history.
- (Optional) Validation to prevent invalid amounts or missing account references.

**Design Notes:**
- Consider using an **enum** for transaction type to avoid string errors.
- This class should be **immutable** once created — transactions shouldn’t be changed retroactively.
- No user I/O — this is a pure data model.


### 🔗 Relationship Between Models

- One `Account` ↔ Many `Transaction` (One-to-Many relationship).
- `Transaction` references the `accountId` to identify which account it belongs to.
- The `Account` maintains a list of its `Transaction` objects for quick access to history.


### Phase 2 — Core Model Design
- [x] Define `Account` class (fields, behaviors, relationships)
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
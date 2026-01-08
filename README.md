# **TODO_List_Project**

A full-stack Java-based **Task Management (TODO List)** application that allows users to create, update, delete, and track daily tasks using a **layered architecture**, **database persistence**, and **clean MVC design**.

This project demonstrates **real-world CRUD operations**, **business logic implementation**, and **database-driven web application development**.

---

## **📌 Project Overview**

The **TODO List Project** is designed to help users manage their daily tasks efficiently.
Users can add new tasks, update their status, mark them as completed, and remove tasks.
All tasks are stored persistently in a relational database.

---

## **🏗️ System Architecture**

```
Presentation Layer (JSP / Controller)
        ↓
Service Layer (Business Logic)
        ↓
DAO Layer (Database Access)
        ↓
Database (MySQL)
```

## **🧩 Layer Responsibilities**

| Layer      | Description             |
| ---------- | ----------------------- |
| Bean       | Stores task data        |
| DAO        | Handles database CRUD   |
| Service    | Applies business rules  |
| Util       | Manages JDBC connection |
| Controller | Handles user requests   |
| UI         | Displays tasks          |

---

## **🛠️ Technology Stack**

* **Java**
* **JDBC**
* **Servlets & JSP**
* **MySQL**
* **Apache Tomcat**
* **Eclipse IDE**
* **MVC Architecture**

---

## **🗄️ Database Design**

### **Database Name**

```
todo_db
```

### **Table Name**

```
tasks
```

### **SQL Schema**

```sql
CREATE TABLE tasks (
    task_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    description VARCHAR(255),
    status VARCHAR(20),
    created_date TIMESTAMP
);
```

---

## **📌 Task Status**

| Status      |
| ----------- |
| PENDING     |
| IN_PROGRESS |
| COMPLETED   |

---

## **⚙️ Application Features**

* Add new task
* Update task
* Delete task
* Mark task as completed
* View all tasks

---

## **🔌 JDBC Configuration**

```
jdbc:mysql://localhost:3306/todo_db
Username: root
Password: (empty)
```

---

## **⚙️ Setup & Execution**

1. Install **XAMPP**
2. Start **MySQL & Apache**
3. Create database `todo_db`
4. Execute SQL schema
5. Import project into **Eclipse**
6. Add MySQL JDBC driver
7. Deploy on **Apache Tomcat**
8. Run the application

---

## **📈 Workflow**

1. User creates a task
2. Task stored in database
3. User updates or completes task
4. Changes saved in MySQL
5. Task list refreshed

---

## **📊 Sample Data**

| ID | Title                       | Status      |
| -- | --------------------------- | ----------- |
| 1  | Complete Java Assignment    | COMPLETED   |
| 2  | Prepare for Wipro Interview | IN_PROGRESS |


Just tell me 🚀

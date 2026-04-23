# 🏥 Health Management System (Priority Queue Based)

## 📌 Overview

This project is a **Health Management System** designed to manage patient records efficiently using a **Priority Queue** concept. The system allows users to enter patient details through a simple UI, which are then processed and stored in a backend system.

The core idea is to **prioritize patients based on urgency**, making the system scalable for real-world healthcare scenarios.

---

## 🚀 Tech Stack

| Layer          | Technology            |
| -------------- | --------------------- |
| Frontend       | HTML, CSS, JavaScript |
| Backend        | Spring Boot (Java)    |
| Database       | MySQL                 |
| Data Structure | Priority Queue        |

---

## ⚙️ Features

* 🧾 Add patient details via UI
* 🔄 Data sent to backend using REST APIs
* 🗂️ Store patient data in MySQL database
* ⚡ Priority-based handling using Queue logic
* 📊 Structured backend with Controller, Service, Repository layers

---

## 🧠 Core Concept: Priority Queue

The system uses a **Priority Queue** to manage patients based on urgency level.

* Higher priority → treated first
* Efficient handling of emergency cases
* Can be extended to real hospital workflows

---

## 📂 Project Structure

```
healthcare-backend/
│── controller/
│── service/
│── repository/
│── model/
│── resources/

Healthcare_Frontend/
│── HTML
│── CSS
│── JavaScript
```

---

## 🔌 How It Works

1. User enters patient details in frontend
2. Frontend sends request to backend API
3. Backend processes and stores data
4. Data is saved in MySQL database
5. Priority logic can be applied for patient handling

---

## ▶️ How to Run

### Backend (Spring Boot)

```bash
mvn spring-boot:run
```

### Frontend

* Open HTML file in browser

---

## 🗄️ Database Setup

* Install MySQL
* Create database:

```sql
CREATE DATABASE healthcare_db;
```

* Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/healthcare_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

---

## 📌 Future Enhancements

* Add authentication (login/signup)
* Implement real-time priority scheduling
* Doctor dashboard
* Appointment booking system
  

---

## 👨‍💻 Author

* Developed as a **full-stack project using Spring Boot + MySQL + JS**
* Focused on **DSA + Real-world application (Priority Queue)**

---

## ⭐ Conclusion

This project demonstrates:

* Full-stack development skills
* Backend architecture (Spring Boot)
* Database integration
* Practical use of Data Structures (Priority Queue)


# 🛒 E-Commerce Backend Application (Spring Boot)

This is a **Backend-focused E-Commerce web application** built using **Spring Boot**.  
It provides REST APIs for handling basic e-commerce features such as product management, categories listing, and a contact form. The application uses an in-memory H2 database for rapid development and testing.

---

## 🚀 Features

- ✅ **Home API** — Basic home page endpoint
- ✅ **Product APIs** — Add, view, update, and delete product data
- ✅ **Categories API** — Access category listings
- ✅ **Contact Us API** — Submit queries or feedback
- ✅ **Tested using Postman** — All endpoints are verified and working
- ✅ **Lightweight H2 Database** — Data resets on restart for clean testing

---

## 🛠️ Tech Stack

| Technology | Description |
|------------|-------------|
| Java       | Backend programming language |
| Spring Boot | Main framework used |
| Spring Web | RESTful web services |
| Spring DevTools | Auto-reload for dev |
| Lombok     | For boilerplate code reduction |
| H2 Database | In-memory testing database |
| Postman    | For testing all APIs |

---

## 📦 API Endpoints

| Method | Endpoint               | Description                          |
|--------|------------------------|--------------------------------------|
| GET    | `/home`                | Returns homepage info                |
| GET    | `/products`            | Get all products                     |
| GET    | `/products/{id}`       | Get a product by ID                  |
| POST   | `/products`            | Add a new product                    |
| PUT    | `/products/{id}`       | Update product details by ID         |
| DELETE | `/products/{id}`       | Delete product by ID                 |
| GET    | `/categories`          | View all categories                  |
| POST   | `/contact`             | Submit contact/inquiry details       |

---

## 📬 API Testing Status

✅ All endpoints tested via **Postman**  
📍 Data can be viewed, added, updated, and deleted  
⚠️ H2 resets data on restart (can migrate to MySQL)

---

## 🔧 How to Run the Project

1. **Clone the repository**
   ```bash
   git clone https://github.com/codebyysh/Ecom-project.git
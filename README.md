📦 Product Inventory System

A Full Stack Product Inventory Management Application built using Spring Boot, Angular, and MySQL.

🚀 Features

✅ Add Product
✅ View Products
✅ Update Product
✅ Delete Product
✅ Search Product
✅ Low Stock Indicator

🛠️ Technologies Used
Backend
Java
Spring Boot
Spring Data JPA
REST APIs
Frontend
Angular
TypeScript
Bootstrap
Database
MySQL
📂 Project Structure

Product-Inventory-System

├── backend

└── frontend

⚙️ Backend Setup
Open backend project
Configure MySQL in application.properties
Create database:

CREATE DATABASE inventory_db;

Run Spring Boot application

Backend runs on:

http://localhost:5454

⚙️ Frontend Setup
Open frontend folder
Install dependencies:

npm install

Run Angular application:

ng serve

Frontend runs on:

http://localhost:4200

🔗 REST API Endpoints
Method	Endpoint	Description
GET	/api/products	Get All Products
GET	/api/products/{id}	Get Product By ID
POST	/api/products	Add Product
PUT	/api/products/{id}	Update Product
DELETE	/api/products/{id}	Delete Product
GET	/api/products/search?name=Rice	Search Product

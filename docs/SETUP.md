# Setup Guide - Fashion E-Commerce Platform

Complete step-by-step guide to setup both backend and frontend for development.

---

## 📋 Prerequisites

### System Requirements
- **Java 25 LTS** (Temurin)
- **Node.js 18+** (for frontend)
- **PostgreSQL 13+** (database)
- **Docker & Docker Compose** (optional, recommended)
- **Git**

---

## 🚀 Quick Start with Docker (Recommended)

```bash
# Clone repository
git clone https://github.com/mfarhanzuhdi/fashion-ecommerce.git
cd fashion-ecommerce

# Start all services
docker-compose up --build
```

**Access points:**
- Frontend: http://localhost:3000
- Backend API: http://localhost:8080
- API Docs: http://localhost:8080/swagger-ui.html
- Database: localhost:5432

---

## 💻 Local Development Setup

### Step 1: Clone Repository

```bash
git clone https://github.com/mfarhanzuhdi/fashion-ecommerce.git
cd fashion-ecommerce
```

### Step 2: Setup Database

```bash
# Using Docker (Recommended)
docker run --name postgres-fashion \
  -e POSTGRES_DB=fashion_ecommerce_db \
  -e POSTGRES_USER=admin \
  -e POSTGRES_PASSWORD=admin_password \
  -p 5432:5432 \
  -d postgres:16-alpine
```

### Step 3: Setup Backend

```bash
cd backend

# Build project
./mvnw clean install

# Run tests
./mvnw test

# Start development server
./mvnw spring-boot:run
```

**Backend:** http://localhost:8080

### Step 4: Setup Frontend

```bash
cd frontend

# Install dependencies
npm install

# Start development server
npm run dev
```

**Frontend:** http://localhost:3000

---

## 📦 Useful Commands

### Backend

```bash
cd backend

./mvnw clean install       # Build
./mvnw test               # Run tests
./mvnw spring-boot:run    # Run dev
```

### Frontend

```bash
cd frontend

npm install               # Install dependencies
npm run dev              # Run dev
npm run build            # Build for production
npm run test             # Run tests
```

---

## 🐛 Troubleshooting

**Port already in use:**
```bash
# Change ports or stop existing containers
docker-compose down
```

**Database connection error:**
```bash
# Check if PostgreSQL is running
docker-compose ps
docker-compose logs db
```

---

## ✅ Verification

- [ ] Java 25 installed: `java -version`
- [ ] Node.js 18+ installed: `node -v`
- [ ] Backend running: http://localhost:8080/actuator/health
- [ ] Frontend running: http://localhost:3000
- [ ] Database connected: Check backend logs

---

**Happy coding! 🚀**
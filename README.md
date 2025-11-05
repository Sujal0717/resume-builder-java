# Resume Builder - Java Web Application

[![Deploy to Render](https://render.com/images/deploy-to-render-button.svg)](https://render.com)

A professional Resume Builder web application built with Java, Servlets, JSP, and XML. Create, customize, and export resumes in multiple formats (PDF and XML) with beautiful templates.

## 🚀 Live Demo

**Public URL:** `https://resume-builder-java.onrender.com` (Will be available after deployment)

## ✨ Features

### Core Functionality
- ✅ **Personal Information Input** - Collect name, email, contact details
- ✅ **Education Section** - Add academic qualifications
- ✅ **Experience Section** - Work history, internships, certifications
- ✅ **Skills & Achievements** - Highlight technical and soft skills
- ✅ **Multiple Templates** - Classic, Modern, and Creative designs
- ✅ **XML Export** - Save resume data for reusability
- ✅ **PDF Generation** - Professional PDF output using iText
- ✅ **Resume Dashboard** - Manage and edit saved resumes
- ✅ **Preview Mode** - Live preview before downloading

### Technical Features
- Java Servlets for backend logic
- JSP for dynamic templating
- XML for data storage
- iText library for PDF generation
- Responsive design with modern CSS
- Session management for user data
- Docker containerization

## 🛠️ Tech Stack

- **Backend:** Java 11, Servlets, JSP
- **Build Tool:** Maven 3.8+
- **Server:** Apache Tomcat 9.0
- **Libraries:**
  - iText 7.2.5 (PDF generation)
  - GSON 2.10.1 (JSON processing)
  - JAXB 2.3.1 (XML binding)
- **Containerization:** Docker
- **Deployment:** Render.com

## 📋 Prerequisites

- Java 11 or higher
- Maven 3.6+
- Docker (for containerized deployment)
- Git

## 🏗️ Project Structure

```
resume-builder-java/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── resumebuilder/
│       │           ├── servlet/
│       │           │   ├── ResumeServlet.java
│       │           │   ├── PDFServlet.java
│       │           │   └── XMLServlet.java
│       │           ├── model/
│       │           │   └── Resume.java
│       │           └── util/
│       │               ├── PDFGenerator.java
│       │               └── XMLHandler.java
│       ├── webapp/
│       │   ├── WEB-INF/
│       │   │   ├── web.xml
│       │   │   └── jsp/
│       │   │       ├── index.jsp
│       │   │       ├── form.jsp
│       │   │       ├── preview.jsp
│       │   │       └── dashboard.jsp
│       │   ├── css/
│       │   │   └── styles.css
│       │   └── js/
│       │       └── script.js
│       └── resources/
│           └── templates/
│               ├── classic.xml
│               ├── modern.xml
│               └── creative.xml
├── Dockerfile
├── pom.xml
└── README.md
```

## 🚀 Quick Start

### Local Development

1. **Clone the repository**
   ```bash
   git clone https://github.com/Sujal0717/resume-builder-java.git
   cd resume-builder-java
   ```

2. **Build with Maven**
   ```bash
   mvn clean install
   ```

3. **Run with Maven (Embedded Tomcat)**
   ```bash
   mvn tomcat7:run
   ```

4. **Access the application**
   - Open browser: `http://localhost:8080`

### Docker Deployment

1. **Build Docker image**
   ```bash
   docker build -t resume-builder .
   ```

2. **Run container**
   ```bash
   docker run -p 8080:8080 resume-builder
   ```

3. **Access application**
   - Open browser: `http://localhost:8080`

## 🌐 Deploy to Render

### Step 1: Connect Repository
1. Go to [Render Dashboard](https://dashboard.render.com)
2. Click "New +" → "Web Service"
3. Connect your GitHub account
4. Select `resume-builder-java` repository

### Step 2: Configure Service
- **Name:** resume-builder-java
- **Environment:** Docker
- **Region:** Choose closest to your users
- **Branch:** main
- **Build Command:** (Auto-detected from Dockerfile)
- **Start Command:** (Auto-detected from Dockerfile)

### Step 3: Deploy
1. Click "Create Web Service"
2. Wait for deployment (5-10 minutes)
3. Access your app at the provided URL

## 📝 Usage Guide

### Creating a Resume

1. **Navigate to Home Page**
   - Click "Create New Resume"

2. **Fill Personal Information**
   - Name, Email, Phone, Address

3. **Add Education**
   - Degree, Institution, Year, GPA

4. **Add Experience**
   - Company, Role, Duration, Responsibilities

5. **Add Skills**
   - Technical skills, Soft skills, Languages

6. **Choose Template**
   - Classic: Traditional format
   - Modern: Clean, contemporary design
   - Creative: Bold, standout layout

7. **Preview & Export**
   - Preview your resume
   - Download as PDF
   - Save as XML for future editing

### Managing Resumes

- **Dashboard:** View all saved resumes
- **Edit:** Update any section
- **Delete:** Remove unwanted resumes
- **Version Control:** Save multiple versions

## 🎨 Templates

### Classic Template
- Traditional layout
- Professional fonts
- Clean sections
- Best for: Corporate, Finance, Law

### Modern Template
- Contemporary design
- Color accents
- Visual hierarchy
- Best for: Tech, Startups, Creative

### Creative Template
- Bold typography
- Custom layouts
- Unique styling
- Best for: Design, Marketing, Arts

## 🔧 Configuration

### Environment Variables

Create `.env` file (optional):
```env
PORT=8080
MAX_RESUME_SIZE=5MB
SESSION_TIMEOUT=30
```

### Database (Future Enhancement)
Currently uses session storage. For production:
- MySQL/PostgreSQL for data persistence
- User authentication
- Cloud storage for PDFs

## 🧪 Testing

```bash
# Run unit tests
mvn test

# Run integration tests
mvn verify
```

## 📚 API Endpoints

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/` | GET | Home page |
| `/createResume` | POST | Create new resume |
| `/preview` | GET | Preview resume |
| `/download/pdf` | GET | Download PDF |
| `/download/xml` | GET | Download XML |
| `/dashboard` | GET | View all resumes |
| `/edit/{id}` | GET | Edit resume |
| `/delete/{id}` | DELETE | Delete resume |

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit changes (`git commit -m 'Add AmazingFeature'`)
4. Push to branch (`git push origin feature/AmazingFeature`)
5. Open Pull Request

## 📄 License

This project is licensed under the MIT License.

## 👥 Authors

- **Sujal** - [GitHub Profile](https://github.com/Sujal0717)

## 🙏 Acknowledgments

- iText for PDF generation
- Apache Tomcat team
- Render.com for hosting
- Open source community

## 📞 Support

- **Issues:** [GitHub Issues](https://github.com/Sujal0717/resume-builder-java/issues)
- **Discussions:** [GitHub Discussions](https://github.com/Sujal0717/resume-builder-java/discussions)

## 🔮 Future Enhancements

- [ ] User authentication and authorization
- [ ] Database integration (MySQL/PostgreSQL)
- [ ] LinkedIn integration
- [ ] AI-based resume suggestions
- [ ] ATS (Applicant Tracking System) optimization
- [ ] Multiple language support
- [ ] Cover letter generator
- [ ] Resume scoring system
- [ ] Job portal integration
- [ ] Mobile app (React Native)

## 📊 Project Status

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![License](https://img.shields.io/badge/license-MIT-blue)
![Java](https://img.shields.io/badge/Java-11-orange)
![Maven](https://img.shields.io/badge/Maven-3.8+-red)

---

⭐ **Star this repo if you find it helpful!**

🔗 **Public URL:** Deploy on Render to get your public link

💼 **Perfect for:** Students, Job Seekers, Career Switchers, Professionals

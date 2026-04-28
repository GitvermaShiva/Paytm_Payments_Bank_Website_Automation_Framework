# Paytm Payments Bank Website Automation Framework

A comprehensive test automation framework for Paytm Payments Bank website using Selenium, Java, TestNG, and CI/CD integration.

## Overview

This automation framework is designed to automate web testing for the Paytm Payments Bank website, ensuring high-quality user experience and functional correctness across all features.

## Features

- **Selenium WebDriver** - For web browser automation
- **Java** - Core programming language
- **TestNG** - Testing framework with advanced reporting
- **Page Object Model** - Maintainable and scalable test structure
- **CI/CD Integration** - Automated test execution in pipelines
- **Parallel Execution** - Run tests concurrently for faster feedback
- **Detailed Reporting** - Comprehensive test reports and logs

## Technologies Used

- Java 8+
- Selenium WebDriver 4.x
- TestNG 7.x
- Maven
- Log4j (for logging)
- Extent Reports (for advanced reporting)

## Project Structure

```
Paytm_Payments_Bank_Website_Automation_Framework/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── (Page Object classes)
│   │   └── resources/
│   │       └── (Configuration files)
│   └── test/
│       └── java/
│           └── (Test classes)
├── pom.xml
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven 3.6+
- Browser drivers (ChromeDriver, FirefoxDriver, etc.)

## Installation

1. Clone or extract the repository:
   ```bash
   git clone <repository-url>
   cd Paytm_Payments_Bank_Website_Automation_Framework
   ```

2. Install dependencies:
   ```bash
   mvn clean install
   ```

## Running Tests

Execute all tests:
```bash
mvn test
```

Run specific test class:
```bash
mvn test -Dtest=TestClassName
```

Run tests in parallel:
```bash
mvn test -DsuiteXmlFile=testng.xml
```

## Configuration

Update configuration properties in `src/main/resources/`:
- `config.properties` - Browser and URL configurations
- `log4j.properties` - Logging settings

## Test Reporting

After test execution, reports are generated in:
- `target/surefire-reports/` - TestNG reports
- `test-output/` - Extent Reports (if configured)

## CI/CD Integration

This framework is compatible with:
- Jenkins
- GitHub Actions
- GitLab CI
- Azure Pipelines

## Contributing

1. Create a feature branch
2. Make your changes
3. Commit with clear messages
4. Push and create a pull request

## License

This project is licensed under the MIT License.

## Support

For issues or questions, please contact the development team.

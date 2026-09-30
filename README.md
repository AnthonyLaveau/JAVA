# Java DevContainer Template

A lightweight GitHub Codespaces template to kickstart Java development instantly. Pre-configured with Java, Gradle, and Maven.

## Features

- **Java Development Kit (JDK)** ready to use
- **Gradle** & **Maven** pre-installed
- Zero-setup environment via GitHub Codespaces or Docker

## Getting Started

### Option 1: GitHub Codespaces
Click **Use this template** > **Open in a codespace** to start coding in your browser.

### Option 2: VS Code Local
1. Clone this repository.
2. Open the folder in VS Code.
3. Reopen in Container when prompted (requires Docker & Dev Containers extension).

## Running the Code

The repository includes a simple `Program.java` file at the root.

To run it directly:

```bash
java Program.java
```

Or compile and run:

```bash
javac Program.java
java Program
```

## Build Tools

* Run Maven: `mvn clean test`
* Run Gradle: `gradle build`


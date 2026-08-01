# 🏢 Employee Class Hierarchy in Java

An Object-Oriented Programming (OOP) project demonstrating **Inheritance**, **Encapsulation**, and **Constructor Chaining** in Java by designing a structured domain model for various employee types.

---

## 📌 Problem Description

Design a class hierarchy for an organization's workforce consisting of three main classes:
1. **`Employee`** (Base Class): Represents common attributes of all employees.
2. **`Developer`** (Subclass): Inherits from `Employee` and adds domain-specific attributes for software engineers.
3. **`DataAnalyst`** (Subclass): Inherits from `Employee` and adds attributes tailored for data science professionals.

---

## 💡 Key Concepts Applied

* **Inheritance (`extends`)**: Subclasses inherit common fields (`name`, `email`, `experience`) and behavior from `Employee` to promote code reuse.
* **Encapsulation**: Class attributes are marked `private` and accessed securely using `public` getter methods.
* **Constructor Chaining (`super`)**: Subclasses pass base arguments to `Employee` using `super(name, email, experience)`.
* **Java Naming Conventions**: Boolean getter method follows the `is<Field>()` standard (e.g., `isPhd()`).

---

## 📊 Class Structure Overview

      +-----------------------+
      |       Employee        |
      +-----------------------+
      | - name: String        |
      | - email: String       |
      | - experience: int     |
      +-----------------------+
                  ^
                  |
             +----+------------------------------+
             |                                   |
    +-----------------------+   +-----------------------+
    |       Developer       |   |      DataAnalyst      |
    +-----------------------+   +-----------------------+
    | - mainLanguage: String|   | - phd: boolean        |
    | - skills: String[]    |   | - methods: String[]   |
    +-----------------------+   +-----------------------+

## 🛠️ Implementation Details

### Base Class: `Employee`
* **Attributes**: `name`, `email`, `experience`
* **Constructor**: `Employee(String name, String email, int experience)`
* **Getters**: `getName()`, `getEmail()`, `getExperience()`

### Subclass: `Developer`
* **Additional Attributes**: `mainLanguage`, `skills` (Array of Strings)
* **Constructor**: `Developer(String name, String email, int experience, String mainLanguage, String[] skills)`
* **Getters**: `getMainLanguage()`, `getSkills()`

### Subclass: `DataAnalyst`
* **Additional Attributes**: `phd` (boolean), `methods` (Array of Strings)
* **Constructor**: `DataAnalyst(String name, String email, int experience, boolean phd, String[] methods)`
* **Getters**: `isPhd()`, `getMethods()`

---

## 🚀 How to Run / Example Code

```java
public class Main {
    public static void main(String[] args) {
        // Instantiate a Developer
        String[] skills = { "git", "Scala", "JBoss", "UML" };
        Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);

        // Instantiate a DataAnalyst
        String[] methods = { "neural networks", "decision tree", "bayesian algorithms" };
        DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, methods);

        // Display Info
        System.out.println("Developer: " + developer.getName() + " | Primary Language: " + developer.getMainLanguage());
        System.out.println("Data Analyst: " + analyst.getName() + " | Has PhD? " + analyst.isPhd());
    }
}

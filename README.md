# intervueAssignment
🧰 Prerequisites
Before running this automation script, make sure you have the following installed:

Java JDK (version 8 or above)

Eclipse IDE or any Java IDE

Maven (optional but recommended)

Google Chrome Browser

ChromeDriver (matching your browser version)

You also need to add Selenium Java bindings to your project.

🔧 Setup Instructions
Download ChromeDriver

Visit https://chromedriver.chromium.org/downloads

Download the version that matches your Chrome browser.

Extract the executable and note the path.

Create a Java Project
In Eclipse or IntelliJ:

Create a new Java project named intervue.

Create a new class: Intervuelogin.java.

Add Selenium JARs
Download from: https://www.selenium.dev/downloads/
Or if you're using Maven, add the following dependencies to your pom.xml:

xml
Copy
Edit
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.8.0</version> <!-- or latest -->
    </dependency>
</dependencies>
Set ChromeDriver System Property (optional)
Add the line below to specify your ChromeDriver path (only if not in PATH):

java
Copy
Edit
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
▶️ Execution Instructions
Open your IDE.

Paste the code from Intervuelogin.java.

Make sure all necessary imports and dependencies are added.

Run the program as a Java Application.

The script will:

Launch Chrome

Open https://www.intervue.io

Click on Login

Enter credentials

Log in and wait for the Dashboard

Close the browser

📝 Notes
Credentials used in the script (neha@intervue.io, Ps@neha@123) should be replaced with valid ones (if required).

Ensure stable internet connection while running the test.

Avoid using Thread.sleep() for waits — consider using WebDriverWait (already used in your script).

XPath locators can break if the web structure changes. Keep them up to date.

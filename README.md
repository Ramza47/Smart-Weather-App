<img src="media/image1.jpeg" style="width:1.87324in;height:4.2in" />

# Table of Contents

[Documentation [2](#documentation)](#documentation)

[Practicum EXAM Report
[2](#practicum-exam-report)](#practicum-exam-report)

[1. Purpose [2](#purpose)](#purpose)

[2. Design Considerations
[2](#design-considerations)](#design-considerations)

[a) Intuitive Design [3](#intuitive-design)](#intuitive-design)

[b) Content Prioritisation
[4](#content-prioritisation)](#content-prioritisation)

[c) Legible Text Content
[4](#legible-text-content)](#legible-text-content)

[d) Interface Elements Visibility
[4](#interface-elements-visibility)](#interface-elements-visibility)

[e) Hand Positions Controls
[4](#hand-positions-controls)](#hand-positions-controls)

[3. GitHub and GitHub Actions
[5](#github-and-github-actions)](#github-and-github-actions)

[Version Control with GitHub
[5](#version-control-with-github)](#version-control-with-github)

[Test and Automated Testing
[5](#test-and-automated-testing)](#test-and-automated-testing)

[4. Repository Link [6](#repository-link)](#repository-link)

[5. Pseudocode [6](#pseudocode)](#pseudocode)

[6. Code [9](#code)](#code)

[Splash Activity [9](#splash-activity)](#splash-activity)

[Main Activity (Main Screen)
[11](#main-activity-main-screen)](#main-activity-main-screen)

[Detailed View Screen (Third Screen)
[15](#detailed-view-screen-third-screen)](#detailed-view-screen-third-screen)

[7. References [17](#_Toc168924194)](#_Toc168924194)

# Documentation

# Practicum EXAM Report

## Purpose

> The purpose of the weather app is to provide users with detailed
> average temperatures for the week and it will also allow users to view
> information/ weather daily from Monday to Sunday whether it will be
> cold, sunny, or raining. And it will also give them external
> information from other parts of cities globally. This app will be for
> the local weather organisation.

## 

## Design Considerations

> <img src="media/image2.png" style="width:6.26806in;height:3.52569in" alt="A screenshot of a computer Description automatically generated" />
>
> Figure 1: Splash Screen
>
> <img src="media/image3.png" style="width:6.26806in;height:3.52569in" alt="A screenshot of a computer Description automatically generated" />
>
> Figure 2: Main Activity
>
> <img src="media/image4.png" style="width:6.26806in;height:3.52569in" alt="A screenshot of a computer Description automatically generated" />
>
> Figure 3: Detailed View Screen

### Intuitive Design

> Yes, the design of the app is easy to follow as it ensures that users
> can navigate through the Smart Weather app easily and engage with the
> app\`s features or functions without confusion or frustration. The
> consistent layout that maintains through the app helps users feel
> comfortable and easy to understand the interface such as buttons. The
> Smart Weather app is also optimized for various screen sizes and
> devices which it adapts to different resolutions and orientations of
> different devices to provide a consistent experience for all kind of
> users. The app does not have too many elements or functions which is
> why the design should remain clear and focuses on the essential
> content and its serving purpose. However, the gesture support has
> pinching to perform actions within the app. It can also be accessed on
> offline mode without the use of internet connection.

### Content Prioritisation

> Yes, the app displays the essential elements and functionalities such
> as the significance of the app which it has a main object which is a
> pet that appears on the center of the screen with no added features.
> And the app has the elements that the user would need which goes along
> with the app.

### Legible Text Content

The fonts are clear and readable font size and spacing. There is no
small text or fancy fonts that have been added which could strain the
user\`s eyes. Which this adds up to the intuitive design of the app. The
app only contains one image which adds up to the purpose of the app.
This, however, also helps the local weather organisation for their
awareness of weather conditions as users engage with the app.

### Interface Elements Visibility

The users can easily navigate the app and there is a clear visual
hierarchy, consistent layout, and interactive elements such as buttons
which the user can make use of as the app does not contain text
information only simple buttons which readable text. And the app does
not contain crowded components. It\`s simple to navigate.

### Hand Positions Controls

> As stated in the intuitive design, the buttons are well easily
> navigated and structed correctly, and they are identifiable which
> makes it comfort for the users to reach them without stretching their
> thumb finger.

## GitHub and GitHub Actions

## Version Control with GitHub

1.  **Create a new GitHub Repository:** After a new Repository is
    created in the GitHub website, the repository should contain a
    student number and a name with a description, and it has been set to
    public.

2.  **Initialise the Repository with a README File:** After the
    repository is created, an option to “Initialize this repository with
    a README” will appear. Then check the option to create a README
    file.

> Clink on the “Create repository” button to finalize the creation of
> the repository.

3.  **Commit and push your project files to the GitHub Repository:** In
    Android studio, locate VCS (Version Control System) \\ Import into
    Version Control\\ Share project on GitHub.

> Afterwards click the “Share” button to push the project files to the
> GitHub repository.

4.  **Regularly Commit and push your code as you make progress:** After
    the initial push, continue making changes to your project in Android
    Studio.

> After making significant changes, always commit your changes locally
> in Android Studio using VSC -> Commit Changes.
>
> Once committed, push your changes to GitHub repository using VSC ->
> Git -> Push.

## Test and Automated Testing

1.  **Conduct Manual testing:**

> Manually test your app to ensure if functions seamlessly and offers an
> enjoyable educational experience for users.

2.  **Create a New Test Class:** In your Android Project, create a new
    Kotlin file for your test class. Name it appropriately to indicate
    what component or functionality you are testing.

3.  **Write Test methods:** Give test methods.

4.  **Run the Tests:** Run the tests using the testing framework\`s
    tools provided by Android Studio or through the command line.

## 

## Repository Link

<https://github.com/Ramza47/Smart-Weather-App>

## Pseudocode

0\. start

1\. Declarations

num strAppName

num strYourName

num fltStudentNumber

num strintent

num strStartButton

num strExitButton

\*\*Splash Screen\*\*

3\. SplashScreenActivity()

Display strAppName: "Weather Manager"

Display strYourName: "YourName"

Display fltStudentNumber: "Your student Number"

Display "App Logo"

while True

strStartButton.setOnClickListener {

strintent = Intent(this, MainScreenActivity::class.java)

startActivity(intent)

}

strExitButton.setOnClickListener {

finish()

}

endwhile

\*\*MainScreenActivity\*\*

0\. start

2\. Declarations

num intSIZE = 7 // this stores temperatures for each day of the week.

num intCount

num strintent

num strDay\[intSIZE\] = ("Monday, Tuesday, Wednesday, Thursday, Friday,
Saturday, Sunday")

num intMinTemp\[intSIZE\] = "16, 22, 40, 23, 30,15, 10"

num intMaxTemp\[intSIZE\] = "30, 35, 15, 15, 10, 19, 20"

num strWeatherCondition\[intSIZE\] = "Sunny, Sunny, #, #, #, Raning,
Cold"

num fltAvgTemp

num intUserChoice

num strDetailsButton

num strExitButton

fltAvgTemp = intMinTemp / 7

output "The average weekly temperature is" + fltAvgTemp

fltAvgTemp = intMaxTemp / 7

output "The average weekly temperature is" + fltAvgTemp

4\. Display "MinTemp"

5\. Display "MaxTemp"

6\. Display "1. Navigate to Detailed View Screen

7\. Display "2. Clear Data and Re-input"

8\. Display "3. Exit App"

6\. // userChoice

7\. if intUserChoice == 1 THEN

strDetailsButton.setOnClickListener

strintent = Intent(this, strDetailsButton::class.java)

startActivity(intent)

ELSE if Userchoice == 2 THEN

CLEAR strDay

Display "Data cleared. Please re-input day."

ELSE if intUserChoice == 3 THEN

strExitButton.setOnClickListener

finish()

ELSE

Display "Invalid choic. Please try again."

endif

\*\*DetailedViewScreenActivity\*\*

0\. start

1\. Declarations

num DeailedViewScreen(strDay : intSIZE\[7\])

num fltAvgTemp

num intUserChoice

num strintent

2\. Display "intMinTemp"

3\. Display "intMaxTemp"

4\. output ""The average weekly temperature " + fltAvgTemp

5\. Display "Options:"

6\. Display "1. Navigateback to MainScreen"

7\. Display "2. Exit App"

8\. //Userchoice

9\. if intUserChoice == 1 THEN

BackButton.setOnClickListener

strintent = Intent(this, strMainScreenActivity::class.java)

startActivity(strintent)

else if intUserChoice == 2 THEN

ExitButton.setOnClickListener

finish()

10\. stop

## Code 

### Splash Activity

> android.annotation.SuppressLint
>
> import android.content.Intent
>
> import android.os.Bundle
>
> import android.widget.Button
>
> import androidx.appcompat.app.AppCompatActivity
>
> @SuppressLint("CustomSplashScreen")
>
> class SplashActivity : AppCompatActivity() {
>
> override fun onCreate(savedInstanceState: Bundle?) {
>
> super.onCreate(savedInstanceState)
>
> setContentView(R.layout.activity_main)
>
> val startButton = findViewById\<Button>(R.id.startButton)
>
> val exitButton = findViewById\<Button>(R.id.exitButton)
>
> startButton.setOnClickListener {
>
> val intent = Intent(this, MainActivity::class.java)
>
> startActivity(intent)
>
> exitButton.setOnClickListener {
>
> finish()
>
> }
>
> }
>
> }
>
> }

### Main Activity (Main Screen)

> package com.example.smartweatherapp
>
> import android.annotation.SuppressLint
>
> import android.content.Intent
>
> import android.os.Bundle
>
> import android.widget.Button
>
> import android.widget.EditText
>
> import android.widget.TextView
>
> import android.widget.Toast
>
> import androidx.appcompat.app.AppCompatActivity
>
> private val Any.size: Any
>
> get() {
>
> TODO("Not yet implemented")
>
> }
>
> private fun Any.putStringArrayListExtra(s: String) {
>
> }
>
> class MainActivity : AppCompatActivity() {
>
> private val days = arrayOf(
>
> "Monday",
>
> "Tuesday",
>
> "Wednesday",
>
> "Thursday",
>
> "Friday",
>
> "Saturday",
>
> "Sunday"
>
> )
>
> private val minTemperature = arrayOf(16, 22, 40, 23, 30, 15, 10)
>
> private val maxTemperature = arrayOf(30, 35, 15, 15, 10, 19, 20)
>
> private fun clearFields(dayEditText: EditText?,
> averagetemperatureTextView: TextView?) {
>
> }
>
> private fun clearFields(dayEditText: EditText?) {
>
> }
>
> @SuppressLint("SetTextI18n")
>
> override fun onCreate(savedInstanceState: Bundle?) {
>
> super.onCreate(savedInstanceState)
>
> setContentView(R.layout.activity_main2)
>
> val dayEditText = findViewById\<EditText>(R.id.dayEditText)
>
> val averagetemperatureTextView =
> findViewById\<TextView>(R.id.averagetemperatureTextView)
>
> val addButton = findViewById\<Button>(R.id.addButton)
>
> val clearButton = findViewById\<Button>(R.id.clearButton)
>
> val viewDetailsButton = findViewById\<Button>(R.id.viewDetailsButton)
>
> addButton.setOnClickListener {
>
> val day = dayEditText.text.toString()
>
> if (day.isNotEmpty() == null) {
>
> days.add(day)
>
> Toast.makeText(this, "Data Added", Toast.LENGTH_LONG).show()
>
> clearFields(dayEditText)
>
> } else {
>
> Toast.makeText(this, "Please fill the empty field",
> Toast.LENGTH_SHORT).show()
>
> }
>
> var minTemperatureDisplay = ""
>
> minTemperatureDisplay += "${minTemperature\[0\]}\\n"
>
> minTemperatureDisplay += "${minTemperature\[1\]}\\n"
>
> minTemperatureDisplay += "${minTemperature\[2\]}\\n"
>
> minTemperatureDisplay += "${minTemperature\[3\]}\\n"
>
> minTemperatureDisplay += "${minTemperature\[4\]}\\n"
>
> minTemperatureDisplay += "${minTemperature\[5\]}\\n"
>
> minTemperatureDisplay += "${minTemperature\[6\]}\\n"
>
> minTemperatureDisplay += "${minTemperature\[7\]}\\n"
>
> var maxTemperatureDisplay = ""
>
> maxTemperatureDisplay += "${maxTemperature\[0\]}\\n"
>
> maxTemperatureDisplay += "${maxTemperature\[1\]}\\n"
>
> maxTemperatureDisplay += "${maxTemperature\[2\]}\\n"
>
> maxTemperatureDisplay += "${maxTemperature\[3\]}\\n"
>
> maxTemperatureDisplay += "${maxTemperature\[4\]}\\n"
>
> maxTemperatureDisplay += "${maxTemperature\[5\]}\\n"
>
> maxTemperatureDisplay += "${maxTemperature\[6\]}\\n"
>
> maxTemperatureDisplay += "${maxTemperature\[7\]}\\n"
>
> var averagetemperature =
>
> arrayOf(16, 22, 40, 23, 30, 15, 10, 30, 35, 15, 15, 10, 19, 20)
>
> averagetemperature = if (day.isNotEmpty()) averagetemperature/day.size
>
> else
>
> arrayOf(0)
>
> averagetemperatureTextView.text = "Average Temperature :
> $averagetemperature minutes/day"
>
> // The code will clear all data saved in the arraylists!
>
> clearButton.setOnClickListener {
>
> //day.clear()
>
> //MinTemperature.clear()
>
> //MaxTemperature.clear()
>
> // Toast.makeText(this, "Data Cleared", Toast.LENGTH_SHORT).show()
>
> clearFields(dayEditText, averagetemperatureTextView)
>
> }
>
> viewDetailsButton.setOnClickListener {
>
> val intent = Intent(this, DetailedViewActivity::class.java)
>
> intent.putStringArrayListExtra("day")
>
> intent.putStringArrayListExtra("averageTemperature")
>
> intent.putStringArrayListExtra("WeatherCondition")
>
> startActivity(intent)
>
> }
>
> }
>
> }
>
> }
>
> private operator fun Any.div(size: Any): Array\<Int> {
>
> return TODO("Provide the return value")
>
> }
>
> private fun \<T> Array\<T>.add(day: T) {
>
> }

### Detailed View Screen (Third Screen)

> package com.example.smartweatherapp
>
> import android.content.Intent
>
> import android.os.Bundle
>
> import android.widget.Button
>
> import android.widget.TextView
>
> import androidx.appcompat.app.AppCompatActivity
>
> class DetailedViewActivity : AppCompatActivity() {
>
> override fun onCreate(savedInstanceState: Bundle?) {
>
> super.onCreate(savedInstanceState)
>
> setContentView(R.layout.activity_detailed_view)
>
> val day = intent.getStringArrayListExtra("day") ?: arrayListOf()
>
> val averageTemperature =
>
> intent.getIntegerArrayListExtra("averagetemperature") ?: arrayListOf()
>
> val detailsTextView = findViewById\<TextView>(R.id.detailsTextView)
>
> val averageTemperatureTextView =
> findViewById\<TextView>(R.id.averageTemperatureTextView)
>
> val backButton = findViewById\<Button>(R.id.backButton)
>
> var displayText = ""
>
> for (i in day.indices) {
>
> val minTemperature = arrayOf\<Int>(16, 22, 40, 23, 30, 15, 10)
>
> val maxTemperature = arrayOf\<Int>(30, 35, 15, 15, 10, 19, 20)
>
> val dailyScreen = minTemperature\[i\] + maxTemperature\[i\]
>
> detailsTextView.text = displayText
>
> averageTemperatureTextView.text = "Average Temperature:
> $averageTemperature/size"
>
> backButton.setOnClickListener {
>
> val intent = Intent(this, MainActivity::class.java)
>
> startActivity(intent)
>
> }
>
> }
>
> }
>
> }

# References

The IIE. 2024. Introduction to Mobile Application Development \[First
Edition: 2024\]. The Independent Institute of Education: Unpublished.

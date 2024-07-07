# Project1_S24 Android App

I made an Android project based on newborn ducks that used activities and fragments. Upon user login, 
they access educational content about baby ducks. They then proceed to a quiz, answering five questions 
and receiving a score.

## Table of Contents

- [Description](#description)
- [Features](#features)
- [Screenshots](#screenshots)
- 
## DESCRIPTION

The project begins with a login screen in which users can enter their credentials. After 
successfully logging in, users are taken to a piece that has useful information about baby ducks. 
This fragment, created with a pastel color scheme and clear text, explains various aspects such as 
baby duck names, imprinting behavior, and group names. Users might go from this informative fragment
to a quiz fragment. The quiz produces questions about young ducks based on a specified list of 
questions and answers. Users select their answers using radio buttons, and their score is generated 
depending on the correct responses. Jetpack Navigation is used to navigate between fragments, 
ensuring smooth transitions and complying to current Android navigation rules. The software uses 
complex UI components, such as RadioGroup for quiz options and a TextView for displaying educational 
content, all formatted to match the pastel-themed look. To ensure responsiveness, the layout adapts 
to multiple screen sizes, including tablets. Each component contributes significantly to the app's 
functionality, increasing its instructional value and user engagement. In terms of coding methods, 
the project prioritizes separation of concerns, with clear differences between activities and 
fragments. It uses XML to define layouts and Kotlin for business logic, following best practices in 
Android programming. Overall, this project not only shows technical skill in Android activities, 
fragments, and navigation, but it also demonstrates good UI design and useful content integration.

## FEATURES 

Login Screen: Users begin by entering predetermined credentials ("duck" for username and "duckling" 
for password), which ensure secure access to the app's performance.
Informational Content: Users are welcomed with a section full of informational content on newborn 
ducks when they log in. This includes information about their identities, imprinting behavior, and 
group terminology, all presented in a visually appealing pastel-colored interface.
Quiz: After examining the educational information, users can take an interactive quiz. 
The quiz fragment produces baby duck- elated questions dynamically and provides participants with 
multiple-choice answers. After they have answered all five questions, their score is determined.
Advanced Navigation: The application makes use of Jetpack Navigation to smoothly go between the quiz
section, learning section, and login screen. This results in a pleasant user experience with easy 
navigation patterns.
Responsive Design: The app's layout adapts to various screen sizes, including tablets 
(sw600dp layout), ensuring excellent user interaction and readability across several platforms.




## FRAGMENTS/ACTIVITIES

Activities:

LoginActivity: This is where users log in with their username and password. After a successful login, 
users are directed to the next segment. (activity_login.xml)
MainActivity: The primary container for fragment hosting and navigation management 
(activity_main.xml). It has a bottom navigation bar (bottom_nav_view) to let you navigate between 
parts of the program.

Fragments:

BabyDucksInfoFragment: Shows educational information about baby ducks (fragment_baby_ducks_info.xml). 
It includes descriptive information about the many stages of duckling development, such as 
hatchlings, imprinting, and collective groupings.
QuizFragment offers an interactive quiz experience (fragment_quiz.xml). Users answer questions about
newborn ducks using radio buttons and a submit button.
ResultsFragment: Displays quiz results (fragment_results.xml). It displays the user's score based on 
the total number of questions answered and provides feedback on how they did.

Navigation and interaction:

Jetpack Navigation: Implemented via nav_graph.xml, allowing for smooth transitions between parts. 
The navigation actions 
(action_loginFragment_to_babyDucksInfoFragment, action_babyDucksInfoFragment_to_quizFragment, etc.) 
provide the path from login to educational content, quiz, and results.

Integration and function:

Strings.xml and colors.xml are resource files that define app-specific strings and colors while 
keeping the theme consistent. (pastel_background, pastel_text, pastel_dark_blue).
Styles and themes: Defined in styles.xml and themes.xml to ensure a consistent visual experience 
across activities and fragments. (Base.Theme.Project1_S24, Theme.Project1_S24)


## Screenshots

![EditText fields for username and password](/Users/aminabenjelloun/Downloads/project1_babyduckinfo.png "LOGIN SCREENSHOT SAMPLE LOOK")
![dependencies used in the project](/Users/aminabenjelloun/Downloads/project1_dependenciesused.png "Dependencies USED")
![baby ducks and the interactive quiz interface](/Users/aminabenjelloun/Downloads/project1_quiz.cmlpreviewofinterface .png "Interface Preview")
![Highlights the actions between fragments](/Users/aminabenjelloun/Library/Mobile Documents/com~apple~Preview/Documents/project1_displaysnavi.xml.png "Navigation")

1. Clone the repository:

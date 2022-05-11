# KotlinSampleApp

Automation Framework with Sample application to test UI ..
There is sample application created in Kotlin present on public git which is dummy application to give information on Covid-19 Precaution.
..

This framework aims to showcase automation framework on sample application in Kotlin which support multiple framework like expresso and UIAutomation.

Project structure has both expresso and UI Automation test case present in package  android test  and will help other team as reference create automaton framework for their respective application

Differnce between Differnt mobile automation framework....

Comparison of Different Mobile Automation Framework
Below is quick summary of comparison of different Mobile automation framework .


Espresso:
Espresso is implemented on Android Instrumentation Framework.It is small API that is supported on API level such as 8 (Froyo), 10 Gingerbread), and 15 (Ice Cream Sandwich). It is
fairly a simple Automation tool.It synchronizes with UI thread and hence this makes it more reliable. It does not require sleeps. When the app becomes idle the tests are executed on the
same millisecond.Web views are not supported. It is the most recent Framework that was launched by Google and it’s open-sourced. This makes it available easily for the developers and testers.

Appium:
Test can be done in multiple platforms.Helps in automating Native app, Mobile app and Hybrid apps on both iOS and android platforms.Simulators (iOS, FireFoxOS), Emulators (Android),
real devices (iOS, Android, FireFoxOS) can be tested in Appium. Any programming language can be used which are
available in web driver library

UI Automator:
This testing framework works only on Android API level 16 and above and is provided by Google’s
Android. The main purpose of automating the UI test with Android Studio is to device the test code into a distinct Android test folder where the code is used to achieve testing tasks and to simulate user
interaction on the target app. Though this framework is simple and is easy in handling the asynchronous events like alerts, dialog
and Toasts; its usage is restricted only for Android version 4.1

Question
Consider a JavaFX application that simulates a weather station. The application should
display temperature readings from multiple sensors. Each sensor operates independently and
records a random temperature value at regular intervals. Implement a multithreaded Java
program where each thread reads and reports a temperature sensor on a TextArea widget. The
UI should also contain a button to add another sensor dynamically.
Steps
1. Create a Sensor class that generates random temperature values and logs these values
in the JavaFX TextArea. Wait 2 seconds between each reading. You can use
Thread.sleep method to do so.
2. Create a JavaFX application with a TextArea to display the temperature readings.
3. Use a Button to add new sensors dynamically.
4. In the main method, create the JavaFX application and set up the event handlers for
adding new sensors.

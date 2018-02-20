# Simple Robot Puzzle based on Spring Boot API
This is A simple puzzle application to move a robot on a table of size 5x5. Based on Spring Boot Rest API technologies, the application is developed to show how several requests can be passed to the Robot, such as:
- Place location (coordinates) and face direction of the Robot, (Post request)
- Report the location and face direction of the Robot (Get request)
- Move the Robot one step forward (Put request)
- Turn the Robot to the right direction (Put request)
- Turn the Robot to the left direction (Put request).

The application has constraints of preventing Robot from falling.
The assumtion of this appliaction is to place only one robot at time on the table. 
In this application you can see also how the exceptions is handling by through Spring and RestApi and how Enum is useful to define durations as constant values.

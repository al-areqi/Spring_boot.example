# Simple Robot Puzzle based on Spring Boot API
This is A sample puzzle application to move a robot on a table of size 5x5. Based on Spring Boot and RestApi technologies, the application is developed to show how several requests can be passed to the Robot, such as:
- Place location (coordinates) and face direction of the Robot, (Post request)
- Report the location and face direction of the Robot (Get request)
- Move the Robot one step forward (Put request)
- Turn the Robot to the right direction (Put request)
- Turn the Robot to the left direction (Put request)

Note that the assumtion of this appliaction is to place only one robot at time on the table. 

# In this application you can see also how the exceptions is handling by through Spring and RestApi and how Enum is useful to define durations as constant values.

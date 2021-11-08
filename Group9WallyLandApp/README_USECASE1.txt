1.) Login Use Case

Justin Kelly - Group 9

Run InitialPortalUI to start

Basic implementation of the state design pattern in the EmployeePortal methods to maintain the status of the login.
Still needed: backend to authenticate against user input, additional UI components past initial page, validation and testing.

The fill in the blanks pattern is implemented by the design of the user interface to get accurate input from the user. 
The portal access page simply includes username and password fields for authentication purposes.

(Click on the Staff login and type this)
username: admin
password: password


2.) Employee Update Queue Use Case

Jiaxi Zheng - Group 9

After logging in, you will be taken to the Updating Queue Page. This use case uses informaiton that the 
park staff member enters to calculate the waiting time. These two variables will be number of people eneter or leaving the ride/restaurant.
These two variables should update every hour. 

Example (Try): 
6 people enters every hour
7.5 people leaves every hour
By entering 6 for customers entering and 7.5 for customers leaving, the average waiting time will be 32 minutes.


The waiting time calculated in this page will be used by other use cases. For example, it will show up in
customer side of the application (ParkStatistics and ParkQueue).


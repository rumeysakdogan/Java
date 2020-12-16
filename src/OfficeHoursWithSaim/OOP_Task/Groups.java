package OfficeHoursWithSaim.OOP_Task;
/*
Groups interface
(*) Create an interface Groups with the following actions:
    - joinGroup(String group);
    - leaveGroup(String group);
(*) Add a variable in FacebookUser to count the number of groups they are in and implement the 2 methods from Groups interface.
    - joinGroup prints "%usersName as join %group" and increment the total number of groups
    - leaveGroup prints "%usersName as left %group" and decrement the total number of groups

 */
public interface Groups {

     void joinGroup(String group);
     void leaveGroup(String group);
}

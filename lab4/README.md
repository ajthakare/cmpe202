CRC Cards:

1. Party -

    Responsibilities:
    a. Provides party information like name and phone number of customer and size of party;
    b. Registers on waitlist;
    c. Confirms table booking;
    d. Cancels table booking;
    
    Collaborators: Waitlist
    
2. Waitlist -

    Responsibilities:
    a. Keeps track of waiting parties at restaurant;
    b. Keeps tracks of busy and available tables;
    c. Sends table availability updates to parties;
    d. Receives confirmation/cancellation for table booking from party;
    
    Collaborators: Party, Table
    
3. Table -

    Responsibilities:
    a. Provides table information like table number and size;
    b. Provides availability for party to waitlist;
    
    Collaborators: Waitlist


Object Collaboration:

    I have selected observer design pattern to display the collaboration between Waitlist and Party as the relation between the two can be depicted using the subject-observer pattern, waitlist being the subject and party as observer.
    To display the states of Table, I have used state diagram.
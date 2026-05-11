-- ============================================================
--   HOTEL BOOKING SYSTEM DATABASE
-- ============================================================

-- ============================================================
-- STEP 1: DROP TABLES (Run this first every time)
-- ============================================================

DROP TABLE Reviews   CASCADE CONSTRAINTS;
DROP TABLE Payments  CASCADE CONSTRAINTS;
DROP TABLE Bookings  CASCADE CONSTRAINTS;
DROP TABLE Rooms     CASCADE CONSTRAINTS;
DROP TABLE Room_Types CASCADE CONSTRAINTS;
DROP TABLE Customers CASCADE CONSTRAINTS;

-- ============================================================
-- STEP 2: CREATE TABLES
-- ============================================================

-- TABLE 1: Customers
CREATE TABLE Customers (
    Customer_ID   NUMBER(5)    PRIMARY KEY,
    Customer_Name VARCHAR2(50) NOT NULL,
    Phone_Number  VARCHAR2(15) NOT NULL,
    Email         VARCHAR2(50),
    City          VARCHAR2(30),
    Gender        VARCHAR2(10)
);

-- TABLE 2: Room_Types
CREATE TABLE Room_Types (
    RoomType_ID   NUMBER(5)    PRIMARY KEY,
    Type_Name     VARCHAR2(30) NOT NULL,
    Price_Per_Day NUMBER(8,2)  NOT NULL,
    Max_Persons   NUMBER(2),
    Amenities     VARCHAR2(100)
);

-- TABLE 3: Rooms (Child of Room_Types)
CREATE TABLE Rooms (
    Room_ID     NUMBER(5)    PRIMARY KEY,
    Room_Number VARCHAR2(10) NOT NULL,
    Floor_No    NUMBER(3),
    RoomType_ID NUMBER(5)    NOT NULL,
    Status      VARCHAR2(15) DEFAULT 'Available',
    CONSTRAINT fk_rooms_type FOREIGN KEY (RoomType_ID) REFERENCES Room_Types(RoomType_ID)
);

-- TABLE 4: Bookings (Child of Customers and Rooms)
CREATE TABLE Bookings (
    Booking_ID     NUMBER(6)    PRIMARY KEY,
    Customer_ID    NUMBER(5)    NOT NULL,
    Room_ID        NUMBER(5)    NOT NULL,
    Check_In       DATE         NOT NULL,
    Check_Out      DATE         NOT NULL,
    Total_Days     NUMBER(4),
    Booking_Status VARCHAR2(15) DEFAULT 'Confirmed',
    CONSTRAINT fk_book_cust FOREIGN KEY (Customer_ID) REFERENCES Customers(Customer_ID),
    CONSTRAINT fk_book_room FOREIGN KEY (Room_ID)     REFERENCES Rooms(Room_ID)
);

-- TABLE 5: Payments (Child of Bookings)
CREATE TABLE Payments (
    Payment_ID     NUMBER(6)    PRIMARY KEY,
    Booking_ID     NUMBER(6)    NOT NULL,
    Amount         NUMBER(10,2) NOT NULL,
    Payment_Date   DATE         DEFAULT SYSDATE,
    Payment_Mode   VARCHAR2(20),
    Payment_Status VARCHAR2(15) DEFAULT 'Paid',
    CONSTRAINT fk_pay_book FOREIGN KEY (Booking_ID) REFERENCES Bookings(Booking_ID)
);

-- TABLE 6: Reviews (Child of Customers and Bookings)
CREATE TABLE Reviews (
    Review_ID   NUMBER(6)    PRIMARY KEY,
    Customer_ID NUMBER(5)    NOT NULL,
    Booking_ID  NUMBER(6)    NOT NULL,
    Rating      NUMBER(2)    CHECK (Rating BETWEEN 1 AND 5),
    Comments    VARCHAR2(200),
    Review_Date DATE         DEFAULT SYSDATE,
    CONSTRAINT fk_rev_cust FOREIGN KEY (Customer_ID) REFERENCES Customers(Customer_ID),
    CONSTRAINT fk_rev_book FOREIGN KEY (Booking_ID)  REFERENCES Bookings(Booking_ID)
);

-- ============================================================
-- STEP 3: INSERT DATA
-- ============================================================

-- TABLE 1: Customers (8 Records)
INSERT INTO Customers VALUES (1, 'Rahul Sharma',   '9876543210', 'rahul@gmail.com',   'Mumbai',    'Male');
INSERT INTO Customers VALUES (2, 'Priya Patil',    '9823456781', 'priya@gmail.com',   'Pune',      'Female');
INSERT INTO Customers VALUES (3, 'Amit Desai',     '9012345678', 'amit@yahoo.com',    'Delhi',     'Male');
INSERT INTO Customers VALUES (4, 'Sneha Joshi',    '9765432109', 'sneha@gmail.com',   'Nashik',    'Female');
INSERT INTO Customers VALUES (5, 'Vikas Mehta',    '9654321098', 'vikas@gmail.com',   'Bangalore', 'Male');
INSERT INTO Customers VALUES (6, 'Anita Kulkarni', '9543210987', 'anita@gmail.com',   'Nagpur',    'Female');
INSERT INTO Customers VALUES (7, 'Ravi Kumar',     '9432109876', 'ravi@hotmail.com',  'Chennai',   'Male');
INSERT INTO Customers VALUES (8, 'Pooja Singh',    '9321098765', 'pooja@outlook.com', 'Hyderabad', 'Female');

-- TABLE 2: Room_Types (8 Records)
INSERT INTO Room_Types VALUES (1, 'Standard Single', 1500,  1, 'AC, WiFi, TV');
INSERT INTO Room_Types VALUES (2, 'Standard Double', 2200,  2, 'AC, WiFi, TV, Wardrobe');
INSERT INTO Room_Types VALUES (3, 'Deluxe Room',     3500,  2, 'AC, WiFi, TV, Mini Bar');
INSERT INTO Room_Types VALUES (4, 'Suite',           6000,  3, 'AC, WiFi, TV, Jacuzzi');
INSERT INTO Room_Types VALUES (5, 'Executive Suite', 8500,  4, 'AC, WiFi, Kitchen, Lounge');
INSERT INTO Room_Types VALUES (6, 'Family Room',     4500,  5, 'AC, WiFi, 2 TVs, Bunk Bed');
INSERT INTO Room_Types VALUES (7, 'Penthouse',       12000, 6, 'AC, WiFi, Private Pool');
INSERT INTO Room_Types VALUES (8, 'Budget Room',     900,   1, 'Fan, TV');

-- TABLE 3: Rooms (15 Records - Child of Room_Types)
INSERT INTO Rooms VALUES (101, '101', 1, 1, 'Available');
INSERT INTO Rooms VALUES (102, '102', 1, 1, 'Occupied');
INSERT INTO Rooms VALUES (103, '103', 1, 2, 'Available');
INSERT INTO Rooms VALUES (104, '201', 2, 2, 'Available');
INSERT INTO Rooms VALUES (105, '202', 2, 3, 'Occupied');
INSERT INTO Rooms VALUES (106, '203', 2, 3, 'Available');
INSERT INTO Rooms VALUES (107, '301', 3, 4, 'Available');
INSERT INTO Rooms VALUES (108, '302', 3, 4, 'Occupied');
INSERT INTO Rooms VALUES (109, '303', 3, 5, 'Available');
INSERT INTO Rooms VALUES (110, '401', 4, 5, 'Available');
INSERT INTO Rooms VALUES (111, '402', 4, 6, 'Occupied');
INSERT INTO Rooms VALUES (112, '403', 4, 6, 'Available');
INSERT INTO Rooms VALUES (113, '501', 5, 7, 'Available');
INSERT INTO Rooms VALUES (114, '502', 5, 8, 'Available');
INSERT INTO Rooms VALUES (115, '503', 5, 8, 'Occupied');

-- TABLE 4: Bookings (15 Records - Child of Customers and Rooms)
INSERT INTO Bookings VALUES (1001, 1, 102, TO_DATE('2024-01-05','YYYY-MM-DD'), TO_DATE('2024-01-08','YYYY-MM-DD'), 3, 'Confirmed');
INSERT INTO Bookings VALUES (1002, 2, 105, TO_DATE('2024-01-10','YYYY-MM-DD'), TO_DATE('2024-01-13','YYYY-MM-DD'), 3, 'Confirmed');
INSERT INTO Bookings VALUES (1003, 3, 108, TO_DATE('2024-01-15','YYYY-MM-DD'), TO_DATE('2024-01-17','YYYY-MM-DD'), 2, 'Confirmed');
INSERT INTO Bookings VALUES (1004, 4, 111, TO_DATE('2024-02-01','YYYY-MM-DD'), TO_DATE('2024-02-05','YYYY-MM-DD'), 4, 'Confirmed');
INSERT INTO Bookings VALUES (1005, 5, 115, TO_DATE('2024-02-10','YYYY-MM-DD'), TO_DATE('2024-02-12','YYYY-MM-DD'), 2, 'Cancelled');
INSERT INTO Bookings VALUES (1006, 6, 103, TO_DATE('2024-02-20','YYYY-MM-DD'), TO_DATE('2024-02-23','YYYY-MM-DD'), 3, 'Confirmed');
INSERT INTO Bookings VALUES (1007, 7, 106, TO_DATE('2024-03-01','YYYY-MM-DD'), TO_DATE('2024-03-04','YYYY-MM-DD'), 3, 'Confirmed');
INSERT INTO Bookings VALUES (1008, 8, 109, TO_DATE('2024-03-10','YYYY-MM-DD'), TO_DATE('2024-03-15','YYYY-MM-DD'), 5, 'Confirmed');
INSERT INTO Bookings VALUES (1009, 1, 110, TO_DATE('2024-03-20','YYYY-MM-DD'), TO_DATE('2024-03-22','YYYY-MM-DD'), 2, 'Confirmed');
INSERT INTO Bookings VALUES (1010, 2, 113, TO_DATE('2024-04-01','YYYY-MM-DD'), TO_DATE('2024-04-03','YYYY-MM-DD'), 2, 'Confirmed');
INSERT INTO Bookings VALUES (1011, 3, 114, TO_DATE('2024-04-10','YYYY-MM-DD'), TO_DATE('2024-04-12','YYYY-MM-DD'), 2, 'Cancelled');
INSERT INTO Bookings VALUES (1012, 4, 101, TO_DATE('2024-04-20','YYYY-MM-DD'), TO_DATE('2024-04-25','YYYY-MM-DD'), 5, 'Confirmed');
INSERT INTO Bookings VALUES (1013, 5, 104, TO_DATE('2024-05-01','YYYY-MM-DD'), TO_DATE('2024-05-04','YYYY-MM-DD'), 3, 'Confirmed');
INSERT INTO Bookings VALUES (1014, 6, 107, TO_DATE('2024-05-10','YYYY-MM-DD'), TO_DATE('2024-05-13','YYYY-MM-DD'), 3, 'Confirmed');
INSERT INTO Bookings VALUES (1015, 7, 112, TO_DATE('2024-05-20','YYYY-MM-DD'), TO_DATE('2024-05-23','YYYY-MM-DD'), 3, 'Confirmed');

-- TABLE 5: Payments (15 Records - Child of Bookings)
INSERT INTO Payments VALUES (2001, 1001, 4500,  TO_DATE('2024-01-05','YYYY-MM-DD'), 'Credit Card', 'Paid');
INSERT INTO Payments VALUES (2002, 1002, 7000,  TO_DATE('2024-01-10','YYYY-MM-DD'), 'UPI',         'Paid');
INSERT INTO Payments VALUES (2003, 1003, 7000,  TO_DATE('2024-01-15','YYYY-MM-DD'), 'Cash',        'Paid');
INSERT INTO Payments VALUES (2004, 1004, 24000, TO_DATE('2024-02-01','YYYY-MM-DD'), 'Debit Card',  'Paid');
INSERT INTO Payments VALUES (2005, 1005, 1800,  TO_DATE('2024-02-10','YYYY-MM-DD'), 'UPI',         'Refunded');
INSERT INTO Payments VALUES (2006, 1006, 4500,  TO_DATE('2024-02-20','YYYY-MM-DD'), 'Cash',        'Paid');
INSERT INTO Payments VALUES (2007, 1007, 10500, TO_DATE('2024-03-01','YYYY-MM-DD'), 'Credit Card', 'Paid');
INSERT INTO Payments VALUES (2008, 1008, 30000, TO_DATE('2024-03-10','YYYY-MM-DD'), 'Net Banking', 'Paid');
INSERT INTO Payments VALUES (2009, 1009, 12000, TO_DATE('2024-03-20','YYYY-MM-DD'), 'UPI',         'Paid');
INSERT INTO Payments VALUES (2010, 1010, 24000, TO_DATE('2024-04-01','YYYY-MM-DD'), 'Credit Card', 'Paid');
INSERT INTO Payments VALUES (2011, 1011, 1800,  TO_DATE('2024-04-10','YYYY-MM-DD'), 'Cash',        'Refunded');
INSERT INTO Payments VALUES (2012, 1012, 7500,  TO_DATE('2024-04-20','YYYY-MM-DD'), 'Debit Card',  'Paid');
INSERT INTO Payments VALUES (2013, 1013, 6600,  TO_DATE('2024-05-01','YYYY-MM-DD'), 'UPI',         'Paid');
INSERT INTO Payments VALUES (2014, 1014, 10500, TO_DATE('2024-05-10','YYYY-MM-DD'), 'Net Banking', 'Paid');
INSERT INTO Payments VALUES (2015, 1015, 13500, TO_DATE('2024-05-20','YYYY-MM-DD'), 'Credit Card', 'Paid');

-- TABLE 6: Reviews (15 Records - Child of Customers and Bookings)
INSERT INTO Reviews VALUES (3001, 1, 1001, 5, 'Excellent stay, very clean rooms',     TO_DATE('2024-01-09','YYYY-MM-DD'));
INSERT INTO Reviews VALUES (3002, 2, 1002, 4, 'Good service and nice staff',          TO_DATE('2024-01-14','YYYY-MM-DD'));
INSERT INTO Reviews VALUES (3003, 3, 1003, 3, 'Average experience, AC was noisy',     TO_DATE('2024-01-18','YYYY-MM-DD'));
INSERT INTO Reviews VALUES (3004, 4, 1004, 5, 'Loved the suite, perfect for family',  TO_DATE('2024-02-06','YYYY-MM-DD'));
INSERT INTO Reviews VALUES (3005, 5, 1005, 2, 'Cancelled trip, refund took long',     TO_DATE('2024-02-13','YYYY-MM-DD'));
INSERT INTO Reviews VALUES (3006, 6, 1006, 4, 'Comfortable room and good food',       TO_DATE('2024-02-24','YYYY-MM-DD'));
INSERT INTO Reviews VALUES (3007, 7, 1007, 5, 'Amazing hospitality will come again',  TO_DATE('2024-03-05','YYYY-MM-DD'));
INSERT INTO Reviews VALUES (3008, 8, 1008, 4, 'Beautiful view from the room',         TO_DATE('2024-03-16','YYYY-MM-DD'));
INSERT INTO Reviews VALUES (3009, 1, 1009, 5, 'Great location and lovely room',       TO_DATE('2024-03-23','YYYY-MM-DD'));
INSERT INTO Reviews VALUES (3010, 2, 1010, 3, 'Penthouse was great but overpriced',   TO_DATE('2024-04-04','YYYY-MM-DD'));
INSERT INTO Reviews VALUES (3011, 3, 1011, 1, 'Had to cancel very disappointing',     TO_DATE('2024-04-13','YYYY-MM-DD'));
INSERT INTO Reviews VALUES (3012, 4, 1012, 4, 'Nice standard room value for money',   TO_DATE('2024-04-26','YYYY-MM-DD'));
INSERT INTO Reviews VALUES (3013, 5, 1013, 5, 'Perfect double room for couple',       TO_DATE('2024-05-05','YYYY-MM-DD'));
INSERT INTO Reviews VALUES (3014, 6, 1014, 4, 'Deluxe room was worth it',             TO_DATE('2024-05-14','YYYY-MM-DD'));
INSERT INTO Reviews VALUES (3015, 7, 1015, 5, 'Family room was spacious and clean',   TO_DATE('2024-05-24','YYYY-MM-DD'));

COMMIT;

-- ============================================================
-- STEP 4: VERIFY ALL TABLES
-- ============================================================
SELECT * FROM Customers;
SELECT * FROM Room_Types;
SELECT * FROM Rooms;
SELECT * FROM Bookings;
SELECT * FROM Payments;
SELECT * FROM Reviews;

-- ============================================================
-- STEP 5: QUERIES FOR MOCK
-- ============================================================

-- Q1: All bookings with customer name and room numberselse
SELECT C.Customer_Name, R.Room_Number, B.Check_In, B.Check_Out, B.Total_Days, B.Booking_Status
FROM Bookings B
JOIN Customers C ON B.Customer_ID = C.Customer_ID
JOIN Rooms R     ON B.Room_ID     = R.Room_ID;

-- Q2: Total revenue collected
SELECT SUM(Amount) AS Total_Revenue
FROM Payments
WHERE Payment_Status = 'Paid';

-- Q3: Number of bookings per customer
SELECT C.Customer_Name, COUNT(B.Booking_ID) AS Total_Bookings
FROM Customers C
JOIN Bookings B ON C.Customer_ID = B.Customer_ID
GROUP BY C.Customer_Name
ORDER BY Total_Bookings DESC;

-- Q4: All rooms with type name and price
SELECT R.Room_Number, R.Floor_No, RT.Type_Name, RT.Price_Per_Day, R.Status
FROM Rooms R
JOIN Room_Types RT ON R.RoomType_ID = RT.RoomType_ID
ORDER BY R.Room_ID;

-- Q5: Customers who gave rating 4 or 5
SELECT C.Customer_Name, V.Rating, V.Comments, V.Review_Date
FROM Reviews V
JOIN Customers C ON V.Customer_ID = C.Customer_ID
WHERE V.Rating >= 4
ORDER BY V.Rating DESC;

-- Q6: Payment details with customer name
SELECT C.Customer_Name, P.Amount, P.Payment_Mode, P.Payment_Status, P.Payment_Date
FROM Payments P
JOIN Bookings B  ON P.Booking_ID  = B.Booking_ID
JOIN Customers C ON B.Customer_ID = C.Customer_ID;

-- Q7: Cancelled bookings
SELECT C.Customer_Name, R.Room_Number, B.Check_In, B.Check_Out
FROM Bookings B
JOIN Customers C ON B.Customer_ID = C.Customer_ID
JOIN Rooms R     ON B.Room_ID     = R.Room_ID
WHERE B.Booking_Status = 'Cancelled';

-- Q8: Average rating given by each customer
SELECT C.Customer_Name, ROUND(AVG(V.Rating), 2) AS Avg_Rating
FROM Reviews V
JOIN Customers C ON V.Customer_ID = C.Customer_ID
GROUP BY C.Customer_Name;
import sqlite3 as sl
import mysql.connector

con = sl.connect('my-test.db')

#query = "SELECT * FROM USER WHERE age <= 22"
query = input("Please enter your query\n\n")

with con:
    data = con.execute(query)
    for row in data:
        print(row)

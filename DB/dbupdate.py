import sqlite3 as sl
import mysql.connector

con = sl.connect('my-test.db')

#sql = 'INSERT INTO USER (id, name, age) values(?, ?, ?)'
#data = [(8, 'Ursula', 21)]

with con:
    #con.executemany(sql, data)
    pass
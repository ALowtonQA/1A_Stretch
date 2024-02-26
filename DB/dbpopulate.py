import sqlite3 as s

con = s.connect('my-test.db')
cur = con.cursor()

sql = 'INSERT INTO USER (name, age) values(?, ?)'
data = [
    ('Fiona', 22)
    ('Bob', 22),
    ('Chris', 23),
    ('Daphne', 40),
    ('Alice', 21),
    ('Edith', 12),
]

cur.executemany(sql, data)

con.commit()
con.close()
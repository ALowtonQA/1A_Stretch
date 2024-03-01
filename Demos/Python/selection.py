x = 10

# if (true) then run the code within 
# otherwise run the code within the "else" block
if (x == 10):
    print("x = 10")
else:
    print("x != 10")


salary = 250000

# this time multiple conditions are checked
# elif means "else if"
# in other words, if the previous condition wasn't true, check this one
# once again, else is at the end to catch everything else
if (salary > 100000):
    print("Band A")
elif (salary > 55000):
    print("Band B")
elif (salary > 32000):
    print("Band C")
elif (salary > 25000):
    print("Band D")
else:
    print("Band E")

# You could use seperate if statements, not connected by "elif" 
# However, this will mean every condition is always checked
# Which couldn result in multiple prints, where you only needed

# if (salary > 100000):
#     print("Band A")

# if(salary > 55000):
#     print("Band B")

# if(salary > 32000):
#     print("Band C")

# if(salary > 25000):
#     print("Band D")

# if(salary <= 25000):
#     print("Band E")
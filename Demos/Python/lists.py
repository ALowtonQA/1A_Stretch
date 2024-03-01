numbers = [1, 2, 3, 4]

names = ["Anoush", "Nandan", "Beth"]

print(numbers[0]) # 1

# This is the long (bad) way of printing every value
# print(names[0]) # Anousg
# print(names[1]) # Nandan
# print(names[2]) # Beth

# this is the dynamic, iterative way of printing every value
#for <variable> in <list>
for name in names:
    print(name)


sum = numbers[0] + numbers[1] + numbers[2] + numbers[3]

print(sum) # 10

print(len(names)) # 3

# first index of a list is always 0
# final index of a list is always len(list) - 1

# i = 0 # index 
# while (i < len(numbers)):
#     print("index", i, "=", numbers[i])
#     i += 1

#for i in range(4) - 0,1,2,3
for i in range(len(numbers)):
    print("index", i, "=", numbers[i])

myName = "Anoush"

for char in myName:
    print(char)


# append to the list
numbers.append(5) # 1, 2, 3, 4, 5

#for i in range(5) - 0,1,2,3,4
for i in range(len(numbers)):
    print("index", i, "=", numbers[i])


fruits = []

fruits.append("apple")
fruits.append("pear")
fruits.append("grape")

print(fruits)

fruits[0] = "pineapple"

print(fruits)
# if ("apple" in fruits):
#     print("apple is in the list!")

# for fruit in fruits:
#     print(fruit)

# fruits.remove("pear")

# for fruit in fruits:
#     print(fruit) 

# del(fruits[1])

# for fruit in fruits:
#     print(fruit) 


letters = ["g", "d", "l", "t", "a", "z"]

letters.sort(reverse = True)

print(letters)

csv = "anoush,nandan,alex"
names = csv.split(",")
print(names)

sentence = "the quick brown fox"
words = sentence.split(" ")
print(len(words))







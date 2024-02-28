def makeFullName(first, last):
    fullName = first + " " + last
    return fullName

print(makeFullName("Anoush", "Lowton"))

def makeFullNameNoReturn(first, last):
    fullName = first + " " + last
    print(fullName)

makeFullNameNoReturn("Bob", "Smith")

def functionNoParams():
    print("hello")

functionNoParams()

def addNumbers(*nums):
    total = 0

    for num in nums:
        total += num

    print("total =", total)

addNumbers(1, 2, 3)
addNumbers(1, 2, 3, 4, 5)
addNumbers(1, 2, 3, 4, 5, 6)

def sayLocation(name="someone", location="somewhere"):
    print(name, "is from", location)

sayLocation("Anoush", "England")
sayLocation()
sayLocation("Anoush")
sayLocation(location="Spain")
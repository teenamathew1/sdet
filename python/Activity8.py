numbers = list(input("Enter a sequence of comma separated values: ").split(","))

#print the list
print("Numbers is list is : ",numbers)

firstnum = numbers[0]
lastnum = numbers[-1]

if(firstnum == lastnum):
    print("True ")
else:
    print("False")
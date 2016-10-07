n = int(input())
inputs = input().split(" ")

mySet = set()
for i in inputs:
    mySet.add(int(i))

myList = list(mySet)
myList.sort(reverse=True)

print(myList[1])

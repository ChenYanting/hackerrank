n = int(input())
inputs = input().split(" ")

myCollection = []
for i in inputs:
    myCollection.append(int(i))

print(hash(tuple(myCollection)))

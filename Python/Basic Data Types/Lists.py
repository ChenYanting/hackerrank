def operation(myList: list, command: str, args: list):
    if command == "insert":
        myList.insert(int(args[0]), int(args[1]))
    elif command == "print":
        print(myList)
    elif command == "remove":
        myList.remove(int(args[0]))
    elif command == "append":
        myList.append(int(args[0]))
    elif command == "sort":
        myList.sort()
    elif command == "pop":
        myList.pop()
    elif command == "reverse":
        myList.reverse()
    else:
        raise RuntimeError("Unsupported command: %s", command)


n = int(input())
myList = []
for i in range(n):
    inputs = input().split(" ")
    command = inputs[0]
    inputs.remove(command)
    operation(myList, command, inputs)

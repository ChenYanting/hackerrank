def average(nums: list):
    sum = 0

    for num in nums:
        sum += float(num)

    return sum / len(nums)


n = int(input())
percentage = dict()
for i in range(n):
    inputs = input().split(" ")
    name = inputs[0]
    inputs.remove(name)
    percentage[name] = average(inputs)

print("%.2f" % percentage.get(input()))

n = int(input())

grades_summary = dict()
for i in range(n):
    name = input()
    grade = float(input())
    if grades_summary.get(grade) is None:
        grades_summary[grade] = list()
    grades_summary[grade].append(name)

grades = list(grades_summary.keys())
grades.sort()
second_lowest_grade = grades[1]

names_with_second_lowest_grade = list(grades_summary.get(second_lowest_grade))
names_with_second_lowest_grade.sort()

for name in names_with_second_lowest_grade:
    print(name)

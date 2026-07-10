
def execute(inst : list[str]) -> list[int]:
    stack : list[int] = []
    for step in inst :
        if step == "peek":
            print("peek : " + str(stack[-1]))
        elif step == "pop":
            stack.pop()
        else: 
            data =  int(step[5:])
            stack.append(data)
    return stack

if __name__ == "__main__":
    print("Enter number of elements in stack")
    inst = [input() for _ in range(int(input()))]
    result = execute(inst)
    print("Result : "  + " ".join(map(str,result)))
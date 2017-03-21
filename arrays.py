
# should return the number of even numbers
# in the array A
def countEven(A):
	count = 0
	for i in A:
		if (i % 2) == 0:
			count = count + 1
		else:
			count = count
		return(count)

# should return the sum of every Nth number,
# starting with the elemenet at index 0
def sumEveryN(A,N):
	sum = 0
	B = A[::N]
	for i in B:
		sum = sum + i
	return sum
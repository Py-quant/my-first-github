
# this function prints num_stars stars followed
# by a newline character
def printStars(num_stars):
	for i in range(0,num_stars):
		print ("*")
	print

def printSquare(width):
	for i in range(0,width):
		print ("*" * width)
	printSquare

def printTriangle(width):
	for i in range(0,width + 1):
		print('*' * i)
	printTriangle

def printTriangleRecursive(cur_width,width):	
	if cur_width > 0:
		printTriangleRecursive(cur_width-1, width)
		print(width * cur_width)


def printFlippedTriangle(width):
    for i in range(width, 0, -1):
        print('*' * i)
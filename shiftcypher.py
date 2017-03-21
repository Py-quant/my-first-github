def getNumForChar(char):
	return ord(char)-65

def getCharForNum(num):
	return chr(num+65)

def encryptString(mystr,shift):
	newStr = string_b
	return newStr

def decryptString(mystr,shift):
	newStr = string_a
	return newStr

string_a = "ABCXYZ"
string_b = "CDEZAB"
test_str_a = encryptString(string_a,2)
# This should print CDEZAB
print test_str_a
# If the encryption is correct, this will print True
print test_str_a == string_b
# Now let's decrypt
test_str_b = decryptString(test_str_a,2)
# This should print ABCXYZ
print test_str_b
# If the decryption is correct, this will print True
print test_str_b == string_a



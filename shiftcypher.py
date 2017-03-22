#Faaris Kathrada
#V00863301
#CSC 106


# This function will return a number between 0 and 25
# that corresponds to the position in the alphabet of
# the character.
def getNumForChar(char):
	return ord(char)-65

# This function will return a character that appears at
# position num in the alphabet.
def getCharForNum(num):
	return chr(num+65)




def encryptString(string_a,shift):

    alphabet=["A","B","C","D","E","F","G","H","I","J","K","L",
    "M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"]

    dic={}
    for i in range(0,len(alphabet)):
        dic[alphabet[i]]=alphabet[(i+shift)%len(alphabet)]

   
    ciphertext=""
    for l in string_a.upper():
        if l in dic:
            l=dic[l]
        ciphertext+=l

    return ciphertext

def decryptString(string_b,shift):
	shift = string_b 
	return shift

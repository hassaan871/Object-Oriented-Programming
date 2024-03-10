class MyClass:
    def __init__(self):
        #Single underscore indicates a weak internal use variable
        self._my_variable = None

    #Getter method
    def get_my_variable(self):
        return self._my_variable

    #Setter method
    def set_my_variable(self, value):
        self._my_variable = value

#Creating an instance of the class
obj = MyClass()

print(obj.get_my_variable)

obj.set_my_variable(42)

print(obj._my_variable)


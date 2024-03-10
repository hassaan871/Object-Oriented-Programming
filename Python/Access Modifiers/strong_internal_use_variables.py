class MyClass():
    def __init__(self):
        # Double underscore indicates a strong internal use variable
        self.__my_variable = None

    def get__my_variable(self):
        return self.__my_variable
    
    def set__my_variable(self, value):
        self.__my_variable = value

# Creating an instance of the class
obj = MyClass()

obj.set__my_variable(42)

obj._MyClass__my_variable = 32

print(obj.get__my_variable())

print(obj.__my_variable)
# This will result in AttributeError because of name mangling

print(obj._MyClass__my_variable)
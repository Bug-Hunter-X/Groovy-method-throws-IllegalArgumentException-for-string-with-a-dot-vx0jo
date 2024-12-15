```groovy
class MyClass {
    def myMethod(String param) {
        if (param == null) {
            return "Null parameter"
        } else if (param.length() == 0) {
            return "Empty parameter"
        } else if (param.contains(".")) {
            return "Parameter contains a dot (.), invalid input"
        } else {
            return "Parameter is valid: "+ param
        }
    }
}

// Example usage
MyClass myObj = new MyClass()
println myObj.myMethod(null)
println myObj.myMethod("")
println myObj.myMethod("abc")
println myObj.myMethod("abc.def")
```
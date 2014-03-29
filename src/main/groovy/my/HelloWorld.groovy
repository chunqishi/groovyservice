package my

interface IHelloWorld {
    String hello(arg)
}

class HelloWorld implements IHelloWorld{
    String hello(arg) {
        return "hi:" + arg
    }
}

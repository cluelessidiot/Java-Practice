class HelloWorld 
{ 
    // Your program begins with a call to main(). 
    // Prints "Hello, World" to the terminal window. 
    public static void main(String args[]) 
    { 
        System.out.println("Hello, World"); 
        for(int i = 0; i < args.length; i++) { //above loop is to rint the arguments with javac filename.java arg1,agr2,..{args store arg1,2,..}
            System.out.println(args[i]);
    } 
}} 


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

// Singleton is a design pattern that restricts the instantiation of a class to 1 single object
class Singleton{
    // make the actual instance
    private static final Singleton INSTANCE = new Singleton();
    
    String str = "Hello I am a singleton! Let me say hello world to you";
    
    // overwrite the constructor to just be empty so no new classes can be created
    private Singleton() {}
    
    public static Singleton getSingleInstance()
    {
        return INSTANCE;
    }
    
    
    
    
}
